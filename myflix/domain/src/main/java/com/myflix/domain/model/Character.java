package com.myflix.domain.model;

import java.util.UUID;

public class Character {

	private UUID idMovie;
    private UUID idActor;
    private String name;
    
	public UUID getIdMovie() {
		return idMovie;
	}
	public void setIdMovie(UUID idMovie) {
		this.idMovie = idMovie;
	}
	public UUID getIdActor() {
		return idActor;
	}
	public void setIdActor(UUID idActor) {
		this.idActor = idActor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
        
}

