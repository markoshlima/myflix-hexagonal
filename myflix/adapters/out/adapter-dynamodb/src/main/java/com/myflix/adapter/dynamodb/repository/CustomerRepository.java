package com.myflix.adapter.dynamodb.repository;

import com.myflix.adapter.dynamodb.model.CustomerDynamodb;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository("customerRepositoryDynamodb")
@EnableScan
public  interface CustomerRepository extends CrudRepository<CustomerDynamodb, String> {
    ArrayList<CustomerDynamodb> findAll();
}
