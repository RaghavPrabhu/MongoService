/**
 * 
 */
package com.raghav.app.datastore.service.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raghav.app.datastore.dao.EnterpriseDetailsDao;
import com.raghav.app.datastore.dataobject.EnterpriseDetailsDO;
import com.raghav.app.datastore.service.modal.EnterpriseDetailRequest;

/**
 * @author Raghav Prabhu
 *  @version 1.0
 *
 */
@Service
public class EnterpriseDetailService  {
	
	@Autowired
	private EnterpriseDetailsDao enterpriseDetailsDao;
	
	public void addEnterpriseDetail(EnterpriseDetailRequest enterpriseDetailRequest){
		 
		EnterpriseDetailsDO enterpriseDetailsDO=new EnterpriseDetailsDO();
		enterpriseDetailsDO.setId(enterpriseDetailRequest.getId());
		enterpriseDetailsDO.setUserName(enterpriseDetailRequest.getUserName());
		enterpriseDetailsDO.setCmpShortId(enterpriseDetailRequest.getCmpShortId());
		enterpriseDetailsDO.setCmpShortName(enterpriseDetailRequest.getCmpShortName());
		enterpriseDetailsDO.setCompanyId(enterpriseDetailRequest.getCompanyId());
		enterpriseDetailsDO.setCompanyName(enterpriseDetailRequest.getCompanyName());
		enterpriseDetailsDO.setEmailId(enterpriseDetailRequest.getEmailId());
		enterpriseDetailsDO.setEnableCCS(enterpriseDetailRequest.getEnableCCS());
		enterpriseDetailsDO.setPassword(enterpriseDetailRequest.getPassword());
		enterpriseDetailsDO.setStatus(enterpriseDetailRequest.getStatus());
		enterpriseDetailsDao.save(enterpriseDetailsDO);		 	
		
	}
	
	
	public EnterpriseDetailsDO[] getEnterpriseDetails(){
		Collection<EnterpriseDetailsDO> detailsDOs=enterpriseDetailsDao.getAll(EnterpriseDetailsDO.class);
		EnterpriseDetailsDO[] enterpriseDetailsDOs=detailsDOs.toArray(new EnterpriseDetailsDO[detailsDOs.size()]);
		return enterpriseDetailsDOs;
	}
	

}
