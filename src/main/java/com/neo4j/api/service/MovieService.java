package com.neo4j.api.service;

import java.util.List;

import com.neo4j.api.model.Movie;

public interface MovieService {
	Movie createMovie(Movie movie);

	List<Movie> getMovies();

	Movie getById(Long id);

	Movie update(Movie movie);

	void deleteById(Long id);

	void deleteAll();

	List<Movie> getSpecificMovies(String title);

}
