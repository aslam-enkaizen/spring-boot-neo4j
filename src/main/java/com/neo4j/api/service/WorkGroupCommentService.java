package com.neo4j.api.service;

import java.util.List;

import com.neo4j.api.model.WorkGroupComment;

public interface WorkGroupCommentService {
	WorkGroupComment createWorkGroupComment(WorkGroupComment workGroupComment);

	List<WorkGroupComment> getWorkGroupComments();
}
