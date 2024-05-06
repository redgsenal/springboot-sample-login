package com.tutorial.springboot.webapp.loginsampleapp.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.tutorial.springboot.webapp.loginsampleapp.interceptor.BasicAuthInterceptor;
import com.tutorial.springboot.webapp.loginsampleapp.interceptor.LogInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LogInterceptor());
		registry.addInterceptor(new BasicAuthInterceptor());
	}
}
