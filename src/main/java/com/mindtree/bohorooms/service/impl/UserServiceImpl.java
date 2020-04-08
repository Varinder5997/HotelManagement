package com.mindtree.bohorooms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.bohorooms.entity.User;
import com.mindtree.bohorooms.repository.UserRepo;
import com.mindtree.bohorooms.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;
	@Override
	public User addUser(User user) {
		return this.userRepo.save(user);
	}

	@Override
	public List<User> allUsers() {
		return this.userRepo.findAll();
	}

	@Override
	public User findById(int id) {
		return this.userRepo.findById(id).get();
	}

}
