package com.myflix.domain.model;

import java.util.UUID;

public class Actor {

	private UUID idActor;
    private String name;
    private Long birthDate;
    
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
	public Long getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Long birthDate) {
		this.birthDate = birthDate;
	}
    
}
