package com.neo4j.api.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.neo4j.api.model.Movie;

public interface MovieRepository extends Neo4jRepository<Movie, String> {
}