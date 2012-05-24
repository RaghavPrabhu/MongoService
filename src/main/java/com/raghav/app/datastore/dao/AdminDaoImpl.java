/**
 * 
 */
package com.raghav.app.datastore.dao;

import org.springframework.stereotype.Repository;

import com.raghav.app.datastore.base.dao.AbstractJPA;
import com.raghav.app.datastore.dataobject.AdminDO;

/**
 * @author Raghav Prabhu
 *  @version 1.0
 *
 */
 @Repository
public class AdminDaoImpl extends AbstractJPA<AdminDO> implements
		AdminDao {
}