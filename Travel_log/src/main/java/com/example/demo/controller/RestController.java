package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.User;
import com.example.demo.services.UserService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String hello() {
		return "This is Home page";
	}
	@GetMapping("/saveuser")
	public String saveUser(@RequestParam String username,@RequestParam String fname,@RequestParam String lname,@RequestParam String email,@RequestParam String password) {
		User user = new User(username,fname,lname,email,password);
		userService.saveMyUser(user);
		return "User Saved";
	}
}
