/**
 * 
 */
package com.raghav.app.datastore.dao;

import org.springframework.stereotype.Repository;

import com.raghav.app.datastore.base.dao.AbstractHCSJPA;
import com.raghav.app.datastore.dataobject.AdminDO;

/**
 * @author Raghav Prabhu
 *  @version 1.0
 *
 */
 @Repository
public class AdminDaoImpl extends AbstractHCSJPA<AdminDO> implements
		AdminDao {
}