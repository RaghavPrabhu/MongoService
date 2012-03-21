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
@Table(name = "ccs",schema="hcs@hcs_mongodb_manager")
public class CcsDO extends BaseHCSDO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* "_id" : { "$oid" : "4f2bb60e4bc9d9a90bcb9f0b"} , "ccs_provider" : "Eucalyptus" , 
	 "ccs_acckey" : "GgjbFXoO1l58G2BaUGHwt9GAFB3iKzNxqoUsxw" , "ccs_seckey" : "7RTdeE59Xp6St2QjVNVU1fkYKzB15jtLkDQKw" ,
	 "ccs_endpt" : "173.205.188.130" , "status" : 1}*/
	@Id
	@Column(name="_id")
	private String id;
	@Column(name="ccs_provider")
	private String ccsProvider;
	@Column(name="ccs_acckey")
	private String ccsAcckey;
	@Column(name="ccs_seckey")
	private String ccsSeckey;
	@Column(name="ccs_endpt")
	private String ccsEndpt;
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
 * @return the ccsProvider
 */
public String getCcsProvider() {
	return ccsProvider;
}
/**
 * @param ccsProvider the ccsProvider to set
 */
public void setCcsProvider(String ccsProvider) {
	this.ccsProvider = ccsProvider;
}
/**
 * @return the ccsAcckey
 */
public String getCcsAcckey() {
	return ccsAcckey;
}
/**
 * @param ccsAcckey the ccsAcckey to set
 */
public void setCcsAcckey(String ccsAcckey) {
	this.ccsAcckey = ccsAcckey;
}
/**
 * @return the ccsSeckey
 */
public String getCcsSeckey() {
	return ccsSeckey;
}
/**
 * @param ccsSeckey the ccsSeckey to set
 */
public void setCcsSeckey(String ccsSeckey) {
	this.ccsSeckey = ccsSeckey;
}
/**
 * @return the ccsEndpt
 */
public String getCcsEndpt() {
	return ccsEndpt;
}
/**
 * @param ccsEndpt the ccsEndpt to set
 */
public void setCcsEndpt(String ccsEndpt) {
	this.ccsEndpt = ccsEndpt;
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
 * @return the serialversionuid
 */
public static long getSerialversionuid() {
	return serialVersionUID;
}


}
