/**
 * 
 */
package com.raghav.app.datastore.dataobject.test;

import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.raghav.app.datastore.base.test.AbstractBaseTest;
import com.raghav.app.datastore.dao.AdminDao;
import com.raghav.app.datastore.dataobject.AdminDO;
import com.raghav.app.datastore.utils.HCSConstants;

/**
 * @author Raghav Prabhu
 *  @version 1.0
 *
 */
public class AdminTest extends AbstractBaseTest {

	@Autowired
	public AdminDao adminDao;
	
	@Test
	public void saveAdmin(){
		 AdminDO adminDO=new AdminDO();
		adminDO.setId("RaghavTest2322s");
		 adminDO.setUserName("RaghavPrabhu");
		 adminDO.setPassword("password");
		 adminDO.setEmailId("Raghav@gmail.com");
		 adminDO.setAdminType(HCSConstants.ADMIN);
		 adminDO.setAccess(HCSConstants.ADMIN_ENABLED);
		 adminDO.setAccess(HCSConstants.ADMIN_ENABLED.length()>0?HCSConstants.ADMIN_ENABLED:"");
		 adminDO.setAgentaccess(adminDO.getAgentaccess()!=null?adminDO.getAgentaccess():"");
		 adminDao.save(adminDO);
	}
	
	
	
	//@Test
	public void getAll(){
		Collection<AdminDO> adminDOs=adminDao.getAll(AdminDO.class);
       for(AdminDO adminDO:adminDOs){
    	   System.out.println(adminDO.getUserName());
       }
		}
		
	//@Test
	public void updateAdmin(){
		AdminDO adminDO=new AdminDO();
		adminDO.setEmailId("Raghav@gmail.com");
		List<AdminDO> adminDOs= adminDao.get(AdminDO.class, adminDO);
		System.out.println(adminDOs.size());
	}
	
	//@Test
	public void adminDelete(){
		adminDao.delete(AdminDO.class, "RaghavTest2322s");
	}
	
}

