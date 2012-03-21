/**
 * 
 */
package com.raghav.app.datastore.service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.raghav.app.datastore.service.exception.DataNotFoundException;
import com.raghav.app.datastore.service.exception.InternalServerExcption;
import com.raghav.app.datastore.service.exception.InvalidDataException;
import com.raghav.app.datastore.service.exception.InvalidRequestException;
import com.raghav.app.datastore.service.exception.InvalidUserException;

/**
 * @author Raghav Prabhu
 *  @version 1.0
 *
 */
public class BaseController {
	
	@ExceptionHandler(value=InvalidUserException.class)
	@ResponseStatus(value=HttpStatus.UNAUTHORIZED, reason="Invalid Username/Password")
	public void handleAuthenticationException(InvalidUserException e) {}
	
	@ExceptionHandler(value=InvalidRequestException.class)
	@ResponseStatus(value=HttpStatus.UNAUTHORIZED, reason="Invalid Input")
	public void handleInvalidRestaurantException(InvalidRequestException e) {}
	
	@ExceptionHandler(value=InvalidDataException.class)
	@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="Invalid Request Data")
	public void handleInvalidDataException(InvalidDataException e) {}
	
	@ExceptionHandler(value=DataNotFoundException.class)
	@ResponseStatus(value=HttpStatus.NO_CONTENT, reason="Data Not Found")
	public void handleDataNotFoundException(DataNotFoundException e) {}
	
	@ExceptionHandler(value=InternalServerExcption.class)
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR, reason="Internal Error, please contact Administrator")
	public void handleInternalServiceException(InternalServerExcption e) {}
	
}

