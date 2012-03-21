/**
 * 
 */
package com.raghav.app.datastore.service.modal;

import java.io.Serializable;

/**
 * @author Raghav Prabhu
 *  @version 1.0
 *
 */
public class EnterpriseDetailRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8950955147158440435L;
	
    private String id;	
	private String cmpShortId;
	private String cmpShortName;
	private String companyName;
	private String companyId;
	private String emailId;
	private String enableCCS;
	private String password;
	private Integer status;
	private String userName;
	
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
	 * @return the cmpShortId
	 */
	public String getCmpShortId() {
		return cmpShortId;
	}
	/**
	 * @param cmpShortId the cmpShortId to set
	 */
	public void setCmpShortId(String cmpShortId) {
		this.cmpShortId = cmpShortId;
	}
	/**
	 * @return the cmpShortName
	 */
	public String getCmpShortName() {
		return cmpShortName;
	}
	/**
	 * @param cmpShortName the cmpShortName to set
	 */
	public void setCmpShortName(String cmpShortName) {
		this.cmpShortName = cmpShortName;
	}
	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/**
	 * @return the companyId
	 */
	public String getCompanyId() {
		return companyId;
	}
	/**
	 * @param companyId the companyId to set
	 */
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}
	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	/**
	 * @return the enableCCS
	 */
	public String getEnableCCS() {
		return enableCCS;
	}
	/**
	 * @param enableCCS the enableCCS to set
	 */
	public void setEnableCCS(String enableCCS) {
		this.enableCCS = enableCCS;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	

}
