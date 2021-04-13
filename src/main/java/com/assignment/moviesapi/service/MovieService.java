package com.assignment.moviesapi.service;

import com.assignment.moviesapi.database.model.MovieDetails;
import com.assignment.moviesapi.database.model.MovieModel;
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

  public List<MovieDetails> getAllMovies() {
    List<MovieModel> movieModels = movieRepository.findAll();
    List<MovieDetails> movies = new ArrayList<>();

    if (!movieModels.isEmpty()) {
      movieModels.forEach(movieModel -> {
        MovieDetails movieDetails = new MovieDetails();
        movieDetails.setTitle(movieModel.getTitle());
        movieDetails.setComment(movieModel.getComment());
        movieDetails.setImageUrl(movieModel.getImageUrl());
        movies.add(movieDetails);
      });
    }
    return movies;
  }

  public void add(MovieDetails movie) {
    MovieModel movieModel = new MovieModel();
    movieModel.setTitle(movie.getTitle());
    movieModel.setComment(movie.getComment());
    movieModel.setImageUrl(movie.getImageUrl());
    movieRepository.save(movieModel);
  }

}
