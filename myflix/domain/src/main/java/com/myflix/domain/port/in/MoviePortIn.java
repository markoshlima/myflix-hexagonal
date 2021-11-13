package com.myflix.domain.port.in;

import com.myflix.domain.model.Movie;
import com.myflix.domain.model.Character;
import com.myflix.domain.model.Watch;

import java.util.List;
import java.util.UUID;

public interface MoviePortIn {

	Movie save(Movie movie);
	
	void delete(UUID movieId);
	
	List<Movie> getAll();

    Movie get(UUID movieId);
    
    List<Character> getCharacters(UUID movieId);
    
    List<Watch> getMoviesWatched(UUID movieId);
    
}
