package com.retailstore.retaildiscount.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retailstore.retaildiscount.repository.CustomerRepository;

@Service
public class CustomerService implements ICustomerService{

	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public Customer fatchCustomer(String customerID) {
		return customerRepository.findByCustomerId(customerID);
	}
	
	

}
