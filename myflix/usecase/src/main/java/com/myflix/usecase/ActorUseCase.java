package com.myflix.usecase;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myflix.domain.model.Actor;
import com.myflix.domain.model.Character;
import com.myflix.domain.port.in.ActorPortIn;
import com.myflix.domain.port.out.ActorPortOut;
import com.myflix.domain.port.out.CharacterPortOut;

@Component
public class ActorUseCase implements ActorPortIn  {
	
	@Autowired
	//@Qualifier("actorCassandra")
	private ActorPortOut actorRepository;
		
	@Autowired
	//@Qualifier("characterCassandra")
	private CharacterPortOut characterRepository;
	
	@Override
	public void delete(UUID actorId) {
		try{
			if(this.getCharacters(actorId).size() == 0){
				actorRepository.delete(actorId);
			}else{
				throw new Exception("This actor does any character");
			}
		} catch(Exception e){
			e.printStackTrace();
		}			
	}

	@Override
	public void doCharacter(UUID actorId, UUID movieId, String name) {
		try{
			characterRepository.save(actorId, movieId, name);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Actor get(UUID actorId) {
		return actorRepository.getById(actorId);
	}

	@Override
	public List<Actor> getAll() {
		return actorRepository.getAll();
	}

	@Override
	public List<Character> getCharacters(UUID actorId) {
		return characterRepository.getByActor(actorId);
	}

	@Override
	public Actor save(Actor actor) {
		try{
			return actorRepository.save(actor);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

    
}
