package com.cts.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.User;
import com.cts.service.UserService;

//C => CREATE   R   => Retrival   U  => update D  => delete

@RestController
public class UserController
{
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User>  getAllUsers()
	{
		return userService.getAllUsers();
	}
	
	@PostMapping("/user")
	public String createUser(@RequestBody User user)
	{
	
		userService.addUser(user);
		return "New User details saved....";
		
	}
	
	
}
