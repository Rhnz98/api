package com.unittest.controller;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.unittest.model.User;

@RestController
public class MainController {
	@RequestMapping(value ="/new", method =RequestMethod.POST)
	public User user(@RequestBody User user) {
		return user;
	}
	
}
