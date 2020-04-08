package com.mindtree.bohorooms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mindtree.bohorooms.dto.RoomAddDto;
import com.mindtree.bohorooms.entity.LivingFacility;
import com.mindtree.bohorooms.entity.Rooms;
import com.mindtree.bohorooms.service.LivingFacilityService;

@Controller
public class LivingFacilityController {
	
	@Autowired
	LivingFacilityService livingService;
	//@Autowired
	RoomAddDto roomAddDto=new RoomAddDto();

	@RequestMapping("/owner")
	public String homePage(Model model) {
		List<LivingFacility> allFacility =this.livingService.allFacilities();
		model.addAttribute("allFacility",allFacility);
		return "Owner";
	}
	
	@RequestMapping("/register_Facility")
	public String addBook( Model model) {
		LivingFacility livingfacility = new LivingFacility();
		model.addAttribute("livingfacility", livingfacility);
		return "Newfacility";
	}
	@RequestMapping("/save-facility")
	public String addNewUser(@ModelAttribute LivingFacility livingFacility)  {
		
		this.livingService.addFacility(livingFacility);
		return "redirect:/";
	}
	
	@RequestMapping("/showRooms/{id}")
	public String books(@PathVariable(name = "id") int id, Model model) {
		List<Rooms> listRooms =this.livingService.allRooms(id);
		roomAddDto.setAllRooms(listRooms);
		LivingFacility livingFacility =this.livingService.findById(id);
		roomAddDto.setLivingFacility(livingFacility);
		model.addAttribute("roomAddDto", roomAddDto);
		return "Rooms";
	}
	
	@RequestMapping("/checkRating/{id}")
	public String showRating(@PathVariable(name ="id")int id, Model model) {
		float rating=this.livingService.allRatings(id);
		model.addAttribute("rating", rating);
		return "AverageRating";
	}
	
}
