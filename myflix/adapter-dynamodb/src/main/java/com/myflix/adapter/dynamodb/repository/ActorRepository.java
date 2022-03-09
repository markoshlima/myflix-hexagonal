package com.myflix.adapter.dynamodb.repository;

import com.myflix.adapter.dynamodb.model.ActorDynamodb;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository("actorRepositoryDynamodb")
@EnableScan
public interface ActorRepository extends CrudRepository<ActorDynamodb, String> {
    ArrayList<ActorDynamodb> findAll();
}
