package com.mindtree.bohorooms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.bohorooms.entity.Rooms;
@Repository
public interface RoomsRepo extends JpaRepository<Rooms, Integer> {

}
