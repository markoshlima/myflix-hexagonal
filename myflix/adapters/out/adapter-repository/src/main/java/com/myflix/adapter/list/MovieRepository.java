package com.myflix.adapter.list;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.myflix.domain.model.Movie;
import com.myflix.domain.port.out.MoviePortOut;

@Repository("movieList")
public class MovieRepository implements MoviePortOut {
	
	private List<Movie> movies = new ArrayList<Movie>();
	
	@Override
	public void delete(UUID movieId) {
		movies.removeIf(m -> m.getIdMovie().equals(movieId));
		
	}
	
	@Override
	public List<Movie> getAll() {
		return movies;
	}
	
	@Override
	public Movie getById(UUID movieId) {
		for (Movie m : movies){
			if(m.getIdMovie().equals(movieId)){
				return m;
			}
		}
		return null;
	}
	
	@Override
	public Movie save(Movie m) {
		m.setIdMovie(UUID.randomUUID());
		movies.add(m);
		return m;	
	}
		
	
}
