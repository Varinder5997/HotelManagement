package com.mindtree.bohorooms.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class LivingFacility {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int facilityId;
	
	private String facilityName;
	
	private float revenue;
	
	private String address;
	
	@OneToMany(mappedBy = "livingFacility")
	private List<Rating> ratings;

	
	@OneToMany(mappedBy = "livingFacility")
	private List<Rooms> rooms;


	public LivingFacility() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getFacilityId() {
		return facilityId;
	}


	public void setFacilityId(int facilityId) {
		this.facilityId = facilityId;
	}


	public String getFacilityName() {
		return facilityName;
	}


	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}


	public float getRevenue() {
		return revenue;
	}


	public void setRevenue(float revenue) {
		this.revenue = revenue;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public List<Rating> getRatings() {
		return ratings;
	}


	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}


	public List<Rooms> getRooms() {
		return rooms;
	}


	public void setRooms(List<Rooms> rooms) {
		this.rooms = rooms;
	}

	
	
	
}
