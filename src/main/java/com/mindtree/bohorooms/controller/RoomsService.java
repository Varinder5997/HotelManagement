package com.mindtree.bohorooms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mindtree.bohorooms.entity.LivingFacility;
import com.mindtree.bohorooms.entity.Rooms;
import com.mindtree.bohorooms.service.LivingFacilityService;
import com.mindtree.bohorooms.service.RoomService;

@Controller
public class RoomsService {
	
	@Autowired
	RoomService roomService;
	@Autowired
	LivingFacilityService livingFacilityService;
	int sfacilityId;
//	@RequestMapping("/rooms")
//	public String homePage(Model model) {
//		List<Rooms> allRooms =this.roomService.allRooms();
//		model.addAttribute("allRooms",allRooms);
//		return "Rooms";
//	}
	@RequestMapping("/register_Room/{id}")
	public String addBook(@PathVariable int id, Model model) {
		Rooms room = new Rooms();
		model.addAttribute("room", room);
		sfacilityId=id;
		return "NewRoom";
	}
	
	@RequestMapping("/save-room")
	public String addRoom(@ModelAttribute Rooms room) {
		LivingFacility livingFacility=this.livingFacilityService.findById(sfacilityId);
		room.setLivingFacility(livingFacility);
		this.roomService.addRooms(room);
		livingFacility.getRooms().add(room);
		this.livingFacilityService.addFacility(livingFacility);
		//this.roomService.addRooms(room);
		
		
		return "redirect:/showRooms/"+sfacilityId;
	}
	

}
