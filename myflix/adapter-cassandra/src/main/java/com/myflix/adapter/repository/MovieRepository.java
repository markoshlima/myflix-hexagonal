package com.myflix.adapter.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.datastax.oss.driver.api.core.cql.ResultSet;
import com.datastax.oss.driver.api.core.cql.Row;
import com.myflix.adapter.database.CassandraDriver;
import com.myflix.domain.model.Movie;
import com.myflix.domain.port.out.MoviePortOut;

@Repository("movieCassandra")
public class MovieRepository  implements MoviePortOut {
	
	@Autowired
	private CassandraDriver driver;
	
	@Value("${movie.getall}")
	private String movieGetAll;
	
	@Value("${movie.insert}")
	private String movieInsert;
	
	@Value("${movie.delete}")
	private String movieDelete;
	
	@Value("${movie.get}")
	private String movieGet;
	
	@Override
	public Movie save(Movie movie) {
		movie.setIdMovie(UUID.randomUUID());
		driver.getSession().execute(movieInsert, movie.getIdMovie(), movie.getName(), movie.getYear());
        return movie;
		
	}

	@Override
	public void delete(UUID idMovie) {
		driver.getSession().execute(movieDelete, idMovie);
	}

	@Override
	public List<Movie> getAll() {
		List<Movie> movies = new ArrayList<Movie>();
        ResultSet rs = driver.getSession().execute(movieGetAll);
        for(Row row : rs) {
        	Movie movie = new Movie();
        	movie.setIdMovie(row.getUuid("id_movie"));
        	movie.setName(row.getString("name"));
        	movie.setYear(row.getInt("year"));
        	movies.add(movie);
        }
		return movies;
		
	}

	@Override
	public Movie getById(UUID idMovie) {
		Movie movie = new Movie();
        ResultSet rs = driver.getSession().execute(movieGet, idMovie);
        Row row = rs.one();
        if(row != null) {
        	movie.setIdMovie(row.getUuid("id_movie"));
        	movie.setName(row.getString("name"));
        	movie.setYear(row.getInt("year"));                      
        }
		return movie;
		
	}
	
	
}
