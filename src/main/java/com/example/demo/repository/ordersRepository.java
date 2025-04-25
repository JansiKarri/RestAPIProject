package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.orders;

@Repository
public interface ordersRepository extends JpaRepository<orders, Integer> {

	orders findByEmail(String email);
	
	

}
