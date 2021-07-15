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

import com.neo4j.api.model.Person;
import com.neo4j.api.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	@Autowired
	PersonService personService;

	@PostMapping(value = "/create")
	ResponseEntity<Person> createPerson(@RequestBody Person person) {
		return ResponseEntity.ok().body(personService.createPerson(person));
	}

	@GetMapping(value = "/getAll")
	ResponseEntity<List<Person>> getPersons() {
		return ResponseEntity.ok().body(personService.getPersons());
	}

	@GetMapping("/getById/{id}")
	ResponseEntity<Person> getById(@PathVariable Long id) {
		return ResponseEntity.ok().body(personService.getById(id));
	}

	@PutMapping("/update")
	ResponseEntity<Person> update(@RequestBody Person person) {
		return ResponseEntity.ok().body(personService.update(person));
	}

	@DeleteMapping("/deleteById/{id}")
	ResponseEntity<String> deleteById(@PathVariable Long id) {
		personService.deleteById(id);
		return ResponseEntity.ok().body("deleted successfully id: " + id);
	}

	@GetMapping("/getByName/{name}")
	ResponseEntity<List<Person>> getByName(@PathVariable String name) {
		return ResponseEntity.ok().body(personService.getSpecificPersons(name));
	}
}
