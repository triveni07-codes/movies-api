package com.assignment.moviesapi.database.repository;

import com.assignment.moviesapi.database.model.MovieModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieModel, Long> {

}

