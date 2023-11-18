package com.carnation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carnation.model.User;
import com.carnation.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository ur;

	public User registerUser(User user) {
		return ur.save(user);
	}

	
}
