package com.neo4j.api.model;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

@Node
public class Movie {
	@Id
	private Long id;
	private String title;
	private String description;
	@Relationship(type = "ACTED_IN", direction = Direction.INCOMING)
	private Set<Person> actors = new HashSet<>();
	@Relationship(type = "DIRECTED", direction = Direction.INCOMING)
	private Set<Person> directors = new HashSet<>();

	public Movie() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Person> getActors() {
		return actors;
	}

	public void setActors(Set<Person> actors) {
		this.actors = actors;
	}

	public Set<Person> getDirectors() {
		return directors;
	}

	public void setDirectors(Set<Person> directors) {
		this.directors = directors;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", description=" + description + ", actors=" + actors
				+ ", directors=" + directors + "]";
	}

}