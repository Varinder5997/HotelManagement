package com.mindtree.bohorooms.service;

import java.util.List;

import com.mindtree.bohorooms.entity.Rooms;

public interface RoomService {
	
	public Rooms addRooms(Rooms room);
	
	public List<Rooms> allRooms(int facilityId);
	
	public Rooms findRoom(int id);
	

}
