package com.ssmdemo.gj.util;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LoginUser implements HttpSessionBindingListener { 
	private static ThreadLocal<LoginUser> currentLoginUser = new ThreadLocal<LoginUser>();
	private static final Log log = LogFactory.getLog(LoginUser.class);
	private static final String KEY = "LOGIN_USER_INFO";
	
	private LoginUser(String uName){
		this.userName = uName;
	}
	
	/**
	 * 登陆,并返回"当前登陆的用户"对象
	 * @param session HttpSession会话
	 * @param userId 用户ID
	 * @return 返回当前登陆的用户对象
	 */
    public static LoginUser login(HttpSession session,String userName) {
    	LoginUser user =  new LoginUser(userName);
    	setCurrentLoginUser(user);
    	session.setAttribute(KEY, user);
    	return user;
    }
    /**
     * 取得当前登陆的用户
     * @param session HttpSession会话
     * @return  返回当前登陆用户对象
     */
	public static LoginUser getLoginUser(HttpSession session) {
		if (session == null) {
			return null;
		} else {
			Object value = session.getAttribute(KEY);
			return (LoginUser) value;
		}
	}
	
	
    public static void logOutCurrentUser (HttpSession session) {
  	   LoginUser.removeCurrentLoginUser();
  	   session.removeAttribute(KEY);
  	   session.invalidate();
  	   session = null;
     }
     
	
	public static LoginUser getCurrentLoginUser() {
		return currentLoginUser.get();
	}

	public static void refershCurrentUser(HttpSession session){
		currentLoginUser.set(getLoginUser(session));
	}
	public static void setCurrentLoginUser(LoginUser user) {
		currentLoginUser.set(user);
	}
	
	
	public static void removeCurrentLoginUser () {
		currentLoginUser.remove();
	}
	
	
    private long ctime_ = 0 ;
	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		ctime_ = System.currentTimeMillis();
		log.info("LoginUser Instance is bounded" + " , session name="+ event.getName() + " , HttpSession#toString() ="+ event.getSession() + " , employee_code=" + getUserName());

	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
	 	//HttpSession session = event.getSession();
		log.info("LoginUser Instance is unbounded" + " , session name=" + event.getName() + " , HttpSession#toString()=" + event.getSession() + " , employee_code=" + getUserName() + " , life time=" + (long) ((System.currentTimeMillis() - ctime_) / 1000 )+ "[sec]");

	}
	
	
	
	private String userName;
	private int userId;
	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
