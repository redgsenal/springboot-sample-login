package com.tutorial.springboot.webapp.loginsampleapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
	

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		return "login";
	}
	
	/*
	 * @RequestMapping(value = "/validate", method = RequestMethod.POST) public
	 * String validateLogin(ModelMap model, @RequestParam String name, @RequestParam
	 * String password) { return "login"; }
	 */
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String showWelcomePage(ModelMap model) {

		//model.put("name", name);
		//model.put("password", password);

		return "welcome";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String showLogoutPage(ModelMap model) {
		return "login";
	}

}