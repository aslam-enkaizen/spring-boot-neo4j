package com.neo4j.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo4j.api.model.Post;
import com.neo4j.api.service.PostService;

@RestController
@RequestMapping("/post")
public class PostController {
	@Autowired
	PostService postService;

	@PostMapping(value = "/create")
	ResponseEntity<Post> createPost(@RequestBody Post post) {
		return ResponseEntity.ok().body(postService.createPost(post));
	}

	@GetMapping(value = "/getAll")
	ResponseEntity<List<Post>> getPosts() {
		return ResponseEntity.ok().body(postService.getPosts());
	}
}
