package com.lab24.Lab24.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lab24.Lab24.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
	

}
