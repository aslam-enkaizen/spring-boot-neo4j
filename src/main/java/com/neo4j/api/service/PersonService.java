package com.neo4j.api.service;

import java.util.List;

import com.neo4j.api.model.Person;

public interface PersonService {
	Person createPerson(Person person);

	List<Person> getPersons();

	Person getById(Long id);

	Person update(Person person);

	void deleteById(Long id);

	void deleteAll();

	List<Person> getSpecificPersons(String name);
}
