package com.mindtree.bohorooms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.bohorooms.entity.LivingFacility;
import com.mindtree.bohorooms.entity.Rating;
import com.mindtree.bohorooms.entity.Rooms;
import com.mindtree.bohorooms.repository.LivingFacilityRepo;
import com.mindtree.bohorooms.service.LivingFacilityService;
@Service
public class LivingFacilityImpl implements LivingFacilityService {
	
	@Autowired
	LivingFacilityRepo livingfacilityRepo;

	@Override
	public LivingFacility addFacility(LivingFacility livingFacility) {
		return this.livingfacilityRepo.save(livingFacility);
	}

	@Override
	public List<LivingFacility> allFacilities() {
		
		return this.livingfacilityRepo.findAll();
	}

	@Override
	public List<Rooms> allRooms(int id) {
		LivingFacility livingFacility=this.livingfacilityRepo.findById(id).get();
		return livingFacility.getRooms();
	}

	@Override
	public LivingFacility findById(int id) {
		return this.livingfacilityRepo.findById(id).get();
	}

	@Override
	public LivingFacility findbyName(String name) {
		return this.livingfacilityRepo.findByfacilityName(name);
	}

	@Override
	public float allRatings(int id) {
		LivingFacility facility=this.livingfacilityRepo.findById(id).get();
		List<Rating> allrating=facility.getRatings();
		float sumRating=0;
		for (Rating rating : allrating) {
			sumRating=sumRating+rating.getRating();
		}
		float averageRating=sumRating/allrating.size();
		return averageRating;
	}

}
