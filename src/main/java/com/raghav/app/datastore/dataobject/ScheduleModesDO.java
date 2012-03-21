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
@Table(name = "schedulemodes",schema="hcs@hcs_mongodb_manager")
public class ScheduleModesDO extends BaseHCSDO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
/*"_id" : { "$oid" : "4f1fb1779d8c6cb6e0dfe82f"} , "duration" : "Weekly" ,
	"day" : "Wednesday" , "time" : "14:00"}*/
@Id
@Column(name="_id")
private String id;
@Column(name="duration")
private String duration;
@Column(name="day") 
private String day;
@Column(name="time")
private String time;
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
 * @return the duration
 */
public String getDuration() {
	return duration;
}
/**
 * @param duration the duration to set
 */
public void setDuration(String duration) {
	this.duration = duration;
}
/**
 * @return the day
 */
public String getDay() {
	return day;
}
/**
 * @param day the day to set
 */
public void setDay(String day) {
	this.day = day;
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

}
