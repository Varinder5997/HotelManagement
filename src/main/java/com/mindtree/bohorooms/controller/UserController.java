package com.mindtree.bohorooms.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.bohorooms.dto.LoginDto;
import com.mindtree.bohorooms.dto.RatingDto;
import com.mindtree.bohorooms.entity.LivingFacility;
import com.mindtree.bohorooms.entity.Rating;
import com.mindtree.bohorooms.entity.Rooms;
import com.mindtree.bohorooms.entity.User;
import com.mindtree.bohorooms.service.LivingFacilityService;
import com.mindtree.bohorooms.service.RatingService;
import com.mindtree.bohorooms.service.RoomService;
import com.mindtree.bohorooms.service.UserService;


@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	@Autowired
	LivingFacilityService livingFacilityService;
	@Autowired
	RoomService roomService;
	@Autowired
	RatingService ratingService;

	private int rUserId;
	private int lUserId;
	
	@RequestMapping("/")
	public String homePage(Model model) {
		int a=50;
		model.addAttribute("a",a);
		//model.addAttributes("a",a);
		return "HomePage";
	}
	@RequestMapping("/user")
	public String user() {
		return "User";
	}
	@RequestMapping("/login")
	public String loginUser(Model model) {
		LoginDto loginDto =new LoginDto();
		model.addAttribute("loginDto", loginDto);
		return "LoginUser";
	}
	@RequestMapping("/login-user")
	public String login(@ModelAttribute LoginDto loginDto ,Model model) {
		int id=loginDto.getId();
		String password=loginDto.getPassword();
		User user=this.userService.findById(id);
		if(user.getPassword().compareTo(password)==0) {
			model.addAttribute("user",user);
			return "LoginPage";
		}
		return "WrongUserName";
	}
	
	@RequestMapping("/register")
	public String addUser( Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "NewUser";
	}
	
	
	@RequestMapping("/save-user")
	public String addNewUser(@ModelAttribute User user, Model model)  {
		System.out.println(user.getName());
		rUserId=user.getId();
		System.out.println(rUserId);
		System.out.println(user.getId());

		this.userService.addUser(user);
		List<LivingFacility>allLivingFacility=this.livingFacilityService.allFacilities();
		model.addAttribute("allLivingFacility",allLivingFacility );
		return "BookRoom";
	}
	@RequestMapping("/chooseHotel")
	public String chooseHotel(Model model) {
		List<LivingFacility>allLivingFacility=this.livingFacilityService.allFacilities();
		model.addAttribute("allLivingFacility",allLivingFacility );
		return "BookRoom";
	}
	
	@RequestMapping("/chooseRoom")
	public String chooseRoom(@RequestParam(name = "chooseLivingFacility")String name,Model model){
		LivingFacility facility= this.livingFacilityService.findbyName(name);
		List<Rooms>allRooms=facility.getRooms();
		List<Rooms>freerooms=allRooms.stream().filter(room -> room.isAvailable()==true)
				.collect(Collectors.toList());
		if(freerooms.isEmpty()==true) {
			return "ChooseAnotherHotel";
		}
		model.addAttribute("freerooms", freerooms);
		return "ChooseRoom";
	}
	
	@RequestMapping("/selectedRoom")
	public String selectedRooms(@RequestParam(name = "chooseroomId")int id) {
		
		Rooms room = this.roomService.findRoom(id);
		if(rUserId==0) {
			User user =this.userService.findById(lUserId);
			room.setUser(user);
			LivingFacility facility=room.getLivingFacility();
			float revanue=facility.getRevenue();
			revanue=revanue+room.getPrice();
			room.setAvailable(false);
			facility.setRevenue(revanue);
			this.livingFacilityService.addFacility(facility);
			user.getRooms().add(room);
			this.roomService.addRooms(room);
			this.userService.addUser(user);
			return "redirect:/";
		}
		else {
			
		
		User user=this.userService.findById(rUserId);
		room.setUser(user);
		room.setAvailable(false);
		user.getRooms().add(room);
		this.roomService.addRooms(room);
		this.userService.addUser(user);
		return "redirect:/";
		}
	}
	int fId;
	@RequestMapping("/ceckout/{id}")
	public String checkoutRoom(@PathVariable int id ,Model model) {
		Rooms room=this.roomService.findRoom(id);
		fId=room.getLivingFacility().getFacilityId();
		User user=room.getUser();
		List<Rooms>allRooms=user.getRooms();
		List<Rooms>newRooms=new ArrayList<>();
		for (Rooms rooms : allRooms) {
			if(rooms==room) {
				
			}
			else {
				newRooms.add(rooms);
			}
		}
		
		user.setRooms(newRooms);
		this.userService.addUser(user);
		room.setUser(null);
		room.setAvailable(true);
		this.roomService.addRooms(room);
		RatingDto ratingDto=new RatingDto();
		model.addAttribute("ratingDto", ratingDto);
		return "Rating";
	}
	
	@RequestMapping("/facility-rating")
	public String rating(@ModelAttribute RatingDto ratingDto) {
		LivingFacility livingFacility =this.livingFacilityService.findById(fId);
		Rating rating=new Rating();
		rating.setLivingFacility(livingFacility);
		rating.setRating(ratingDto.getRating());
		this.ratingService.addRatinf(rating);
		livingFacility.getRatings().add(rating);
		this.livingFacilityService.addFacility(livingFacility);
		return "redirect:/";
		
	}
	@RequestMapping("/ceckin/{id}")
	public String checkin(@PathVariable int id ,Model model) {
		lUserId=id;
		rUserId=0;
		List<LivingFacility>allLivingFacility=this.livingFacilityService.allFacilities();
		model.addAttribute("allLivingFacility",allLivingFacility );
		return "BookRoom";
		
	}
}
