package com.retailstore.retaildiscount.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.retailstore.retaildiscount.customer.Customer;




@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

	public Customer findByCustomerId(String customerID);
}
