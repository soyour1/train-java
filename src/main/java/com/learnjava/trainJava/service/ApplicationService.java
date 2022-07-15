package com.learnjava.trainJava.service;

import java.util.List;
import java.util.Optional;

import com.learnjava.trainJava.entity.Application;
import com.learnjava.trainJava.entity.Projects;
import com.learnjava.trainJava.service.dto.request.ApplicationRequestDto;



public interface ApplicationService {
	public Application saveUser(ApplicationRequestDto request);
	public List<Projects> getAllProject();
	public Optional<Application> getApplicationDetail(int id); 
	public List<Projects> listProjects(); 
	public void deleteUser(int id); 
	
	public List<Application> getAllApplication();
}
