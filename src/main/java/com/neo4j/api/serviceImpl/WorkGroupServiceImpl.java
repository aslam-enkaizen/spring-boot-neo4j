package com.neo4j.api.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo4j.api.model.WorkGroup;
import com.neo4j.api.repository.WorkGroupRepository;
import com.neo4j.api.service.WorkGroupService;

@Service
public class WorkGroupServiceImpl implements WorkGroupService {
	@Autowired
	WorkGroupRepository workGroupRepository;

	@Override
	public WorkGroup createWorkGroup(WorkGroup workGroup) {
		return workGroupRepository.save(workGroup);
	}

	@Override
	public List<WorkGroup> getWorkGroups() {
		return workGroupRepository.findAll();
	}

	@Override
	public WorkGroup getById(String id) {
		return workGroupRepository.findById(id).get();
	}

}
