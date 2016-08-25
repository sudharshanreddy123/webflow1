package com.niit.shoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.shoppingcart.model.UserDetails;
import com.niit.shoppingcart.dao.UserDetailsDAO;
@Controller
public class RegistrationController {

	
	@RequestMapping("home")
	public String home(){
		return "index";
	}
	
	
	@RequestMapping("/home")
	public String registerUser(@ModelAttribute UserDetails userDetails){
		System.out.println("registerUser");
		UserDetailsDAO userDetailsDAO = null;
		userDetailsDAO.saveOrUpdate(userDetails);
		return "index";
	}

}
