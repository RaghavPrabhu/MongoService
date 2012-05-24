/**
 * 
 */
package com.raghav.app.datastore.base.exception;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * This class is to be used to throw any new exceptions related to data 
 * access.
 * 
 * @author Raghav Prabhu
 * @version 1.0
 *
 */
public class DataAccessException extends DataStoreSystemException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 4521782309625407560L;
	private static final Log LOG = LogFactory.getLog(DataAccessException.class);

	/**
	 * @param message
	 */
	public DataAccessException(String message) {
		super(message);
		LOG.error(message);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public DataAccessException(String message, Throwable cause) {
		super(message, cause);
		LOG.error(message, cause);
	}

}
