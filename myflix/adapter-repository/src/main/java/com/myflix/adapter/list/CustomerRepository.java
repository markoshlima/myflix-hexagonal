package com.myflix.adapter.list;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.myflix.domain.model.Customer;
import com.myflix.domain.port.out.CustomerPortOut;

@Repository("customerList")
public class CustomerRepository implements CustomerPortOut {
	
	private List<Customer> customers = new ArrayList<Customer>();
	
	@Override
	public void delete(UUID customerId) {
		customers.removeIf(c -> c.getIdCustomer().equals(customerId));
	}
	
	@Override
	public Customer getById(UUID customerId) {
		for (Customer c : customers){
			if(c.getIdCustomer().equals(customerId)){
				return c;
			}
		}
		return null;
	}
	
	@Override
	public List<Customer> getAll() {
		return customers;
	}
	
	@Override
	public Customer save(Customer c) {
		c.setIdCustomer(UUID.randomUUID());
		customers.add(c);
		return c;
		
	}
	
}
