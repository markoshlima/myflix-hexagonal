package com.myflix.domain.port.in;

import com.myflix.domain.model.Actor;
import com.myflix.domain.model.Character;

import java.util.List;
import java.util.UUID;

public interface ActorPortIn {

	Actor save(Actor actor);
	
	void delete(UUID actorId);
	
	List<Actor> getAll();

    Actor get(UUID actorId);
    
    void doCharacter(UUID actorId, UUID movieId, String name);
    
    List<Character> getCharacters(UUID actorId);
    
}
