package com.tutorial.springboot.webapp.loginsampleapp.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validateUser(String userid, String password) {
		return "admin".contentEquals(userid) && "password".contentEquals(password);
	}
}
