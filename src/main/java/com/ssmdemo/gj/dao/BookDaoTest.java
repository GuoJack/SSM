package com.ssmdemo.gj.dao;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import org.junit.Test;

import com.ssmdemo.gj.BaseTest;
import com.ssmdemo.gj.entity.Book;

public class BookDaoTest extends BaseTest {
	@Autowired
	private BookDao bookDao;
	
	@Test
	public void testQueryByBookID(){
		long bookId = 1000;
		Book book = bookDao.queryByBookID(bookId);
		System.out.println(book);
	}
	@Test
	public void testQueryAll(){
		List<Book> books = bookDao.queryAll(0, 4);
		for(Book book:books){
			System.out.println(book);
		}
	}
	@Test
	public void testUpdateBooksNumberByBookId(){
		int t = bookDao.updateBooksNumberByBookId(1000);
		System.out.println(t);
	}
}
