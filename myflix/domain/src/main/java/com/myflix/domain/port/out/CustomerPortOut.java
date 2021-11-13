package com.myflix.domain.port.out;

import com.myflix.domain.model.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerPortOut {

	Customer save(Customer customer);
	
	void delete(UUID customerId);

	List<Customer> getAll();

    Customer getById(UUID customerId);
    
}
