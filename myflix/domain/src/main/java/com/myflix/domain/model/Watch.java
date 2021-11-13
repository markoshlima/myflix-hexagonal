package com.myflix.domain.model;

import java.util.UUID;

public class Watch {

	private UUID idCustomer;
    private UUID idMovie;
    private Long date;
    
	public UUID getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(UUID idCustomer) {
		this.idCustomer = idCustomer;
	}
	public UUID getIdMovie() {
		return idMovie;
	}
	public void setIdMovie(UUID idMovie) {
		this.idMovie = idMovie;
	}
	public Long getDate() {
		return date;
	}
	public void setDate(Long date) {
		this.date = date;
	}
    
}
