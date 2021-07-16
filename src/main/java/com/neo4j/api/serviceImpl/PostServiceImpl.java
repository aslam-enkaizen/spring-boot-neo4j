package com.neo4j.api.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo4j.api.model.Post;
import com.neo4j.api.repository.PostRepository;
import com.neo4j.api.service.MembershipService;
import com.neo4j.api.service.PostService;
import com.neo4j.api.service.WorkGroupService;

@Service
public class PostServiceImpl implements PostService {
	@Autowired
	PostRepository postRepository;
	@Autowired
	WorkGroupService workGroupService;
	@Autowired
	MembershipService membershipService;

	private Long workGroupId = 3L;
	private Long membershipId = 9L;

	@Override
	public Post createPost(Post post) {
		post.setWorkGroup(workGroupService.getById(workGroupId));
		post.setCreator(membershipService.getById(membershipId));
		return postRepository.save(post);
	}

	@Override
	public List<Post> getPosts() {
		return postRepository.findAll();
	}

	@Override
	public Post getById(Long id) {
		return postRepository.findById(id).get();
	}

}
