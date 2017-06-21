package com.ssmdemo.gj.dao;

import java.io.File;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ssmdemo.gj.BaseTest;
import com.ssmdemo.gj.entity.Term;

public class TermDaoTest extends BaseTest {
	@Autowired
	private TermDao termDao;
	
	@Test
	public void test(){
		Term term = new Term();
		term.setSatelliteId("GF1");
		int index = termDao.saveStaProduct(term);
		System.out.println(index);
	}
}
