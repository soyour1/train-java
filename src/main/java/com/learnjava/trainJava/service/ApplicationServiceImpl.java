//package com.learnjava.trainJava.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.learnjava.trainJava.repository.ProjectsRepository;
//import com.learnjava.trainJava.entity.Application;
//import com.learnjava.trainJava.entity.Projects;
//import com.learnjava.trainJava.repository.ApplicationRepository;
//
//@Service
//public class ApplicationServiceImpl implements ApplicationService {
//	
//	@Autowired
//	private ApplicationRepository userRepository;
//	
//	@Autowired
//	private ProjectsRepository itemsRepository;
//	
//	@Override
//	public Application saveUser(Application user) {
//		return userRepository.save(user);
//	}
//	
//	@Override
//	public List<Projects> getAllApplication() {
//		return itemsRepository.findAll();
//	}
//	
//	@Override
//	public Optional<Application> getUser(int id) {
//		return userRepository.findById(id);
//	}
//	
//	@Override
//	public List<Projects> listAll() {
//		return itemsRepository.findAll();
//	}
//	
//	@Override
//	public void deleteUser(int id) {
//		userRepository.deleteById(id);
//	}
//	
//	@Override
//	public List<Application> getAllUser() {
//		return userRepository.findAll();
//	}
//	
//}
