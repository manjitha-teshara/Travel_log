package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.ModelMap;

//@RestController
@Controller
public class ApplicationController {
	@ResponseBody
	@RequestMapping("/home")
	public String Hello() {
		return "Hello Travel Log start 1";
	}
	
	@RequestMapping("/welcome")
	public String Welcome() {
		return "welcomepage";
	}
}
