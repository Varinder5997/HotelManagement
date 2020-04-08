package com.mindtree.bohorooms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Rooms {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roomId;
	private String type;
	private float price;
	private boolean available;
	@OneToOne
	private LivingFacility livingFacility;
	@OneToOne
	private User user;

	public Rooms() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public LivingFacility getLivingFacility() {
		return livingFacility;
	}

	public void setLivingFacility(LivingFacility livingFacility) {
		this.livingFacility = livingFacility;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	

}
