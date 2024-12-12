package com.sat.tktbooking;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name="screens")
public class ScreenEntity {

	@Column(name="screen_id")
	private int screenId;
	@Column(name="screen_name")
	private String screenName;
	@Column(name="screen_location")
	private String location;
	@Column(name="screen_city")
	private String city;
	@Column(name="screen_state")
	private String state;
	@Column(name="screen_country")
	private String country;
	@Column(name="screen_capacity")
	private int seatingCapacity;
	
	@OneToMany(cascade  = CascadeType.ALL)
	@JoinColumn(name="screenId")  
	@OrderColumn(name="idx")  
	private List<SeatEntity> seatslist;
	
	@Column(name="created_by")
	private String createdBy;
	@Column(name="create_date")
	private String createdDate;
	@Column(name="modified_by")
	private String modifiedBy;
	@Column(name="modified_date")
	private String modifiedDate;
	

	public ScreenEntity(int screenId, String screenName, String location, String city, String state, String country,
			int seatingCapacity, String createdBy, String createdDate, String modifiedBy, String modifiedDate) {
		super();
		this.screenId = screenId;
		this.screenName = screenName;
		this.location = location;
		this.city = city;
		this.state = state;
		this.country = country;
		this.seatingCapacity = seatingCapacity;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
	}
	
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getSeatingCapacity() {
		return seatingCapacity;
	}
	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
    
	
    
}
