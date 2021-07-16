package com.neo4j.api.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.neo4j.api.model.Membership;

public interface MembershipRepository extends Neo4jRepository<Membership, Long> {

}
