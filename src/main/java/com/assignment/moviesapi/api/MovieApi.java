package com.assignment.moviesapi.api;

import com.assignment.moviesapi.database.model.MovieResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@Api(value = "movies", tags = "Movie API")
public interface MovieApi {

  @ApiOperation(value = "Returns all movies list", nickname = "getAllMovies", notes =
      "To get all the movies in the collection:")
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "List of movies retrieved"),
      @ApiResponse(code = 404, message = "Movies not found")})
  @GetMapping(value = "/getAllMovies",
      produces = {"application/json"})
  ResponseEntity<List<MovieResponse>> getAllMovies();

}
