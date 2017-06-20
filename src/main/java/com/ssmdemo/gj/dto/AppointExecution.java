package com.ssmdemo.gj.dto;
/**
 * 封装预约执行结果
 * @author GuoJie
 *
 */

import com.ssmdemo.gj.entity.Appointment;
import com.ssmdemo.gj.enums.AppointStateEnum;

public class AppointExecution {
	//图书ID
	private long bookId;
	//预约结果状态
	private int state;
	//状态标识
	private String stateInfo;
	//预约成功对象
	private Appointment appointment;

	public AppointExecution() {
	}
	//预约失败构造
	public AppointExecution(long bookId,AppointStateEnum stateEnum) {
		this.bookId = bookId;
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
	}
	
	//预约成功构造
	public AppointExecution(long bookId, AppointStateEnum stateEnum, Appointment appointment) {
		this.bookId = bookId;
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
		this.appointment = appointment;
	}
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getStateInfo() {
		return stateInfo;
	}
	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}
	public Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
	@Override
	public String toString() {
		return "AppointExecution [bookId=" + bookId + ", state=" + state + ", stateInfo=" + stateInfo + ", appointment="
				+ appointment + "]";
	}
	
	
	
	
	
}
