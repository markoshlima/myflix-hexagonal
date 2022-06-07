package com.myflix.adapter.dynamodb.model.mapper;

import com.myflix.adapter.dynamodb.model.CustomerDynamodb;
import com.myflix.domain.model.Customer;

import java.util.UUID;

public class CustomerMapper {

    public static Customer mapperToCustomer(CustomerDynamodb c){
        Customer customer = new Customer();
        customer.setIdCustomer(UUID.fromString(c.getIdCustomer()));
        customer.setName(c.getName());
        customer.setBirthDate(Long.parseLong(c.getBirthDate()));
        return customer;
    }

    public static CustomerDynamodb mapperToCustomerDynamodb(Customer c){
        CustomerDynamodb customer = new CustomerDynamodb();
        customer.setBirthDate(c.getBirthDate().toString());
        customer.setIdCustomer(c.getIdCustomer().toString());
        customer.setName(c.getName());
        return customer;
    }

}
