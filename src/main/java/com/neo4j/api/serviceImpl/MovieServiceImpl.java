package com.neo4j.api.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo4j.api.model.Movie;
import com.neo4j.api.repository.MovieRepository;
import com.neo4j.api.service.MovieService;
@Service
public class MovieServiceImpl implements MovieService {
	@Autowired
	private MovieRepository movieRepository;

	@Override
	public Movie createMovie(Movie movie) {
		return movieRepository.save(movie);
	}

	@Override
	public List<Movie> getMovies() {
		List<Movie> list = movieRepository.findAll();
		return list;
	}

	@Override
	public Movie getById(String id) {
		Optional<Movie> movie = movieRepository.findById(id);
		return null;
	}

	@Override
	public Movie update(Movie movie) {

		return movieRepository.save(movie);
	}

	@Override
	public void deleteById(String id) {
		movieRepository.deleteById(id);
	}

}
