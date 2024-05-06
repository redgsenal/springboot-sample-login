package com.tutorial.springboot.webapp.loginsampleapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.springboot.webapp.loginsampleapp.component.LoginValidationComponent;
import com.tutorial.springboot.webapp.loginsampleapp.service.LoginValidationService;

@Service
public class LoginValidationService {

	@Autowired
	LoginValidationComponent loginValidationComponent;
	
	public boolean validateUser(String authHead) {
		return loginValidationComponent.isValidate(authHead);
	}
}
