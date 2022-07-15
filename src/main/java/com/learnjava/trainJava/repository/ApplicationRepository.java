package com.learnjava.trainJava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnjava.trainJava.entity.Application;

public interface ApplicationRepository extends JpaRepository<Application, Integer>{

}
