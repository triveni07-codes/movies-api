package com.assignment.moviesapi.api;

import com.assignment.moviesapi.database.model.MovieDetails;
import com.assignment.moviesapi.service.MovieService;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
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
  public ResponseEntity<List<MovieDetails>> getAllMovies() {
    return new ResponseEntity<>(movieService.getAllMovies(), HttpStatus.OK);
  }

  @Override
  public ResponseEntity<String> addMovie(@Valid @NotNull MovieDetails movieDetails) {
    movieService.add(movieDetails);
    return new ResponseEntity<>(movieDetails.getTitle() + " Movie added to the collection",
        HttpStatus.CREATED);
  }
}
