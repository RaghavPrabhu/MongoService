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
@Table(name = "processlogs",schema="hcs@hcs_mongodb_manager")
public class ProcessLogsDO extends BaseHCSDO {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*	_id" : "1327479896-1083" , "endDate" : "2012/01/25 13:54:58" ," +
	" "folder_id" : "A1C57EF1F3D3F08333ABAF8C982F" , "startDate" : "2012/01/25 13:54:56" ," +
			" "status" : "Completed"}" +*/
	@Id
	@Column(name="_id")
	private String id;
	@Column(name="endDate")
	private String endDate;
	@Column(name="folder_id")
	private String folder_id;
	@Column(name="startDate")
	private String startDate;
	@Column(name="status")
	private String status;
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
	 * @return the endDate
	 */
	public String getEndDate() {
		return endDate;
	}
	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	/**
	 * @return the folder_id
	 */
	public String getFolder_id() {
		return folder_id;
	}
	/**
	 * @param folder_id the folder_id to set
	 */
	public void setFolder_id(String folder_id) {
		this.folder_id = folder_id;
	}
	/**
	 * @return the startDate
	 */
	public String getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the status
	 */
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

				

}
