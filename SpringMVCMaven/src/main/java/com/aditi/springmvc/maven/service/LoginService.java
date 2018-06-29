package com.aditi.springmvc.maven.service;

import org.springframework.web.servlet.ModelAndView;

public class LoginService {
	private ModelAndView validate(String user,String password)
	 {  ModelAndView mv;
	 if(("aditi".equals(user))&&("debjit".equals(password))){
			mv=new ModelAndView();
			mv.addObject("user",user);
			mv.setViewName("LoggedinHome.jsp");
		}
		else {
			mv=new ModelAndView();
			mv.setViewName("Error.jsp");
		}
		return mv;
		
	 }
	public ModelAndView validateLogin(String user,String password) {
	  System.out.println("inside validate(String user,String password)");
		return (validate(user,password));
			    
	}
	
}
