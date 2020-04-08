package com.mindtree.bohorooms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.bohorooms.entity.LivingFacility;
@Repository
public interface LivingFacilityRepo extends JpaRepository<LivingFacility, Integer> {

	LivingFacility findByfacilityName(String name);

}
