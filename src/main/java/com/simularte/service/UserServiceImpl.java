package com.simularte.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public String saludar() {
		String saludo = "Buenas noches desde Service, Massimo.";
		
		return saludo;
	}

}
