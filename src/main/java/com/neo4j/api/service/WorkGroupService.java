package com.neo4j.api.service;

import java.util.List;

import com.neo4j.api.model.WorkGroup;

public interface WorkGroupService {
	WorkGroup createWorkGroup(WorkGroup workGroup);

	List<WorkGroup> getWorkGroups();

	WorkGroup getById(String id);
}
