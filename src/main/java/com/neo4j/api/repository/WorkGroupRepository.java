package com.neo4j.api.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.neo4j.api.model.WorkGroup;

public interface WorkGroupRepository extends Neo4jRepository<WorkGroup, String> {

}
