package com.webservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value="/")
public class ApplicationController {
	
	@RequestMapping(value="/")
	public String goHomePage(){
		return "index";
	}


}
