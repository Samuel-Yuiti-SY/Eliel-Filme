package com.example.movie.repository;

import com.example.movie.models.movieModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface movieRepository extends JpaRepository<movieModel, Long> {
}
