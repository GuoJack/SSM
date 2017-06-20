package com.ssmdemo.gj.entity;

import java.util.Date;

public class Appointment {
	private long bookId;
	private long studentId;
	private Date appointTime;
	private Book book;

	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public Date getAppointTime() {
		return appointTime;
	}
	public void setAppointTime(Date appointTime) {
		this.appointTime = appointTime;
	}
	
	@Override
	public String toString() {
		return "Appointment [bookId=" + bookId + ", studentId=" + studentId + ", appointTime=" + appointTime + ", book="
				+ book + "]";
	}
	
	
	
	
}
