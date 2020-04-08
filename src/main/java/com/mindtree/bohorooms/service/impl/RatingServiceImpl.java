package com.mindtree.bohorooms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.bohorooms.entity.Rating;
import com.mindtree.bohorooms.repository.RatingRepo;
import com.mindtree.bohorooms.service.RatingService;
@Service
public class RatingServiceImpl implements RatingService {
	@Autowired
	RatingRepo ratingRepo;
	@Override
	public Rating addRatinf(Rating rating) {
		return this.ratingRepo.save(rating);
	}

}
