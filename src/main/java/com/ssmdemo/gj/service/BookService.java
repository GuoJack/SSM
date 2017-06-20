package com.ssmdemo.gj.service;
/**
 * 业务接口：站在"使用者"角度设计接口 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 */

import java.util.List;

import com.ssmdemo.gj.dto.AppointExecution;
import com.ssmdemo.gj.entity.Book;

public interface BookService {
	/**
	 * 查询一本图书
	 * @param bookId
	 * @return
	 */
	Book getBookByBookId(long bookId);
	/**
	 * 查询所有图书
	 * @return
	 */
	List<Book> getAllBooks();
	/**
	 * 预约图书
	 * @param bookId
	 * @param studentId
	 * @return
	 */
	AppointExecution appointBooks(long bookId,long studentId);
}
