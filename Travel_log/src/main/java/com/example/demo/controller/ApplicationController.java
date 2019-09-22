package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.ModelMap;

@Controller
public class ApplicationController {
	
	
	@RequestMapping("/welcome")
	public String Welcome() {
		return "welcomepage";
	}
}
