package com.myflix.adapter.dynamodb.service;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.myflix.adapter.dynamodb.config.DynamoDBDriver;
import com.myflix.adapter.dynamodb.model.ActorDynamodb;
import com.myflix.adapter.dynamodb.model.CharacterDynamodb;
import com.myflix.adapter.dynamodb.model.mapper.ActorMapper;
import com.myflix.adapter.dynamodb.model.mapper.CharacterMapper;
import com.myflix.adapter.dynamodb.repository.ActorRepository;
import com.myflix.adapter.dynamodb.repository.CharacterRepository;
import com.myflix.domain.model.Actor;
import com.myflix.domain.model.Character;
import com.myflix.domain.port.out.CharacterPortOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service("characterDynamodb")
public class CharacterService implements CharacterPortOut {

    @Autowired
    CharacterRepository repository;

    DynamoDBMapper mapper;

    public CharacterService(){
        mapper = new DynamoDBMapper(new DynamoDBDriver().amazonDynamoDB());
    }

    @Override
    public void save(UUID actorId, UUID movieId, String name) {
        CharacterDynamodb c = new CharacterDynamodb();
        c.setName(name);
        c.setIdMovie(movieId.toString());
        c.setIdActor(actorId.toString());
        mapper.save(c);
    }

    @Override
    public List<Character> getByActor(UUID actorId) {
        ArrayList<CharacterDynamodb> list = repository.findAll();
        ArrayList<Character> characters = new ArrayList<>();
        if(list.size() > 0){
            for (CharacterDynamodb c : list) {
                if(c.getIdActor().equals(actorId.toString())) {
                    characters.add(CharacterMapper.mapperToCharacter(c));
                }
            }
        }
        return characters;
    }

    @Override
    public List<Character> getByMovie(UUID movieId) {
        ArrayList<CharacterDynamodb> list = repository.findAll();
        ArrayList<Character> characters = new ArrayList<>();
        if(list.size() > 0){
            for (CharacterDynamodb c : list) {
                if(c.getIdMovie().equals(movieId.toString())) {
                    characters.add(CharacterMapper.mapperToCharacter(c));
                }
            }
        }
        return characters;
    }
}
