/**
 * 
 */
package com.raghav.app.datastore.service.exception;

/**
 * @author Raghav Prabhu
 *  @version 1.0
 *
 */
public class InternalServerExcption extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2958936342643109453L;

	/**
	 * 
	 */
	public InternalServerExcption() {
		super();
	}

	/**
	 * @param message
	 */
	public InternalServerExcption(String message) {
		super(message);
	}
	
	

}
