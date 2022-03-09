package com.myflix.adapter.dynamodb.repository;

import com.myflix.adapter.dynamodb.model.MovieDynamodb;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository("movieRepositoryDynamodb")
@EnableScan
public  interface MovieRepository extends CrudRepository<MovieDynamodb, String> {
    ArrayList<MovieDynamodb> findAll();
}