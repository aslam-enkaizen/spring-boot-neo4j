package com.neo4j.api.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

@Node
public class Post {
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String description;
	@Relationship(type = "HAS_POST", direction = Direction.INCOMING)
	private WorkGroup workGroup;
	@Relationship(type = "CREATED_IN", direction = Direction.INCOMING)
	private Membership creator;

	public Post() {
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

	public WorkGroup getWorkGroup() {
		return workGroup;
	}

	public void setWorkGroup(WorkGroup workGroup) {
		this.workGroup = workGroup;
	}

	public Membership getCreator() {
		return creator;
	}

	public void setCreator(Membership creator) {
		this.creator = creator;
	}

}
