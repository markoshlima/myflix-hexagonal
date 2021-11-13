package com.myflix.adapter.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.myflix.domain.model.Actor;
import com.myflix.domain.port.out.ActorPortOut;

import org.springframework.stereotype.Repository;

@Repository("actorList")
public class ActorRepository implements ActorPortOut {
	
	private List<Actor> actors = new ArrayList<Actor>();
	
	@Override
	public void delete(UUID actorId) {
		actors.removeIf(a -> a.getIdActor().equals(actorId));
	}
	
	@Override
	public Actor getById(UUID actorId) {
		for (Actor a : actors){
			if(a.getIdActor().equals(actorId)){
				return a;
			}
		}
		return null;
	}
	@Override
	public List<Actor> getAll() {
		return actors;
	}
	
	@Override
	public Actor save(Actor a) {
		a.setIdActor(UUID.randomUUID());
		actors.add(a);
		return a;		
	}

	
}
