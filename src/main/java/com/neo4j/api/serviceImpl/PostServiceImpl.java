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

	private String workGroupId = "a7c7e613-2ce4-4bdc-97bf-b594a2fea435";
	private String membershipId = "82db2641-1fb8-41d7-8806-c4eada670cd3";

	@Override
	public Post createPost(Post post) {
		//post.setWorkGroup(workGroupService.getById(workGroupId));
		post.setCreator(membershipService.getById(membershipId));
		return postRepository.save(post);
	}

	@Override
	public List<Post> getPosts() {
		return postRepository.findAll();
	}

	@Override
	public Post getById(String id) {
		return postRepository.findById(id).get();
	}

}
