package com.myflix.usecase;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myflix.domain.model.Character;
import com.myflix.domain.model.Movie;
import com.myflix.domain.model.Watch;
import com.myflix.domain.port.in.MoviePortIn;
import com.myflix.domain.port.out.CharacterPortOut;
import com.myflix.domain.port.out.MoviePortOut;
import com.myflix.domain.port.out.WatchPortOut;

@Component
public class MovieUseCase implements MoviePortIn {

	@Autowired
	//@Qualifier("movieCassandra")
	private MoviePortOut movieRepository;
	
	@Autowired
	//@Qualifier("characterCassandra")
	private CharacterPortOut characterRepository;
	
	@Autowired
	//@Qualifier("watchCassandra")
	private WatchPortOut watchRepository;
	
	@Override
	public void delete(UUID movieId) {
		try{
			if(characterRepository.getByMovie(movieId).size() == 0){
				movieRepository.delete(movieId);
			}else{
				throw new Exception("this movie has characteres");
			}
		} catch(Exception e){
			e.printStackTrace();
		}	
		
	}

	@Override
	public Movie get(UUID movieId) {
		return movieRepository.getById(movieId);
	}

	@Override
	public List<Movie> getAll() {
		return movieRepository.getAll();
	}

	@Override
	public List<Character> getCharacters(UUID movieId) {
		return characterRepository.getByMovie(movieId);
	}

	@Override
	public List<Watch> getMoviesWatched(UUID movieId) {
		return watchRepository.getByMovie(movieId);
	}

	@Override
	public Movie save(Movie movie) {
		try{
			return movieRepository.save(movie);
		} catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

}
