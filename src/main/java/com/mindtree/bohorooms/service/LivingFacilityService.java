package com.mindtree.bohorooms.service;

import java.util.List;

import com.mindtree.bohorooms.entity.LivingFacility;
import com.mindtree.bohorooms.entity.Rating;
import com.mindtree.bohorooms.entity.Rooms;

public interface LivingFacilityService {
	
	public LivingFacility addFacility(LivingFacility livingFacility);
	
	public List<LivingFacility> allFacilities();
	
	public List<Rooms> allRooms(int id);
	
	public LivingFacility findById(int id);
	
	public LivingFacility findbyName(String name);
	
	public float allRatings(int id);

}
