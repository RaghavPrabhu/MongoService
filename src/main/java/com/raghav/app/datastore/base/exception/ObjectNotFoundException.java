package com.raghav.app.datastore.base.exception;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * This class is to be used to throw any new exceptions related to data 
 * object not found in persistent.
 * 
 * @author Raghav Prabhu
 * @version 1.0
 *
 */
public class ObjectNotFoundException extends DataStoreSystemException {
    /**
	 * 
	 */
	private static final long serialVersionUID = -8989311696277359L;
	private static final Log LOG = LogFactory.getLog(ObjectNotFoundException.class);

	/**
	 * @param message
	 */
	public ObjectNotFoundException(String message) {
		super(message);
		LOG.error(message);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ObjectNotFoundException(String message, Throwable cause) {
		super(message, cause);
		LOG.error(message, cause);
	}

}
