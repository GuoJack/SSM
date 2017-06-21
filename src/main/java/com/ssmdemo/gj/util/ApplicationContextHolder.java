package com.ssmdemo.gj.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.util.Assert;

public class ApplicationContextHolder implements ApplicationContextAware{
	private static ApplicationContext applicationContext;
	
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		Assert.isNull(applicationContext,"ApplicationContext alread holden");
		applicationContext = ctx;
	}

	public static ApplicationContext getApplicationContext() {
		Assert.notNull(applicationContext,"applicationContext must be not null!");
		return applicationContext;
	}
	
	public static Object getBean(String name) {
		return getApplicationContext().getBean(name);
	}
	
	public static void autowireBeanProperties(Object existingBean, int autowireMode, boolean dependencyCheck) {
		 getApplicationContext().getAutowireCapableBeanFactory().autowireBeanProperties(existingBean, autowireMode, dependencyCheck);
	}
	
}
