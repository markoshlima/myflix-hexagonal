package com.myflix.adapter.dynamodb.service;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.myflix.adapter.dynamodb.config.DynamoDBDriver;
import com.myflix.adapter.dynamodb.model.ActorDynamodb;
import com.myflix.adapter.dynamodb.model.CustomerDynamodb;
import com.myflix.adapter.dynamodb.model.mapper.ActorMapper;
import com.myflix.adapter.dynamodb.model.mapper.CustomerMapper;
import com.myflix.adapter.dynamodb.repository.ActorRepository;
import com.myflix.adapter.dynamodb.repository.CustomerRepository;
import com.myflix.domain.model.Actor;
import com.myflix.domain.model.Customer;
import com.myflix.domain.port.out.CustomerPortOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service("customerDynamodb")
public class CustomerService implements CustomerPortOut {

    @Autowired
    CustomerRepository repository;

    DynamoDBMapper mapper;

    public CustomerService(){
        mapper = new DynamoDBMapper(new DynamoDBDriver().amazonDynamoDB());
    }

    @Override
    public Customer save(Customer customer) {
        CustomerDynamodb c = CustomerMapper.mapperToCustomerDynamodb(customer);
        mapper.save(c);
        return customer;
    }

    @Override
    public void delete(UUID customerId) {
        repository.delete(CustomerMapper.mapperToCustomerDynamodb(this.getById(customerId)));
    }

    @Override
    public List<Customer> getAll() {
        ArrayList<CustomerDynamodb> list = repository.findAll();
        ArrayList<Customer> customers = new ArrayList<>();
        if(list.size() > 0){
            for (CustomerDynamodb c : list) {
                customers.add(CustomerMapper.mapperToCustomer(c));
            }
        }
        return customers;
    }

    @Override
    public Customer getById(UUID customerId) {
        Optional<CustomerDynamodb> response = repository.findById(customerId.toString());
        return CustomerMapper.mapperToCustomer(response.get());
    }
}
