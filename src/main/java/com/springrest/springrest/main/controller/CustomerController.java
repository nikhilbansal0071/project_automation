package com.springrest.springrest.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.main.model.Customers;

import com.springrest.springrest.main.service.CustomerServiceImpl;

@RestController
@RequestMapping("/Customers")
public class CustomerController {

	@Autowired
	private CustomerServiceImpl customerserviceimpl;
	
	@PostMapping("/addCustomer")
	public Customers addCustomer(@RequestBody Customers customers) {
		return customerserviceimpl.saveCustomers(customers);
	}
 
}
