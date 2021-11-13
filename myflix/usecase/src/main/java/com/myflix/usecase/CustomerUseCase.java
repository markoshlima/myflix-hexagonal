package com.myflix.usecase;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myflix.domain.model.Customer;
import com.myflix.domain.model.Watch;
import com.myflix.domain.port.in.CustomerPortIn;
import com.myflix.domain.port.out.CustomerPortOut;
import com.myflix.domain.port.out.WatchPortOut;

@Component
public class CustomerUseCase implements CustomerPortIn  {

	@Autowired
	//@Qualifier("customerCassandra")
	private CustomerPortOut customerRepository;
	
	@Autowired
	//@Qualifier("watchCassandra")
	private WatchPortOut watchRepository;
		
	@Override
	public void delete(UUID customerId) {
		try{
			if(watchRepository.getByCustomer(customerId).size() == 0){
				customerRepository.delete(customerId);
			}else{
				throw new Exception("this customer already watched a movie");
			}
		} catch(Exception e){
			e.printStackTrace();
		}	
		
	}

	@Override
	public Customer get(UUID customerId) {
		return customerRepository.getById(customerId);
	}

	@Override
	public List<Customer> getAll() {
		return customerRepository.getAll();
	}

	@Override
	public List<Watch> getMoviesWatched(UUID customerId) {
		return watchRepository.getByCustomer(customerId);
	}

	@Override
	public Customer save(Customer customer) {
		try{
			return customerRepository.save(customer);
		} catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void watch(UUID customerId, UUID movieId) {
		try{
			watchRepository.insert(customerId, movieId);
		} catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
