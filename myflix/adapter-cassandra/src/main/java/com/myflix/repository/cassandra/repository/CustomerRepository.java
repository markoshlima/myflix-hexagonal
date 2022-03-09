package com.myflix.repository.cassandra.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.datastax.oss.driver.api.core.cql.ResultSet;
import com.datastax.oss.driver.api.core.cql.Row;
import com.myflix.repository.cassandra.database.CassandraDriver;
import com.myflix.domain.model.Customer;
import com.myflix.domain.port.out.CustomerPortOut;

@Repository("customerCassandra")
public class CustomerRepository implements CustomerPortOut {
	
	@Autowired
	private CassandraDriver driver;
	
	@Value("${customer.getall}")
	private String customerGetAll;
	
	@Value("${customer.insert}")
	private String customerInsert;
	
	@Value("${customer.delete}")
	private String customerDelete;
	
	@Value("${customer.get}")
	private String customerGet;
	
	@Override
	public Customer save(Customer customer) {
		customer.setIdCustomer(UUID.randomUUID());
		driver.getSession().execute(customerInsert, customer.getIdCustomer(), customer.getName(), customer.getBirthDate());                    
        return customer;
		
	}

	@Override
	public void delete(UUID customerId) {
		driver.getSession().execute(customerDelete, customerId);
	}

	@Override
	public List<Customer> getAll() {
		List<Customer> customers = new ArrayList<Customer>();
        ResultSet rs = driver.getSession().execute(customerGetAll);
        for(Row row : rs) {
        	Customer customer = new Customer();
        	customer.setIdCustomer(row.getUuid("id_customer"));
        	customer.setName(row.getString("name"));
        	customer.setBirthDate(row.getLong("birth_date"));
            customers.add(customer);
        }
		return customers;
	}

	@Override
	public Customer getById(UUID customerId) {
		Customer customer = new Customer();
        ResultSet rs = driver.getSession().execute(customerGet, customerId);
        Row row = rs.one();
        if(row != null) {
        	customer.setIdCustomer(row.getUuid("id_customer"));
        	customer.setName(row.getString("name"));
        	customer.setBirthDate(row.getLong("birth_date"));
        }
		return customer;
	}
	
}
