package com.myflix.domain.port.out;

import com.myflix.domain.model.Actor;

import java.util.List;
import java.util.UUID;

public interface ActorPortOut {

	Actor save(Actor actor);
	
	void delete(UUID actorId);

	List<Actor> getAll();

    Actor getById(UUID actorId);
    
}
