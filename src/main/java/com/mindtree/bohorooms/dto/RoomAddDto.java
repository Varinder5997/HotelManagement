package com.mindtree.bohorooms.dto;

import java.util.List;

import com.mindtree.bohorooms.entity.LivingFacility;
import com.mindtree.bohorooms.entity.Rooms;

public class RoomAddDto {
	
	private List<Rooms> allRooms;
	
	private LivingFacility livingFacility;

	public List<Rooms> getAllRooms() {
		return allRooms;
	}

	public void setAllRooms(List<Rooms> allRooms) {
		this.allRooms = allRooms;
	}

	public LivingFacility getLivingFacility() {
		return livingFacility;
	}

	public void setLivingFacility(LivingFacility livingFacility) {
		this.livingFacility = livingFacility;
	}
	
	

}
