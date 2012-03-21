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
@Table(name = "folders",schema="hcs@hcs_mongodb_manager")
public class FoldersDO extends BaseHCSDO {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//	rr{ "BackupDate" : "02/15/2012" , "BackupMode" : "Custom" , 
	//"BackupTime" : "14:00" , "BackupType" : "Amazon" , "Custom_day" :
	//	[ "Wednesday"] , "Folderpath" : "C:\\backup\\img1\\" , "_id" : "A1C57EF1F3D3F08333ABAF8C982F" , 
	//	"agent" : { "_id" : { "$oid" : "4f1fafb19d8c18282b89665c"} , "agent_name" : "Agent87" , "machineid" : "192.168.1.87" ,
	//"status" : 1 , "agent_id" : "AGENT 1319181067-59"} , 
	//	"agent_name" : "Agent87" , "buckets_name" : "HCS-bucket1401" , "cloud_id" : "355C21C31B86E1F4FFE6F5A7315E" ,
	//	"lastBackupDate" : "02/08/2012" , "lastBackupFileSize" : "56Kb" ,
	//	"lastBackupTime" : "13:54" , "processid" : "1328689497-9063" , "status" : 1}
	@Id
	@Column(name="BackupDate")
	private String backupDate;
	@Column(name="BackupMode")
	private String backupMode;
	@Column(name="BackupTime")
	private String backupTime;
	@Column(name="BackupType")
	private String backupType;
	@Column(name="Custom_day")
	private String customDay;
	@Column(name="Folderpath")
	private String folderPath;
	@Column(name="_id")
	private String id;
	/* Embedded Field */
	@Column(name="agent")
	private String agent;
	@Column(name="agent_name")
	private String agentName;
	@Column(name="machineid")
	private String machineId;
	@Column(name="status")
	private int status;
	@Column(name="agent_id")
	private String agentId;
	@Column(name="buckets_name")
	private String bucketsName;
	@Column(name="cloud_id")
	private String cloudId;
	@Column(name="lastBackupDate")
	private String lastBackupDate;
	@Column(name="lastBackupFileSize")
	private String lastBackupFileSize;
	@Column(name="lastBackupTime")
	private String lastBackupTime;
	@Column(name="processid")
	private String processId;
	/**
	 * @return the backupDate
	 */
	public String getBackupDate() {
		return backupDate;
	}
	/**
	 * @param backupDate the backupDate to set
	 */
	public void setBackupDate(String backupDate) {
		this.backupDate = backupDate;
	}
	/**
	 * @return the backupMode
	 */
	public String getBackupMode() {
		return backupMode;
	}
	/**
	 * @param backupMode the backupMode to set
	 */
	public void setBackupMode(String backupMode) {
		this.backupMode = backupMode;
	}
	/**
	 * @return the backupTime
	 */
	public String getBackupTime() {
		return backupTime;
	}
	/**
	 * @param backupTime the backupTime to set
	 */
	public void setBackupTime(String backupTime) {
		this.backupTime = backupTime;
	}
	/**
	 * @return the backupType
	 */
	public String getBackupType() {
		return backupType;
	}
	/**
	 * @param backupType the backupType to set
	 */
	public void setBackupType(String backupType) {
		this.backupType = backupType;
	}
	/**
	 * @return the customDay
	 */
	public String getCustomDay() {
		return customDay;
	}
	/**
	 * @param customDay the customDay to set
	 */
	public void setCustomDay(String customDay) {
		this.customDay = customDay;
	}
	/**
	 * @return the folderPath
	 */
	public String getFolderPath() {
		return folderPath;
	}
	/**
	 * @param folderPath the folderPath to set
	 */
	public void setFolderPath(String folderPath) {
		this.folderPath = folderPath;
	}
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
	 * @return the agent
	 */
	public String getAgent() {
		return agent;
	}
	/**
	 * @param agent the agent to set
	 */
	public void setAgent(String agent) {
		this.agent = agent;
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
	/**
	 * @return the bucketsName
	 */
	public String getBucketsName() {
		return bucketsName;
	}
	/**
	 * @param bucketsName the bucketsName to set
	 */
	public void setBucketsName(String bucketsName) {
		this.bucketsName = bucketsName;
	}
	/**
	 * @return the cloudId
	 */
	public String getCloudId() {
		return cloudId;
	}
	/**
	 * @param cloudId the cloudId to set
	 */
	public void setCloudId(String cloudId) {
		this.cloudId = cloudId;
	}
	/**
	 * @return the lastBackupDate
	 */
	public String getLastBackupDate() {
		return lastBackupDate;
	}
	/**
	 * @param lastBackupDate the lastBackupDate to set
	 */
	public void setLastBackupDate(String lastBackupDate) {
		this.lastBackupDate = lastBackupDate;
	}
	/**
	 * @return the lastBackupFileSize
	 */
	public String getLastBackupFileSize() {
		return lastBackupFileSize;
	}
	/**
	 * @param lastBackupFileSize the lastBackupFileSize to set
	 */
	public void setLastBackupFileSize(String lastBackupFileSize) {
		this.lastBackupFileSize = lastBackupFileSize;
	}
	/**
	 * @return the lastBackupTime
	 */
	public String getLastBackupTime() {
		return lastBackupTime;
	}
	/**
	 * @param lastBackupTime the lastBackupTime to set
	 */
	public void setLastBackupTime(String lastBackupTime) {
		this.lastBackupTime = lastBackupTime;
	}
	/**
	 * @return the processId
	 */
	public String getProcessId() {
		return processId;
	}
	/**
	 * @param processId the processId to set
	 */
	public void setProcessId(String processId) {
		this.processId = processId;
	}
	
	
	

}
