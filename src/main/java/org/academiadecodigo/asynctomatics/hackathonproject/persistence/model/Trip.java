package org.academiadecodigo.asynctomatics.hackathonproject.persistence.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "trip")
public class Trip extends AbstractModel {

	private Date startDate;
	private Date endDate;
	private String location;
	private String locationGoal;
	private String locationType;
	private String hotel;
	private String price;

	private Integer travellerId;

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocationGoal() {
		return locationGoal;
	}

	public void setLocationGoal(String locationGoal) {
		this.locationGoal = locationGoal;
	}

	public String getLocationType() {
		return locationType;
	}

	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	public String getHotel() {
		return hotel;
	}

	public void setHotel(String hotel) {
		this.hotel = hotel;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Integer getTravellerId() {
		return travellerId;
	}

	public void setTravellerId(Integer travellerId) {
		this.travellerId = travellerId;
	}
}
