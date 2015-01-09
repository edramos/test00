package com.simularte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.simularte.form.UserBean;
import com.simularte.service.UserService;

@Controller
public class UserController {

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
	
	@RequestMapping(value = "getMessage", method = RequestMethod.POST)
	public String getMessage(@ModelAttribute("userBean") UserBean userBean, Model model){
		String path = "";
			
		String mensaje = "Buenas Madrugadas " + userBean.getNombre();
			
		if(userBean.getEmail()!= ""){
			mensaje += ", tu email es " + userBean.getEmail();
		}else{
			mensaje += ", creo que no tienes email";
		}
		model.addAttribute("saludo", mensaje);
		
		path = "saludo";
		
		return path;
	}
}
