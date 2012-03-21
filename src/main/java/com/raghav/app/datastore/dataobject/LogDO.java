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
@Table(name = "log",schema="hcs@hcs_mongodb_manager")
public class LogDO extends BaseHCSDO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

/*"_id" : { "$oid" : "4f3c9320c0557915dc000000"} , "agent_name" : "" , "description" : "2012-02-16 10:54:48.828000 There are no schedules" ,
 *  "ip" : "192.168.1.87" , "time" : "10:54:48" , "date" : "2012-02-16" , "type" : "Success"}*/
@Id			
@Column(name="_id")
private String id;
@Column(name="agent_name")
private String agentName;
@Column(name="description")
private String description;
@Column(name="ip")
private String ip;
@Column(name="time")
private String time;
@Column(name="date")
private String date;
@Column(name="type")
private String type;
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
/**
 * @return the description
 */
public String getDescription() {
	return description;
}
/**
 * @param description the description to set
 */
public void setDescription(String description) {
	this.description = description;
}
/**
 * @return the ip
 */
public String getIp() {
	return ip;
}
/**
 * @param ip the ip to set
 */
public void setIp(String ip) {
	this.ip = ip;
}
/**
 * @return the time
 */
public String getTime() {
	return time;
}
/**
 * @param time the time to set
 */
public void setTime(String time) {
	this.time = time;
}
/**
 * @return the date
 */
public String getDate() {
	return date;
}
/**
 * @param date the date to set
 */
public void setDate(String date) {
	this.date = date;
}
/**
 * @return the type
 */
public String getType() {
	return type;
}
/**
 * @param type the type to set
 */
public void setType(String type) {
	this.type = type;
}


}
