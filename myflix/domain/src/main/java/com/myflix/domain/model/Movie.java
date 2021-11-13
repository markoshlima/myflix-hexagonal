package com.myflix.domain.model;

import java.util.UUID;

public class Movie {

	private UUID idMovie;
    private String name;
    private Integer year;
    
	public UUID getIdMovie() {
		return idMovie;
	}
	public void setIdMovie(UUID idMovie) {
		this.idMovie = idMovie;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}

}
