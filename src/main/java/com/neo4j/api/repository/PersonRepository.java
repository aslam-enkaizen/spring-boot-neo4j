package com.neo4j.api.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.neo4j.api.model.Person;

public interface PersonRepository extends Neo4jRepository<Person, Long> {
}
