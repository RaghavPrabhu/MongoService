/**
 * 
 */
package com.raghav.app.datastore.dao;

import org.springframework.stereotype.Repository;

import com.raghav.app.datastore.base.dao.AbstractHCSJPA;
import com.raghav.app.datastore.dataobject.ProcessLogsDO;

/**
 * @author saranya
 *  @version 1.0
 *
 */
@Repository  
public class ProcessLogsDaoImpl extends AbstractHCSJPA<ProcessLogsDO> implements
ProcessLogsDao{

}
