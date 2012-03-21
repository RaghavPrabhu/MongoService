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
@Table(name = "provider",schema="hcs@hcs_mongodb_manager")
public class ProviderDO extends BaseHCSDO {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*"_id" : { "$oid" : "4f30f0508e4322f29d326f25"} , "provider_name" : "Eucalyptus" ,
"provider_type" : "Private" , "provider" : { "_id" : { "$oid" : "4f30f0178e4370605e1e9b91"} , "provider_name" : "Amazon" , "provider_type" : "Public"}*/
	@Id
	@Column(name="_id")
	private String id;
	@Column(name="provider_name")
	private String providerName;
	@Column(name="provider_type")
	private String providerType;
	/* Embedded */
	@Column(name="provider")
	private String provider;
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
	 * @return the providerName
	 */
	public String getProviderName() {
		return providerName;
	}
	/**
	 * @param providerName the providerName to set
	 */
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	/**
	 * @return the providerType
	 */
	public String getProviderType() {
		return providerType;
	}
	/**
	 * @param providerType the providerType to set
	 */
	public void setProviderType(String providerType) {
		this.providerType = providerType;
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
	
	

}
