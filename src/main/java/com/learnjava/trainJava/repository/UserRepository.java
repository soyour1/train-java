package com.learnjava.trainJava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnjava.trainJava.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
