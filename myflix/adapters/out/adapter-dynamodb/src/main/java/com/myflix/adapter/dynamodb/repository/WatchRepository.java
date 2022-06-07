package com.myflix.adapter.dynamodb.repository;

import com.myflix.adapter.dynamodb.model.WatchDynamodb;
import com.myflix.adapter.dynamodb.model.WatchIdDynamodb;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository("watchRepositoryDynamodb")
@EnableScan
public  interface WatchRepository extends CrudRepository<WatchDynamodb, WatchIdDynamodb> {
    ArrayList<WatchDynamodb> findAll();
}
