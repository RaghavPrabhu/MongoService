/**
 * 
 */
package com.raghav.app.datastore.service.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.raghav.app.datastore.base.test.AbstractBaseTest;
import com.raghav.app.datastore.service.modal.EnterpriseDetailRequest;
import com.raghav.app.datastore.service.service.EnterpriseDetailService;

/**
 * @author Raghav Prabhu
 *  @version 1.0
 *
 */
public class EnterpriseDetailServiceTest extends AbstractBaseTest {
	
  @Autowired
  private EnterpriseDetailService enterpriseDetailService;
	
  @Test
	public void enterpriseServiceTest(){
		EnterpriseDetailRequest enterpriseDetailsDO=new EnterpriseDetailRequest();
		enterpriseDetailsDO.setId("ED1002");
		enterpriseDetailsDO.setUserName("RaghavPrabhu");
		enterpriseDetailsDO.setCmpShortId("RAGHCMP");
		enterpriseDetailsDO.setCmpShortName("RAGMOB");
		enterpriseDetailsDO.setCompanyId("RAGANMBR");
		enterpriseDetailsDO.setCompanyName("RAGHAV Enterprise");
		enterpriseDetailsDO.setEmailId("RaghavPrabhu06@gmail.com");
		enterpriseDetailsDO.setPassword("password");
		enterpriseDetailsDO.setStatus(1);
		enterpriseDetailService.addEnterpriseDetail(enterpriseDetailsDO);
  }

}
