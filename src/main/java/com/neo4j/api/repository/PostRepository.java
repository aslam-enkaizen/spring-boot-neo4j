package com.neo4j.api.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.neo4j.api.model.Post;

public interface PostRepository extends Neo4jRepository<Post, String> {

}
