package com.example.demo.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private static UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	public static void saveMyUser(User user) {
		userRepository.save(user);
	}
	
	public static List<User> showAllUsers() {
		List<User> users=new ArrayList<User>();
		for(User user:userRepository.findAll()) {
			users.add(user);
			System.out.print("################");
			System.out.print(user);
			System.out.println("################");

		}
		return users;
	}
}
