package com.neo4j.api;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.neo4j.api.model.Movie;
import com.neo4j.api.model.Person;
import com.neo4j.api.service.MovieService;
import com.neo4j.api.service.PersonService;

@SpringBootTest
class SpringBootNeo4jApplicationTests {
	@Autowired
	MovieService movieService;
	@Autowired
	PersonService personService;

	@Test
	void contextLoads() {
		Movie movie = new Movie();
		movie.setTitle("3idiots");
		movie.setDescription("nice movie");

		Set<Person> actors = new HashSet<Person>();
		Person actor1 = new Person();
		actor1.setName("Aslam Actor1");
		actor1.setAge("31");
		actors.add(actor1);

		Person actor2 = new Person();
		actor2.setName("Aslam Actor2");
		actor2.setAge("32");
		actors.add(actor2);

		movie.setActors(actors);

		Set<Person> directors = new HashSet<Person>();
		Person director1 = new Person();
		director1.setName("Aslam Director1");
		director1.setAge("31");
		directors.add(director1);

		Person director2 = new Person();
		director2.setName("Aslam Director2");
		director2.setAge("32");
		directors.add(director2);

		movie.setDirectors(directors);
		movieService.createMovie(movie);

//		movieService.deleteAll();
//		personService.deleteAll();
	}

}
