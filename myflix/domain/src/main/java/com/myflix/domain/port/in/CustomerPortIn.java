package com.myflix.domain.port.in;

import com.myflix.domain.model.Customer;
import com.myflix.domain.model.Watch;

import java.util.List;
import java.util.UUID;

public interface CustomerPortIn{

	Customer save(Customer customer);
	
	void delete(UUID customerId);
	
	List<Customer> getAll();

    Customer get(UUID customerId);
    
    void watch(UUID customerId, UUID movieId);
    
    List<Watch> getMoviesWatched(UUID customerId);
    
}
