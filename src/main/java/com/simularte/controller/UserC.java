package com.simularte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.simularte.service.UserService;

@Controller
public class UserC {

	@Autowired
	UserService us;
	
	@RequestMapping(value = "userGetSaludo", method = RequestMethod.GET)
	public String userGetSaludo(Model model){
		String path = "";
		
		//model.addAttribute("saludo", "Buenas Madrugadas Massimo");
		
		model.addAttribute("saludo", us.saludar());
		
		path = "saludo";
		
		return path;
	}
}
