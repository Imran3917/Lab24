package com.lab24.Lab24.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lab24.Lab24.entity.Coffee;

public interface CoffeeRepository extends JpaRepository<Coffee, Integer>{

	void deleteByname(String name);

}
