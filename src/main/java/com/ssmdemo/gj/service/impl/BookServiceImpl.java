package com.ssmdemo.gj.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssmdemo.gj.dao.AppointmentDao;
import com.ssmdemo.gj.dao.BookDao;
import com.ssmdemo.gj.dto.AppointExecution;
import com.ssmdemo.gj.entity.Appointment;
import com.ssmdemo.gj.entity.Book;
import com.ssmdemo.gj.enums.AppointStateEnum;
import com.ssmdemo.gj.exception.AppointException;
import com.ssmdemo.gj.exception.NoNumberException;
import com.ssmdemo.gj.exception.RepeatAppointException;
import com.ssmdemo.gj.service.BookService;
@Service
public class BookServiceImpl implements BookService {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private BookDao bookDao;
	
	@Autowired
	private AppointmentDao appointmentDao;

	@Override
	public Book getBookByBookId(long bookId) {
		return bookDao.queryByBookID(bookId);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookDao.queryAll(0, 1000);
	}

	@Override
	@Transactional
	/**
     * 使用注解控制事务方法的优点： 1.开发团队达成一致约定，明确标注事务方法的编程风格
     * 2.保证事务方法的执行时间尽可能短，不要穿插其他网络操作，RPC/HTTP请求或者剥离到事务方法外部
     * 3.不是所有的方法都需要事务，如只有一条修改操作，只读操作不需要事务控制
     */
	public AppointExecution appointBooks(long bookId, long studentId) {
		try {
			int num = bookDao.updateBooksNumberByBookId(bookId);
			if (num <= 0) {//图书库存不足
//				return new AppointExecution(bookId,AppointStateEnum.NO_NUMBER);
				throw new NoNumberException("no number");
			}else {
				int appnum = appointmentDao.insertAppointment(bookId, studentId);
				if (appnum <= 0) {//预约重复
//					return new AppointExecution(bookId, AppointStateEnum.REPEAT_APPOINT);
					throw new RepeatAppointException("repeat appoint");
				}else{//预约成功
					Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);
					return new AppointExecution(bookId, AppointStateEnum.SUCCESS, appointment);
				}
			}
			// 要先于catch Exception异常前先catch住再抛出，不然自定义的异常也会被转换为AppointException，导致控制层无法具体识别是哪个异常
		} catch (NoNumberException e1) {
			throw e1;
		} catch (RepeatAppointException e2) {
			throw e2;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
            // 所有编译期异常转换为运行期异常
            //return new AppointExecution(bookId, AppointStateEnum.INNER_ERROR);//错误写法
            throw new AppointException("appoint inner error:" + e.getMessage());
		}
	}
}
