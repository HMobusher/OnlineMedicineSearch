package com.mobusher.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.mobusher.dao.UserRepo;
import com.mobusher.model.User;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;

	public List<User> retrieveAllUsers() {
		userRepo.findAll().forEach(System.out::println);
		return (List<User>)userRepo.findAll();
	}

	public Optional<User> getUserById(int id) {
		return userRepo.findById(id);
	}

	public void addUser(User user) {
		userRepo.save(user);
	}

	public void deleteUserById(int id) {
		userRepo.deleteById(id);
	}
	public void updateUser(User user) {
		userRepo.save(user);
	}
	
}


