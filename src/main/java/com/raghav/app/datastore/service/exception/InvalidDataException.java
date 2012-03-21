package com.raghav.app.datastore.service.exception;

/**
 * InvalidDataException.java
 *
 * @author Raghav Prabhu
 * @version 1.0
 */

public class InvalidDataException extends RuntimeException {
	
	private static final long serialVersionUID = -7381536009124102874L;

	public InvalidDataException() {
		super();
	}
	
	public InvalidDataException(String message) {
		super(message);
	}
}
