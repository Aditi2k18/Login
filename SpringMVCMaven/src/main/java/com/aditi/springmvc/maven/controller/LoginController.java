package com.aditi.springmvc.maven.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aditi.springmvc.maven.service.LoginService;
@Controller
public class LoginController {
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request ,HttpServletResponse response) {
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		LoginService ls = new LoginService();		
		ModelAndView mv=ls.validateLogin(username,password);
		return mv;
	}
	
}
