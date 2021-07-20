package com.neo4j.api.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo4j.api.model.WorkGroupComment;
import com.neo4j.api.repository.WorkGroupCommentRepository;
import com.neo4j.api.service.MembershipService;
import com.neo4j.api.service.PostService;
import com.neo4j.api.service.WorkGroupCommentService;

@Service
public class WorkGroupCommentServiceImpl implements WorkGroupCommentService {
	@Autowired
	WorkGroupCommentRepository workGroupCommentRepository;
	@Autowired
	PostService postService;
	@Autowired
	MembershipService membershipService;

	private String postId = "73695aeb-d66b-45bb-a679-087034b2a2e6";
	private String membershipId = "82db2641-1fb8-41d7-8806-c4eada670cd3";

	@Override
	public WorkGroupComment createWorkGroupComment(WorkGroupComment workGroupComment) {
		workGroupComment.setPost(postService.getById(postId));
		workGroupComment.setCreator(membershipService.getById(membershipId));
		return workGroupCommentRepository.save(workGroupComment);
	}

	@Override
	public List<WorkGroupComment> getWorkGroupComments() {
		return workGroupCommentRepository.findAll();
	}

}
