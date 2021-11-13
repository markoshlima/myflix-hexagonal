package com.myflix.adapter.rest;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.myflix.domain.model.Actor;
import com.myflix.domain.model.Character;
import com.myflix.domain.port.in.ActorPortIn;

@RestController
@RequestMapping("actor")
public class ActorController {

	@Autowired
	private ActorPortIn actorService;
    
	@PostMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
    public Actor save(@RequestBody Actor actor){
		return actorService.save(actor);
	}
	
	@DeleteMapping(path = "/{actorId}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public void delete(@PathVariable UUID actorId){
		actorService.delete(actorId);
	}
	
	@GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public List<Actor> getAll(){
		return actorService.getAll();
	}

	@GetMapping(path = "/{actorId}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public Actor get(@PathVariable UUID actorId){
		return actorService.get(actorId);
	}
    
	@PostMapping(path = "{actorId}/movie/{movieId}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public void doCharacter(@PathVariable UUID actorId, @PathVariable UUID movieId, @RequestBody String name){
		actorService.doCharacter(actorId, movieId, name);
	}
    
	@GetMapping(path = "/{actorId}/movie", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public List<Character> getCharacters(@PathVariable UUID actorId){
		return actorService.getCharacters(actorId);
    }	
	
}
