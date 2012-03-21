/**
 * 
 */
package com.raghav.app.datastore.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.raghav.app.datastore.dataobject.EnterpriseDetailsDO;
import com.raghav.app.datastore.service.exception.InvalidRequestException;
import com.raghav.app.datastore.service.modal.EnterpriseDetailRequest;
import com.raghav.app.datastore.service.service.EnterpriseDetailService;


/**
 * @author Raghav Prabhu
 *  @version 1.0
 *
 */
@Controller
@RequestMapping("/base")
public class ServiceController extends BaseController {
	
	@Autowired
	private EnterpriseDetailService enterpriseDetailService;
	
	@RequestMapping(value="/enterprisedetail/add", method=RequestMethod.POST, headers="Accept=application/json")
	@ResponseStatus(HttpStatus.OK)
	public void addEnterpriseDetails(@RequestBody EnterpriseDetailRequest request) {
		   
		String id=request.getId();
		if((null==id)||(id.trim().length()<=0)){
			throw new InvalidRequestException("Enterprise ID cannot be null or empty");
		}
		
		enterpriseDetailService.addEnterpriseDetail(request);
		
	}
	
	@RequestMapping(value="/enterprisedetail/get", method=RequestMethod.GET, headers="Accept=application/json")
	public @ResponseBody EnterpriseDetailsDO[] getDetails(){
		return enterpriseDetailService.getEnterpriseDetails();
	}
	

}
