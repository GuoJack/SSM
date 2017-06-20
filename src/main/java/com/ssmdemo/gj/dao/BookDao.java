package com.ssmdemo.gj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssmdemo.gj.entity.Book;

public interface BookDao {
	/**
	 * 根据图书ID查询图书
	 * @param bookId
	 * @return
	 */
	Book queryByBookID(long bookId);
	/**
	 * 查询所有图书
	 * @param offset 查询起始位置
	 * @param limit 查询条数
	 * @return
	 */
	List<Book> queryAll(@Param("offset") int offset, @Param("limit")int limit);
	/**
	 * 根据图书ID减少该书藏书数量
	 * @param bookId
	 * @return 如果影响行数等于>1，表示更新的记录行数
	 */
	int updateBooksNumberByBookId(long bookId);
}
