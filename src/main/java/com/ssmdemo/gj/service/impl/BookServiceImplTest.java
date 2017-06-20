package com.ssmdemo.gj.service.impl;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ssmdemo.gj.BaseTest;
import com.ssmdemo.gj.dto.AppointExecution;
import com.ssmdemo.gj.entity.Book;
import com.ssmdemo.gj.service.BookService;

public class BookServiceImplTest extends BaseTest {
	@Autowired
	private BookService bookService;
	
	@Test
	public void testBookService(){
//		int bookId = 1001;
//		Book book = bookService.getBookByBookId(bookId);
//		List<Book> list = bookService.getAllBooks();
//		for(int i=0;i<list.size();i++){
//			Book book = list.get(i);
//			System.out.println(book);
//		}
		int bookId = 1000;
		int studentId = 654;
		AppointExecution appoint = bookService.appointBooks(bookId, studentId);
		System.out.println(appoint);
	}
}
