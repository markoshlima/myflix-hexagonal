package com.myflix.adapter.dynamodb.model.mapper;

import com.myflix.adapter.dynamodb.model.CharacterDynamodb;
import com.myflix.domain.model.Character;

import java.util.UUID;

public class CharacterMapper {

    public static Character mapperToCharacter(CharacterDynamodb c){
        Character character = new Character();
        character.setIdActor(UUID.fromString(c.getIdActor()));
        character.setIdMovie(UUID.fromString(c.getIdMovie()));
        character.setName(c.getName());
        return character;
    }

}
