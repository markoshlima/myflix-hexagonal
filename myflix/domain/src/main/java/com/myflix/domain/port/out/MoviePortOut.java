package com.myflix.domain.port.out;

import com.myflix.domain.model.Movie;

import java.util.List;
import java.util.UUID;

public interface MoviePortOut {

	Movie save(Movie movie);
	
	void delete(UUID idMovie);

	List<Movie> getAll();

    Movie getById(UUID idMovie);
    
}
