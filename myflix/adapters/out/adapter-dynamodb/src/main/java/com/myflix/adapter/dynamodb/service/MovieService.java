package com.myflix.adapter.dynamodb.service;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.myflix.adapter.dynamodb.config.DynamoDBDriver;
import com.myflix.adapter.dynamodb.model.CustomerDynamodb;
import com.myflix.adapter.dynamodb.model.MovieDynamodb;
import com.myflix.adapter.dynamodb.model.mapper.CustomerMapper;
import com.myflix.adapter.dynamodb.model.mapper.MovieMapper;
import com.myflix.adapter.dynamodb.repository.CustomerRepository;
import com.myflix.adapter.dynamodb.repository.MovieRepository;
import com.myflix.domain.model.Customer;
import com.myflix.domain.model.Movie;
import com.myflix.domain.port.out.MoviePortOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service("movieDynamodb")
public class MovieService implements MoviePortOut {

    @Autowired
    MovieRepository repository;

    DynamoDBMapper mapper;

    public MovieService(){
        mapper = new DynamoDBMapper(new DynamoDBDriver().amazonDynamoDB());
    }

    @Override
    public Movie save(Movie movie) {
        MovieDynamodb m = MovieMapper.mapperToMovieDynamodb(movie);
        mapper.save(m);
        return movie;
    }

    @Override
    public void delete(UUID idMovie) {
        repository.delete(MovieMapper.mapperToMovieDynamodb(this.getById(idMovie)));
    }

    @Override
    public List<Movie> getAll() {
        ArrayList<MovieDynamodb> list = repository.findAll();
        ArrayList<Movie> movies = new ArrayList<>();
        if(list.size() > 0){
            for (MovieDynamodb m : list) {
                movies.add(MovieMapper.mapperToMovie(m));
            }
        }
        return movies;
    }

    @Override
    public Movie getById(UUID idMovie) {
        Optional<MovieDynamodb> response = repository.findById(idMovie.toString());
        return MovieMapper.mapperToMovie(response.get());
    }
}
