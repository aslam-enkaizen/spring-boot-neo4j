package com.neo4j.api.model;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

@Node
public class WorkGroupComment {
	@Id
	@GeneratedValue
	private Long id;
	private String message;
	@Relationship(type = "POSTED_IN", direction = Direction.INCOMING)
	private Post post;
	@Relationship(type = "CREATED_IN", direction = Direction.INCOMING)
	private Membership creator;

	public WorkGroupComment() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public Membership getCreator() {
		return creator;
	}

	public void setCreator(Membership creator) {
		this.creator = creator;
	}

}
