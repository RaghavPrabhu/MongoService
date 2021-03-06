/**
 * 
 */
package com.raghav.app.datastore.dataobject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.raghav.app.datastore.base.dataobject.BaseDO;

/**
 * @author Raghav Prabhu
 *  @version 1.0
 *
 */
@Entity
@Table(name = "enterprisedetails",schema="mydb@my_mongodb_manager")
public class EnterpriseDetailsDO extends BaseDO {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="_id")
	private String id;
	
	@Column(name="cmpShort_id")
	private String cmpShortId;
	
	@Column(name="cmpShort_name")
	private String cmpShortName;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="company_id")
	private String companyId;
	
	@Column(name="email_id")
	private String emailId;
		
	@Column(name="password")
	private String password;
	
	@Column(name="status")
	private int status;
	
	@Column(name="username")
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
