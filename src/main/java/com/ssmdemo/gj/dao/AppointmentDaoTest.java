package com.ssmdemo.gj.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ssmdemo.gj.BaseTest;
import com.ssmdemo.gj.entity.Appointment;

public class AppointmentDaoTest extends BaseTest {
	@Autowired
	private AppointmentDao appointmentDao;
//	@Test
//	public void testInsertAppointment(){
//		int t = appointmentDao.insertAppointment(1000, 456);
//		System.out.println(t);
//	}
	@Test
	public void testQueryByKeyWithBook(){
		long bookId = 1000;
		long studentId = 456;
		Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);
		System.out.println(appointment);
	}
	
}
