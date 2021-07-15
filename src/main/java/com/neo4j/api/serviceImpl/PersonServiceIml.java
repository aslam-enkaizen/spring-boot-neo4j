package com.neo4j.api.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo4j.api.model.Person;
import com.neo4j.api.repository.PersonRepository;
import com.neo4j.api.service.PersonService;

@Service
public class PersonServiceIml implements PersonService {
	@Autowired
	private PersonRepository personRepository;

	@Override
	public Person createPerson(Person person) {
		return personRepository.save(person);
	}

	@Override
	public List<Person> getPersons() {
		List<Person> list = personRepository.findAll();
		return list;
	}

	@Override
	public Person getById(Long id) {
		return personRepository.findById(id).get();
	}

	@Override
	public Person update(Person person) {
		return personRepository.save(person);
	}

	@Override
	public void deleteById(Long id) {
		personRepository.deleteById(id);
	}

	@Override
	public void deleteAll() {
		personRepository.deleteAll();
	}

	@Override
	public List<Person> getSpecificPersons(String name) {
		return personRepository.getSpecificPersons(name);
	}

}
