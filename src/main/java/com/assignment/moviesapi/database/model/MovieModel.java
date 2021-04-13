package com.assignment.moviesapi.database.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity(name = "MOVIE")
@Data
public class MovieModel {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private Long id;
  @Column(name = "title")
  private String title;
  @Column(name = "comment")
  private String comment;
  @Column(name = "image_url")
  private String imageUrl;
  @Column(name = "watched")
  private Boolean watched = false;

}
