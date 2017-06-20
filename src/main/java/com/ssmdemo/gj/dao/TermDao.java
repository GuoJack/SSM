package com.ssmdemo.gj.dao;

import com.ssmdemo.gj.entity.Term;

public interface TermDao {
	/**
	 * 保存卫星影像基础信息
	 * @param term
	 * @return
	 */
	int saveStaProduct(Term term); 
}
