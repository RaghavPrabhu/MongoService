
package com.raghav.app.datastore.base.exception;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * This class is to be used to throw any new exceptions related to
 * data store system configuration or to wrap with any generic java exceptions.
 * 
 * @author Raghav Prabhu
 * @version 1.0
 *
 */
public class DataStoreSystemException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 7554013822371606202L;
	private static final Log LOG = LogFactory.getLog(DataStoreSystemException.class);

	/**
	 * This constructor is used when a new exception is being thrown.
	 * @param message - description of the exception
	 */
	public DataStoreSystemException(String message) {
		super(message);
		LOG.error(message);
	}

	/**
	 * This constructor is used to wrap another caught exception.
	 * @param message - description of the exception
	 * @param cause - the exception to be wrapped
	 */
	public DataStoreSystemException(String message, Throwable cause) {
		super(message, cause);
		LOG.error(message, cause);
	}

}
