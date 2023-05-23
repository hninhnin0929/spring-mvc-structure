package com.webservice.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;


import com.webservice.models.User;
import com.webservice.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;

	@GetMapping("/getUser")
	public HashMap<String, Object> user(HttpServletRequest request) {
		
		System.out.println("User Page Requested");	
		HashMap<String, Object> result = new HashMap<String, Object>();
		result = userService.getUser();
//		return userService.getUser();
//		return "HII";
		return result;
	}
	@GetMapping(value = "/test")
	public User test() {
		User user = new User();
		return user;
	}
	 
	 @GetMapping(value = "/check-user")
	    public ModelAndView checkUser(@ModelAttribute("userJSP") User user) {
	        ModelAndView modelAndView = new ModelAndView();
	        modelAndView.setViewName("index");
	        modelAndView.addObject("userJSP", user);
	        return modelAndView;
	    }
	 
		@GetMapping("/employees")
		public List<User> getEmployees() {
			User user = new User();
			List<User> users = new ArrayList<>();
			users.add(user);
			return users;
		}
}

