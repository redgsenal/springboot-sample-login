package com.tutorial.springboot.webapp.loginsampleapp.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tutorial.springboot.webapp.loginsampleapp.component.LoginValidationComponent;
import com.tutorial.springboot.webapp.loginsampleapp.service.LoginValidationService;

@Configuration
public class LoginValidationServiceConfiguration {
	
	@Autowired
	LoginValidationComponent loginValidationComponent;

	@Bean
	LoginValidationService loginValidationService() {
		return new LoginValidationService() {
			@Override
			public boolean validateUser(String authHead) {
				return loginValidationComponent.isValidate(authHead);
			}
		};		
	}
}
