package com.tutorial.springboot.webapp.loginsampleapp.component;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class LoginValidationComponent {

	private static final String USERNAME = "admin";
	private static final String PASSWORD = "password";

	public boolean isValidate(String authHeader) {
		if (StringUtils.hasText(authHeader)) {
			byte[] decodedCreds = Base64.getDecoder().decode(authHeader);
			String creds = new String(decodedCreds, StandardCharsets.UTF_8);
			String[] parts = creds.split(":");
			return (USERNAME.equals(parts[0]) && PASSWORD.equals(parts[1]));
		}
		return false;
	}
}
