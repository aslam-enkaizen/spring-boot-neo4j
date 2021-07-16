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

	private Long postId = 10L;
	private Long membershipId = 9L;

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
