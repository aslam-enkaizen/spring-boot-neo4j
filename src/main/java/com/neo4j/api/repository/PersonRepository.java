package com.neo4j.api.repository;

import java.util.List;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;

import com.neo4j.api.model.Person;

public interface PersonRepository extends Neo4jRepository<Person, Long> {
	@Query("MATCH(n:Person) WHERE n.name = $name RETURN n")
	List<Person> getSpecificPersons(@Param("name") String name);
}
