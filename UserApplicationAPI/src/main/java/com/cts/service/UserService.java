package com.cts.service;

import java.util.List;

import com.cts.model.User;

public interface UserService {

	public List<User>getAllUsers();
	
	public String addUser(User user);
	
}
