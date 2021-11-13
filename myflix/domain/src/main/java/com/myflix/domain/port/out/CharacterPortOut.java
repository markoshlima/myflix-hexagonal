package com.myflix.domain.port.out;

import com.myflix.domain.model.Character;

import java.util.List;
import java.util.UUID;

public interface CharacterPortOut {

	void save(UUID actorId, UUID movieId, String name);
    
    List<Character> getByActor(UUID actorId);
    
    List<Character> getByMovie(UUID movieId);
    
}
