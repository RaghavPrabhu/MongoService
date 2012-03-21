/**
 * 
 */
package com.raghav.app.datastore.dataobject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.raghav.app.datastore.base.dataobject.BaseHCSDO;


/**
 * @author Raghav Prabhu
 * @version 1.0
 * 
 */
@Entity
@Table(name = "admins",schema="hcs@hcs_mongodb_manager")
public class AdminDO extends BaseHCSDO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8016810898715793315L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "_id")
	// comment this if you use alternative
	private String id; // comment this if you use alternative

	@Column(name = "username")
	private String userName;

	@Column(name = "password")
	private String password;

	@Column(name = "admin_type")
	private int adminType;

	@Column(name = "email_id")
	private String emailId;

	@Column(name = "access")
	private String access;
	
	@Column(name = "agentaccess")
	private String agentaccess;
	

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the adminType
	 */
	public int getAdminType() {
		return adminType;
	}

	/**
	 * @param adminType
	 *            the adminType to set
	 */
	public void setAdminType(int adminType) {
		this.adminType = adminType;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId
	 *            the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the access
	 */
	public String getAccess() {
		return access;
	}

	/**
	 * @param access
	 *            the access to set
	 */
	public void setAccess(String access) {
		this.access = access;
	}

	/**
	 * @return the agentaccess
	 */
	public String getAgentaccess() {
		return agentaccess;
	}

	/**
	 * @param agentaccess the agentaccess to set
	 */
	public void setAgentaccess(String agentaccess) {
		this.agentaccess = agentaccess;
	}
	
	

}
