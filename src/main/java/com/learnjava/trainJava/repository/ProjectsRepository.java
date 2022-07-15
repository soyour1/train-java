package com.learnjava.trainJava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnjava.trainJava.entity.Projects;

public interface ProjectsRepository extends JpaRepository<Projects, Integer> {

}
