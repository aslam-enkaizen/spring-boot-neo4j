package com.neo4j.api.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.neo4j.api.model.WorkGroupComment;

public interface WorkGroupCommentRepository extends Neo4jRepository<WorkGroupComment, String> {

}
