package com.mindtree.bohorooms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.bohorooms.entity.LivingFacility;
import com.mindtree.bohorooms.entity.Rooms;
import com.mindtree.bohorooms.repository.LivingFacilityRepo;
import com.mindtree.bohorooms.repository.RoomsRepo;
import com.mindtree.bohorooms.service.RoomService;
@Service
public class RoomServiceImpl implements RoomService {

	@Autowired
	RoomsRepo roomRepo;
	@Autowired
	LivingFacilityRepo facilityRepo;
	@Override
	public Rooms addRooms(Rooms room) {
		return this.roomRepo.save(room);
	}

	@Override
	public List<Rooms> allRooms(int facilityId) {
		LivingFacility facility=this.facilityRepo.findById(facilityId).get();
		return facility.getRooms();
	}

	@Override
	public Rooms findRoom(int id) {
		return this.roomRepo.findById(id).get();
	}
	

}
