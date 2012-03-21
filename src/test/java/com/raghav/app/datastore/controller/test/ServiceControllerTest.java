/**
 * 
 */
package com.raghav.app.datastore.controller.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.raghav.app.datastore.base.test.AbstractBaseTest;
import com.raghav.app.datastore.dataobject.EnterpriseDetailsDO;
import com.raghav.app.datastore.service.controller.ServiceController;
import com.raghav.app.datastore.service.modal.EnterpriseDetailRequest;

/**
 * @author Raghav Prabhu
 *  @version 1.0
 *
 */
public class ServiceControllerTest extends AbstractBaseTest {

	@Autowired
	private ServiceController serviceController;
	
	@Test
	public void controllerTest(){
		EnterpriseDetailRequest enterpriseDetailsRequest=new EnterpriseDetailRequest();
		enterpriseDetailsRequest.setId("ED1001235");
		enterpriseDetailsRequest.setUserName("RaghavPrabhu");
		enterpriseDetailsRequest.setCmpShortId("RAGHCMP");
		enterpriseDetailsRequest.setCmpShortName("RAGMOB");
		enterpriseDetailsRequest.setCompanyId("RAGANMBR");
		enterpriseDetailsRequest.setCompanyName("RAGHAV Enterprise");
		enterpriseDetailsRequest.setEmailId("RaghavPrabhu06@gmail.com");
		enterpriseDetailsRequest.setEnableCCS("ACTIVE");
		enterpriseDetailsRequest.setPassword("password");
		enterpriseDetailsRequest.setStatus(1);
		serviceController.addEnterpriseDetails(enterpriseDetailsRequest);
	}
	
	@Test
	public void getEnterpriseDetails(){
		  
		EnterpriseDetailsDO[] detailsDOs=serviceController.getDetails();
		System.out.println(detailsDOs.length);
	}
	
}
