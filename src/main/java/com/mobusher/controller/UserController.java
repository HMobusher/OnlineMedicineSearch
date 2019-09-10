package com.mobusher.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobusher.model.User;
import com.mobusher.service.UserService;


@RestController
@RequestMapping(path="/")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/getAllUsers")
	public List<User> getAllUsers(){
		return userService.retrieveAllUsers();
	}
	
	@PostMapping("/addUser")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}
	
	@GetMapping("/getUser/{id}")
	public Optional<User> getUserById(@PathVariable int id) {
		return userService.getUserById(id);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public void deleteUserById(@PathVariable int id){
		userService.deleteUserById(id);
	}
	
	@PutMapping("/updateUser/{id}")
	public void updateUser(@RequestBody User user ,@PathVariable int id) {
		user.setId(id); 
		userService.updateUser(user);
	}
}
	