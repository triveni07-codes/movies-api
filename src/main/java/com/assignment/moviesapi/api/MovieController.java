package com.assignment.moviesapi.api;

import com.assignment.moviesapi.database.model.MovieResponse;
import com.assignment.moviesapi.service.MovieService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController implements MovieApi {

  private final MovieService movieService;

  public MovieController(MovieService movieService) {
    this.movieService = movieService;
  }

  @Override
  public ResponseEntity<List<MovieResponse>> getAllMovies() {
    return new ResponseEntity<>(movieService.getAllMovies(), HttpStatus.OK);
  }
}
