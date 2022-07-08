package com.myflix.adapter.grpc.service;


import com.myflix.adapter.grpc.protofiles.movie.MovieServiceGrpc.*;
import com.myflix.domain.port.in.MoviePortIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService extends MovieServiceImplBase {

    @Autowired
	private MoviePortIn movieService;

}