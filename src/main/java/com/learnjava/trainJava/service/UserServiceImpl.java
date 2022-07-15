package com.learnjava.trainJava.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnjava.trainJava.model.Items;
import com.learnjava.trainJava.model.User;
import com.learnjava.trainJava.repository.ItemsRepository;
import com.learnjava.trainJava.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ItemsRepository itemsRepository;
	
	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	@Override
	public List<Items> getAllApplication() {
		return itemsRepository.findAll();
	}
	
	@Override
	public Optional<User> getUser(int id) {
		return userRepository.findById(id);
	}
	
	@Override
	public List<Items> listAll() {
		return itemsRepository.findAll();
	}
	
	@Override
	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}
	
	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}
	
}
