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
@Table(name = "cloud",schema="hcs@hcs_mongodb_manager")
public class CloudDO extends BaseHCSDO{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*	_id" : { "$oid" : "4f06980d550d4ccccdb2114f"} , "accesskey" : "AKIAIIO5H6OSKQNFKDGA" ," +
	" "buckets" : "[HCS-bucket1401]" , "cloud_id" : "355C21C31B86E1F4FFE6F5A7315E" ," +
	" "cloud_name" : "Amazon" , "cloud_type" : "Public" , "endpoint" : "" ," +
	" "provider" : "Amazon" , "secretkey" : "uUxvDFti4D12L+hEPO6kk/A/L5aBSfK58eWSmdwt" ," +
	" "status" : 1}*/
	@Id
	@Column(name="_id")
	private String id;
	@Column(name="accesskey")
	private String accessKey;
	@Column(name="buckets")
	private String buckets;
	@Column(name="cloud_id")
	private String cloudId;
	@Column(name="cloud_name")
	private String cloudName;
	@Column(name="cloud_type")
	private String cloudType;
	@Column(name="endpoint")
	private String endPoint;
	@Column(name="provider")
	private String provider;
	@Column(name="secretkey")
	private String secretKey;
	@Column(name="status")
	private int status;
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
	 * @return the accessKey
	 */
	public String getAccessKey() {
		return accessKey;
	}
	/**
	 * @param accessKey the accessKey to set
	 */
	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}
	/**
	 * @return the buckets
	 */
	public String getBuckets() {
		return buckets;
	}
	/**
	 * @param buckets the buckets to set
	 */
	public void setBuckets(String buckets) {
		this.buckets = buckets;
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
	 * @return the cloudName
	 */
	public String getCloudName() {
		return cloudName;
	}
	/**
	 * @param cloudName the cloudName to set
	 */
	public void setCloudName(String cloudName) {
		this.cloudName = cloudName;
	}
	/**
	 * @return the cloudType
	 */
	public String getCloudType() {
		return cloudType;
	}
	/**
	 * @param cloudType the cloudType to set
	 */
	public void setCloudType(String cloudType) {
		this.cloudType = cloudType;
	}
	/**
	 * @return the endPoint
	 */
	public String getEndPoint() {
		return endPoint;
	}
	/**
	 * @param endPoint the endPoint to set
	 */
	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}
	/**
	 * @return the provider
	 */
	public String getProvider() {
		return provider;
	}
	/**
	 * @param provider the provider to set
	 */
	public void setProvider(String provider) {
		this.provider = provider;
	}
	/**
	 * @return the secretKey
	 */
	public String getSecretKey() {
		return secretKey;
	}
	/**
	 * @param secretKey the secretKey to set
	 */
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
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
	

}
