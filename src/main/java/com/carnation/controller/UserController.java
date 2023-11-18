package com.carnation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carnation.model.User;
import com.carnation.service.UserService;

@CrossOrigin("*")
@RestController
public class UserController {
	
	@Autowired
	UserService us;
	
	@PostMapping("/register")
	public User registerUser(@RequestBody User user) {
		return us.registerUser(user);
	}
}
