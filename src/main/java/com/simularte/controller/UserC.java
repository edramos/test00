package com.simularte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserC {

	@RequestMapping(value = "userGetSaludo", method = RequestMethod.GET)
	public String userGetSaludo(Model model){
		String path = "";
		
		model.addAttribute("saludo", "Buenas Madrugadas");
		path = "saludo";
		
		return path;
	}
}
