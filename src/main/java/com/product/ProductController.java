package com.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/")
public class ProductController {
	
	@RequestMapping(value="/")
	public String getProduct(){
		return "index";
	}
	
}
