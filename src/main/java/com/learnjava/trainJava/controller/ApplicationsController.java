package com.learnjava.trainJava.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnjava.trainJava.entity.Application;
import com.learnjava.trainJava.entity.Projects;
import com.learnjava.trainJava.service.ApplicationService;
import com.learnjava.trainJava.service.dto.request.ApplicationRequestDto;

@RestController
@RequestMapping("/api")
public class ApplicationsController {
	
	@Autowired
	private ApplicationService applicationService;
	
	@PostMapping("/application")
	public Application addApplication(@RequestBody @Valid ApplicationRequestDto request) {
		return applicationService.saveUser(request);
	}
	
	@DeleteMapping("/application/{id}")
	public void deleteUser(@PathVariable(value ="id") int id) {
		applicationService.deleteUser(id);
	}
	

	@GetMapping("/application")
	public List<Application> getAllApplication(){
		return applicationService.getAllApplication();
	}
	
	@GetMapping("/projects")
	public List<Projects> getAllProject(){
		return applicationService.getAllProject();
	}
}
