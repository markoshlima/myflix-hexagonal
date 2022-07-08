package com.myflix.adapter.grpc.service;


import com.myflix.adapter.grpc.protofiles.customer.CustomerServiceGrpc.*;
import com.myflix.domain.port.in.CustomerPortIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService extends CustomerServiceImplBase {

    @Autowired
	private CustomerPortIn customerService;

}