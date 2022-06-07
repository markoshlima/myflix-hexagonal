package com.myflix.adapter.dynamodb.repository;

import com.myflix.adapter.dynamodb.model.CharacterDynamodb;
import com.myflix.adapter.dynamodb.model.CharacterIdDynamodb;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository("characterRepositoryDynamodb")
@EnableScan
public  interface CharacterRepository extends CrudRepository<CharacterDynamodb, CharacterIdDynamodb> {
    ArrayList<CharacterDynamodb> findAll();
}