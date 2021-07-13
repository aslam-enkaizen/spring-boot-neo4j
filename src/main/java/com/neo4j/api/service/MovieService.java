package com.neo4j.api.service;

import java.util.List;

import com.neo4j.api.model.Movie;

public interface MovieService {
	Movie createMovie(Movie movie);

	List<Movie> getMovies();

	Movie getById(String id);

	Movie update(Movie movie);

	void deleteById(String id);

}
