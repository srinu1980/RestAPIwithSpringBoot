package com.cts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController 
{

	//@GetMapping("/greet")
	@RequestMapping(value="/greet", method = RequestMethod.GET)
	public String greeting()
	{
		return "Good Morning";
	}
	
}
