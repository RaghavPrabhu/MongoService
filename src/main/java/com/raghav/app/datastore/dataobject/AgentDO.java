/**
 * 
 */
package com.raghav.app.datastore.dataobject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.raghav.app.datastore.base.dataobject.BaseHCSDO;

/**
 * @author Saranya
 *  @version 1.0
 *
 */
@Entity
@Table(name = "agent",schema="hcs@hcs_mongodb_manager")
public class AgentDO extends BaseHCSDO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//_id" : { "$oid" : "4f1fb0859d8c18282b89665d"} , "agent_name" : "Agent87" ," +
	//" "machineid" : "192.168.1.87" , "status" : 1 , "agent_id" : "AGENT 1319181067-59"}" +
@Id			
@Column(name="_id")
private String id;
@Column(name="agent_name")
private String agentName;
@Column(name="machineid")
private String machineId;
@Column(name="status")
private int status;
@Column(name="agent_id")
private String agentId;
/**
 * @return the id
 */
public String getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(String id) {
	this.id = id;
}
/**
 * @return the agentName
 */
public String getAgentName() {
	return agentName;
}
/**
 * @param agentName the agentName to set
 */
public void setAgentName(String agentName) {
	this.agentName = agentName;
}
/**
 * @return the machineId
 */
public String getMachineId() {
	return machineId;
}
/**
 * @param machineId the machineId to set
 */
public void setMachineId(String machineId) {
	this.machineId = machineId;
}
/**
 * @return the status
 */
public int getStatus() {
	return status;
}
/**
 * @param status the status to set
 */
public void setStatus(int status) {
	this.status = status;
}
/**
 * @return the agentId
 */
public String getAgentId() {
	return agentId;
}
/**
 * @param agentId the agentId to set
 */
public void setAgentId(String agentId) {
	this.agentId = agentId;
}


}
