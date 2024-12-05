package com.cts.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.model.User;

@Service
public class UserServiceImpl implements UserService
{
	private List<User> list=new ArrayList<User>();
	
	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public String addUser(User user) {
		// TODO Auto-generated method stub
		
		list.add(user);
		return "User added...";
	}

	@Override
	public String deleteUser(int id) {
		// TODO Auto-generated method stub
		list.remove(id);
		return null;
	}

	
}
