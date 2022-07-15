package com.learnjava.trainJava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnjava.trainJava.model.Items;

public interface ItemsRepository extends JpaRepository<Items, Integer> {

}
