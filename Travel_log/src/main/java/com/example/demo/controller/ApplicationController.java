package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.services.UserService;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;

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

	@PostMapping("/saveuser")
	public String registerUser(@ModelAttribute User user, BindingResult bindingResult, HttpServletRequest request) {
		UserService.saveMyUser(user);
		request.setAttribute("mode", "MODE_SIGNUP");
		return "signin";
	}

	@GetMapping("/userHome")
	public String userHomePage(HttpServletRequest request) {
		request.setAttribute("users", UserService.showAllUsers());
		for (User user : UserService.showAllUsers()) {

			System.out.print("****************");
			System.out.print(user);
			System.out.println("****************");

		}
		request.setAttribute("mode", "MODE_HOME");
		return "userHome";

	}

	@RequestMapping("/signin")
	public String SignIn() {
		return "signin";
	}
	
	
	@RequestMapping("/ck")
	public String welcome(ModelMap model) {
	    model.addAttribute("message", "Dream World");
	    System.out.println("ck fk");
	    return "userHome";
	}

}
