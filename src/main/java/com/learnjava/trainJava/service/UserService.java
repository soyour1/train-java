package com.learnjava.trainJava.service;

import java.util.List;
import java.util.Optional;

import com.learnjava.trainJava.model.Items;
import com.learnjava.trainJava.model.User;



public interface UserService {
	public User saveUser(User user);
	public List<Items> getAllApplication(); // GET ALL ITEMS
	public Optional<User> getUser(int id); // GET USER DETAIL
	public List<Items> listAll(); // EXPORT PDF
	public void deleteUser(int id); // DELETE USER
	
	public List<User> getAllUser();
}
