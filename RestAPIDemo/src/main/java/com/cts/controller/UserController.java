package com.cts.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.User;
import com.cts.service.UserService;
//All APIS

@RestController
public class UserController 
{
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getAllUsers()
	{
		return userService.getUsers();
	}
	
	@PostMapping("/save")
	public String saveUser(@RequestBody User  user)
	{
		userService.addUser(user);
		 return "New User added successfully....";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") int id)
	{
		userService.deleteUser(id);
		return "User Deleted Successfully....";
	}
	
	@PutMapping("/update")
	public String updateUser()
	{
		return "User details are Updated...";
		
	}
	
	@GetMapping("/getUser/{user}")
	public String getUser(String user)
	{
		return "Hello "+user+"!";
	}
}
