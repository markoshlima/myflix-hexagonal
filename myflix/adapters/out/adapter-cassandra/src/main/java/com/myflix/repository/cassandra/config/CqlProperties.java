package com.myflix.repository.cassandra.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:cql.properties")
public class CqlProperties {

}
