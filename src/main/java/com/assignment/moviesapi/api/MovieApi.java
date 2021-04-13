package com.assignment.moviesapi.api;

import com.assignment.moviesapi.database.model.MovieDetails;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Api(value = "movies", tags = "Movie API")
public interface MovieApi {

  @ApiOperation(value = "Returns all movies list", nickname = "getAllMovies",
      notes = "To get all the movies in the collection:")
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "List of movies retrieved"),
      @ApiResponse(code = 404, message = "Movies not found")})
  @GetMapping(value = "/movies",
      produces = {"application/json"})
  ResponseEntity<List<MovieDetails>> getAllMovies();

  @ApiOperation(value = "Adds movie to the collection", nickname = "addMovie",
      notes = "To add new movie to collection:")
  @ApiResponses(value = {
      @ApiResponse(code = 201, message = "A movie added to the collection"),
      @ApiResponse(code = 400, message = "Invalid input supplied")})
  @PostMapping(value = "/movies",
      produces = {"application/json"})
  ResponseEntity<String> addMovie(@ApiParam(value = "Movie details to be added") @Valid @NotNull
  @RequestBody MovieDetails movieDetails);

}
