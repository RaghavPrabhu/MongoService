/**
 * 
 */
package com.raghav.app.datastore.service.exception;

/**
 * DataNotFoundException.java
 *
 * @author Raghav Prabhu
 * @version 1.0
 */
public class DataNotFoundException extends Exception {
	
	private static final long serialVersionUID = 548612841302639898L;

	public DataNotFoundException() {
		super();
	}
	
	public DataNotFoundException(String message) {
		super(message);
	}

}
