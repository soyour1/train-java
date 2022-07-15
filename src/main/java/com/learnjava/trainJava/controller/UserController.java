package com.learnjava.trainJava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnjava.trainJava.dto.UserRequest;
import com.learnjava.trainJava.model.Items;
import com.learnjava.trainJava.model.User;
import com.learnjava.trainJava.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/getAllItems")
	public List<Items> getAllItems(){
		return userService.getAllApplication();
	}
	
	@PostMapping("/add")
	public User placeOrder(@RequestBody UserRequest request) {
		return userService.saveUser(request.getUser());
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteUser(@PathVariable(value ="id") int id) {
		userService.deleteUser(id);
	}
	

	@GetMapping("/getAllUser")
	public List<User> getAllUser(){
		return userService.getAllUser();
	}
}
