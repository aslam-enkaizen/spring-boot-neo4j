package com.neo4j.api.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.neo4j.api.model.Negotiation;

public interface NegotiationRepository extends Neo4jRepository<Negotiation, Long> {

}
