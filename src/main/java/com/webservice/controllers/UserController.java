package com.webservice.controllers;


import java.util.HashMap;


import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;

	@GetMapping("/getUser")
	public HashMap<String, Object> user(HttpServletRequest request) {
		
		System.out.println("User Page Controller");	
		return userService.getUser();
	}

}

