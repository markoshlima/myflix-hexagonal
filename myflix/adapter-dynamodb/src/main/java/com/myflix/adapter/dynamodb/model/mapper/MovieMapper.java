package com.myflix.adapter.dynamodb.model.mapper;

import com.myflix.adapter.dynamodb.model.MovieDynamodb;
import com.myflix.domain.model.Movie;

import java.util.UUID;

public class MovieMapper {

    public static Movie mapperToMovie(MovieDynamodb m){
        Movie movie = new Movie();
        movie.setIdMovie(UUID.fromString(m.getIdMovie()));
        movie.setName(m.getName());
        movie.setYear(m.getYear());
        return movie;
    }

    public static MovieDynamodb mapperToMovieDynamodb(Movie m){
        MovieDynamodb movie = new MovieDynamodb();
        movie.setIdMovie(m.getIdMovie().toString());
        movie.setName(m.getName());
        movie.setYear(m.getYear());
        return movie;
    }

}
