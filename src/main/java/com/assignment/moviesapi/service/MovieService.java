package com.assignment.moviesapi.service;

import com.assignment.moviesapi.database.model.MovieModel;
import com.assignment.moviesapi.database.model.MovieResponse;
import com.assignment.moviesapi.database.repository.MovieRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

  private final MovieRepository movieRepository;

  public MovieService(MovieRepository movieRepository) {
    this.movieRepository = movieRepository;
  }

  public List<MovieResponse> getAllMovies() {
    List<MovieModel> movieModels = movieRepository.findAll();
    List<MovieResponse> movies = new ArrayList<>();

    if (!movieModels.isEmpty()) {
      movieModels.forEach(movieModel -> {
        MovieResponse movieResponse = new MovieResponse();
        movieResponse.setTitle(movieModel.getTitle());
        movieResponse.setComment(movieModel.getComment());
        movieResponse.setImageUrl(movieModel.getImageUrl());
        movies.add(movieResponse);
      });
    }
    return movies;
  }
}
