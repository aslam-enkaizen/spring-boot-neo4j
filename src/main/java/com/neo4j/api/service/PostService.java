package com.neo4j.api.service;

import java.util.List;

import com.neo4j.api.model.Post;

public interface PostService {
	Post createPost(Post post);

	List<Post> getPosts();

	Post getById(String id);
}
