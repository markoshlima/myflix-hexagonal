package com.myflix.adapter.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.myflix.domain.model.Character;
import com.myflix.domain.port.out.CharacterPortOut;

import org.springframework.stereotype.Repository;

@Repository("characterList")
public class CharacterRepository implements CharacterPortOut {
	
	private List<Character> characters = new ArrayList<Character>();

	@Override
	public List<Character> getByActor(UUID id) {
		List<Character> cs = new ArrayList<Character>();
		for (Character c : characters){
			if(c.getIdActor().equals(id)){
				cs.add(c);
			}
		}
		return cs;
	}

	@Override
	public List<Character> getByMovie(UUID id) {
		List<Character> cs = new ArrayList<Character>();
		for (Character c : characters){
			if(c.getIdMovie().equals(id)){
				cs.add(c);
			}
		}
		return cs;
	}

	@Override
	public void save(UUID actorId, UUID movieId, String name) {
		Character c = new Character();
		c.setIdActor(actorId);
		c.setIdMovie(movieId);
		c.setName(name);
		characters.add(c);	
	}
	
	
}
