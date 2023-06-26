package com.springrest.springrest.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.main.model.Customers;

public interface CustomerRepo extends JpaRepository<Customers,Integer> {

}
