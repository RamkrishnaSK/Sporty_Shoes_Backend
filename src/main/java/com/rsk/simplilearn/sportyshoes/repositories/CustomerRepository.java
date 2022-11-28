package com.rsk.simplilearn.sportyshoes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rsk.simplilearn.sportyshoes.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	public Customer findByEmail(String theEmail);
}  
