package com.example.demo.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.ModelMap;

@Controller
public class ApplicationController {
	
	
	@RequestMapping("/welcome")
	public String Welcome(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_HOME");
		return "welcomepage";
	}
	
	@RequestMapping("/signup")
	public String SignUp(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_SIGNUP");
		return "signup";
	}
	
	
	@RequestMapping("/signin")
	public String SignIn() {
		return "signin";
	}
	
}
