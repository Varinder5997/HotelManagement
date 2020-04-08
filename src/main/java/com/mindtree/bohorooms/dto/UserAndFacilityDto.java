package com.mindtree.bohorooms.dto;

import java.util.List;

import com.mindtree.bohorooms.entity.LivingFacility;
import com.mindtree.bohorooms.entity.User;

public class UserAndFacilityDto {
	
	private User user;
	private List<LivingFacility> livingFacility;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<LivingFacility> getLivingFacility() {
		return livingFacility;
	}
	public void setLivingFacility(List<LivingFacility> livingFacility) {
		this.livingFacility = livingFacility;
	}

	

}
