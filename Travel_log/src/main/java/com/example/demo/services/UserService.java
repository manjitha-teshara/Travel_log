package com.example.demo.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserService {
	
	private static UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	public static void saveMyUser(User user) {
		userRepository.save(user);
	}
	
	public static List<User> showAllUsers() {
		List<User> users=new ArrayList<User>();
		for(User user1:userRepository.findAll()) {
			users.add(user1);
			System.out.println("################");
			System.out.print(user1);
			System.out.println("################");

		}
		return users;
	}
}
