package com.myflix.adapter.dynamodb.model.mapper;

import com.myflix.adapter.dynamodb.model.ActorDynamodb;
import com.myflix.domain.model.Actor;

import java.util.UUID;

public class ActorMapper {

    public static Actor mapperToActor(ActorDynamodb a){
        Actor actor = new Actor();
        actor.setIdActor(UUID.fromString(a.getIdActor()));
        actor.setName(a.getName());
        actor.setBirthDate(Long.parseLong(a.getBirthDate()));
        return actor;
    }

    public static ActorDynamodb mapperToActorDynamodb(Actor a){
        ActorDynamodb actor = new ActorDynamodb();
        actor.setIdActor(a.getIdActor().toString());
        actor.setName(a.getName());
        actor.setBirthDate(a.getBirthDate().toString());
        return actor;
    }

}
