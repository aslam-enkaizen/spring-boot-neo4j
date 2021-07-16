package com.neo4j.api.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

@Node
public class WorkGroup {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@Relationship(type = "HAS_WORKGROUP", direction = Direction.INCOMING)
	private Membership owner;
	@Relationship(type = "MEMBERS_IN", direction = Direction.INCOMING)
	private List<Membership> members = new ArrayList<Membership>();
	@Relationship(type = "NEGOTIATED_IN", direction = Direction.INCOMING)
	private List<Negotiation> negotiations = new ArrayList<Negotiation>();

	public WorkGroup() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Membership getOwner() {
		return owner;
	}

	public void setOwner(Membership owner) {
		this.owner = owner;
	}

	public List<Membership> getMembers() {
		return members;
	}

	public void setMembers(List<Membership> members) {
		this.members = members;
	}

	public List<Negotiation> getNegotiations() {
		return negotiations;
	}

	public void setNegotiations(List<Negotiation> negotiations) {
		this.negotiations = negotiations;
	}

}
