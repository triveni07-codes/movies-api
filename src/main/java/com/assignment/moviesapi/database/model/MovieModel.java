package com.assignment.moviesapi.database.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity(name = "MOVIES")
@Data
public class MovieModel {

  @Id
  @GeneratedValue
  @Column(name = "id")
  private Long id;
  @Column(name = "title", unique = true)
  private String title;
  @Column(name = "description")
  private String comment;
  @Column(name = "image_url", unique = true)
  private String imageUrl;
  @Column(name = "watched")
  private Boolean watched = false;

}
