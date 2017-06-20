package com.ssmdemo.gj.dto;
/**
 * 封装JSON对象,并且设计成泛型
 * @author GuoJie
 *
 */
public class Result<T> {
	private Boolean success;//是否成功标志
	private T data;//成功时返回的数据
	private String error;//错误信息
	
	public Result() {
	}

	public Result(Boolean success, T data) {
		this.success = success;
		this.data = data;
	}

	public Result(Boolean success, String error) {
		this.success = success;
		this.error = error;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	
	
	
}
