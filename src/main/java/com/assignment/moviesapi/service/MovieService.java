package com.assignment.moviesapi.service;

import com.assignment.moviesapi.database.model.MovieDetails;
import com.assignment.moviesapi.database.model.MovieModel;
import com.assignment.moviesapi.database.repository.MovieRepository;
import com.assignment.moviesapi.exception.MoviesDataException;
import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

  private final MovieRepository movieRepository;

  public MovieService(MovieRepository movieRepository) {
    this.movieRepository = movieRepository;
  }

  public List<MovieModel> getAllMovies() {
    List<MovieModel> movies = movieRepository.findAll();
    if (movies.isEmpty()) {
      throw new MoviesDataException("Movie collection is empty", HttpStatus.NOT_FOUND);
    }
    return movies;
  }

  public MovieModel add(MovieDetails movie) {
    MovieModel movieModel = new MovieModel();
    movieModel.setTitle(movie.getTitle());
    movieModel.setComment(movie.getComment());
    movieModel.setImageUrl(movie.getImageUrl());
    return movieRepository.save(movieModel);
  }

  public MovieModel getMovieById(String id) {
    Optional<MovieModel> movie = movieRepository.findById(Long.parseLong(id));
    if (movie.isEmpty()) {
      throw new MoviesDataException("Movie does not exist in the collection to update", HttpStatus.NOT_FOUND);
    }
    return movie.get();
  }

  public MovieModel updateMovie(MovieModel movieModel) {
    return movieRepository.save(movieModel);
  }
}
