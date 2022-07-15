package com.learnjava.trainJava.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnjava.trainJava.entity.Application;
import com.learnjava.trainJava.entity.Projects;
import com.learnjava.trainJava.repository.ApplicationRepository;
import com.learnjava.trainJava.repository.ProjectsRepository;
import com.learnjava.trainJava.service.ApplicationService;
import com.learnjava.trainJava.service.dto.request.ApplicationRequestDto;
import com.learnjava.trainJava.service.dto.request.ProjectRequestDto;

@Service
public class ApplicationServiceImpl implements ApplicationService {

	@Autowired
	private ApplicationRepository applicationRepository;

	@Autowired
	private ProjectsRepository projectsRepository;

	@Override
	@Transactional
	public Application saveUser(ApplicationRequestDto request) {
		return applicationRepository.save(toApplication(request));
	}

	@Override
	public List<Projects> getAllProject() {
		return projectsRepository.findAll();
	}

	@Override
	public Optional<Application> getApplicationDetail(int id) {
		return applicationRepository.findById(id);
	}

	@Override
	public List<Projects> listProjects() {
		return projectsRepository.findAll();
	}

	@Override
	public void deleteUser(int id) {
		applicationRepository.deleteById(id);
	}

	@Override
	public List<Application> getAllApplication() {
		return applicationRepository.findAll();
	}

	private Application toApplication(ApplicationRequestDto request) {
		Application entity = new Application();
		entity.setEmail(request.getEmail());
		entity.setName(request.getName());
		entity.setGitUser(request.getGitUser());
		List<Projects> projects = request.getProjects().stream()
				.map(this::toProjects)
				.collect(Collectors.toList());
		entity.setProjects(projects);
		return entity;
	}

	private Projects toProjects(ProjectRequestDto request) {
		Projects project = new Projects();
		BeanUtils.copyProperties(request, project);
		return project;
	}
}
