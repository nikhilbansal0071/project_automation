package com.springrest.springrest.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.main.model.Customers;
import com.springrest.springrest.main.repository.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepo customerrepo;
	
	public Customers saveCustomers(Customers customers) {
		return customerrepo.save(customers);
	}

}
