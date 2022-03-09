package com.myflix.adapter.dynamodb.service;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.myflix.adapter.dynamodb.config.*;
import com.myflix.adapter.dynamodb.model.ActorDynamodb;
import com.myflix.adapter.dynamodb.model.mapper.ActorMapper;
import com.myflix.adapter.dynamodb.repository.ActorRepository;
import com.myflix.domain.model.Actor;
import com.myflix.domain.port.out.ActorPortOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service("actorDynamodb")
public class ActorService implements ActorPortOut{

    @Autowired
    ActorRepository repository;

    DynamoDBMapper mapper;

    public ActorService(){
        mapper = new DynamoDBMapper(new DynamoDBDriver().amazonDynamoDB());
    }

    @Override
    public Actor save(Actor actor) {
        ActorDynamodb a = ActorMapper.mapperToActorDynamodb(actor);
        mapper.save(a);
        return actor;
    }

    @Override
    public void delete(UUID actorId) {
        repository.delete(ActorMapper.mapperToActorDynamodb(this.getById(actorId)));
    }

    @Override
    public List<Actor> getAll() {
        ArrayList<ActorDynamodb> list = repository.findAll();
        ArrayList<Actor> actors = new ArrayList<>();
        if(list.size() > 0){
            for (ActorDynamodb a : list) {
                actors.add(ActorMapper.mapperToActor(a));
            }
        }
        return actors;
    }

    @Override
    public Actor getById(UUID actorId) {
        Optional<ActorDynamodb> response = repository.findById(actorId.toString());
        return ActorMapper.mapperToActor(response.get());
    }
}
