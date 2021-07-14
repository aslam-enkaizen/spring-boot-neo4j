package com.neo4j.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo4j.api.model.Movie;
import com.neo4j.api.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {
	@Autowired
	MovieService movieService;

	@PostMapping(value = "/create")
	ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
		return ResponseEntity.ok().body(movieService.createMovie(movie));
	}

	@GetMapping(value = "/getAll")
	ResponseEntity<List<Movie>> getMovies() {
		return ResponseEntity.ok().body(movieService.getMovies());
	}

	@GetMapping("/{id}")
	ResponseEntity<Movie> getById(@PathVariable Long id) {
		return ResponseEntity.ok().body(movieService.getById(id));
	}

	@PutMapping("/update")
	ResponseEntity<Movie> update(@RequestBody Movie movie) {
		return ResponseEntity.ok().body(movieService.update(movie));
	}

	@DeleteMapping("/{id}")
	ResponseEntity<String> deleteById(@PathVariable Long id) {
		movieService.deleteById(id);
		return ResponseEntity.ok().body("deleted successfully id: " + id);
	}
	
	@GetMapping("/title/{title}")
	ResponseEntity<List<Movie>> getByTitle(@PathVariable String title) {
		return ResponseEntity.ok().body(movieService.getSpecificMovies(title));
	}

}