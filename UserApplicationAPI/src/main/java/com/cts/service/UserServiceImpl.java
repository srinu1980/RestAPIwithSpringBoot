package com.cts.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.model.User;

@Service
public class UserServiceImpl implements UserService
{

	List<User> usersList=new ArrayList<User>();
	
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return usersList;
	}

	@Override
	public String addUser(User user) {
		// TODO Auto-generated method stub
		 usersList.add(user);
		 return "Record added...";
	}

}
