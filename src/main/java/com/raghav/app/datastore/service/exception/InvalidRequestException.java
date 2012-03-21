package com.raghav.app.datastore.service.exception;

/**
 * InvalidRequestException.java
 *
 * @author Raghav Prabhu
 * @version 1.0
 */


public class InvalidRequestException extends RuntimeException {
	
	private static final long serialVersionUID = 5742097478780695072L;

	public InvalidRequestException() {
		super();
	}
	
	public InvalidRequestException(String message) {
		super(message);
	}
}
