package com.raghav.app.datastore.service.exception;

/**
 * InvalidUserException.java
 *
 * @author Raghav Prabhu
 * @version 1.0
 */


public class InvalidUserException extends RuntimeException {
	
	private static final long serialVersionUID = -3740975006857107977L;

	public InvalidUserException() {
		super();
	}
	
	public InvalidUserException(String message) {
		super(message);
	}
}
