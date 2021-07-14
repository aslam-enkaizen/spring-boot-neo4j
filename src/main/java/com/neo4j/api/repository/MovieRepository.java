package com.neo4j.api.repository;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;

import com.neo4j.api.model.Movie;

public interface MovieRepository extends Neo4jRepository<Movie, Long> {
	@Query("MATCH(n:Movie) WHERE n.title = $title RETURN n")
	List<Movie> getSpecificMovies(@Param("title") String title);
}