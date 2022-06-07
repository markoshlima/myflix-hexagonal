package com.myflix.adapter.rest;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.myflix.domain.model.Watch;
import com.myflix.domain.model.Customer;
import com.myflix.domain.port.in.CustomerPortIn;

@RestController
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	private CustomerPortIn customerService;
    
	@PostMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
    public Customer save(@RequestBody Customer customer){
		return customerService.save(customer);
	}
	
	@DeleteMapping(path = "/{customerId}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public void delete(@PathVariable UUID customerId){
		customerService.delete(customerId);
	}
	
	@GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public List<Customer> getAll(){
		return customerService.getAll();
	}

	@GetMapping(path = "/{customerId}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public Customer get(@PathVariable UUID customerId){
		return customerService.get(customerId);
	}
    
	@PostMapping(path = "/{customerId}/movie/{movieId}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public void watch(@PathVariable UUID customerId, @PathVariable UUID movieId){
		customerService.watch(customerId, movieId);
	}
    
	@GetMapping(path = "/{customerId}/movie", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public List<Watch> getMoviesWatched(@PathVariable UUID customerId){
		return customerService.getMoviesWatched(customerId);
    }
	
}
