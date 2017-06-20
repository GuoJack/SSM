package com.ssmdemo.gj.exception;
/**
 * 预约业务异常
 *
 */
public class AppointException extends RuntimeException {

	public AppointException(String message, Throwable cause) {
		super(message, cause);
	}

	public AppointException(String message) {
		super(message);
	}
	
}
