package com.tutorial.springboot.webapp.loginsampleapp.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.tutorial.springboot.webapp.loginsampleapp.service.LoginValidationService;

import io.micrometer.common.util.StringUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class BasicAuthInterceptor implements HandlerInterceptor {

	private LoginValidationService loginService;

	public BasicAuthInterceptor(LoginValidationService loginService) {
		this.loginService = loginService;
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		log.info("BasicAuthInterceptor -> preHandle()");
		boolean valid = false;
		String authHeader = request.getHeader("Authorization");
		if (StringUtils.isNotEmpty(authHeader)) {
			valid = loginService.validateUser(authHeader);
		}
		if (!valid) {
			response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
			response.sendRedirect("/login");
		} else {
			response.sendRedirect("/welcome");
		}
		return valid;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		log.info("BasicAuthInterceptor -> postHandle()");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		log.info("BasicAuthInterceptor -> afterCompletion()");
	}
}
