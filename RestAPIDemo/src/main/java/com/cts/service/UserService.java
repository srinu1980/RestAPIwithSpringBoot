package com.cts.service;

import java.util.List;

import com.cts.model.User;

public interface UserService
{

	public List<User>getUsers();
	
	public String addUser(User user);
	
	public String deleteUser(int id);
	
	
}
