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

import com.myflix.domain.model.Movie;
import com.myflix.domain.model.Watch;
import com.myflix.domain.model.Character;
import com.myflix.domain.port.in.MoviePortIn;

@RestController
@RequestMapping("movie")
public class MovieController {

	@Autowired
	private MoviePortIn movieService;
    
	@PostMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
    public Movie save(@RequestBody Movie movie){
		return movieService.save(movie);
	}
	
	@DeleteMapping(path = "/{movieId}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public void delete(@PathVariable UUID movieId){
		movieService.delete(movieId);
	}
	
	@GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public List<Movie> getAll(){
		return movieService.getAll();
	}

	@GetMapping(path = "/{movieId}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public Movie get(@PathVariable UUID movieId){
		return movieService.get(movieId);
	}
    
	@GetMapping(path = "/{movieId}/character", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public List<Character> getCharacters(@PathVariable UUID movieId){
		return movieService.getCharacters(movieId);
	}
    
	@GetMapping(path = "/{movieId}/customer", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	public List<Watch> getMoviesWatched(@PathVariable UUID movieId){
		return movieService.getMoviesWatched(movieId);
    }
	
}
