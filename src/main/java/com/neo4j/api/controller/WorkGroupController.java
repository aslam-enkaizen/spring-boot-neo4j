package com.neo4j.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo4j.api.model.WorkGroup;
import com.neo4j.api.service.WorkGroupService;

@RestController
@RequestMapping("/workGroup")
public class WorkGroupController {
	@Autowired
	WorkGroupService workGroupService;

	@PostMapping(value = "/create")
	ResponseEntity<WorkGroup> createWorkGroup(@RequestBody WorkGroup workGroup) {
		return ResponseEntity.ok().body(workGroupService.createWorkGroup(workGroup));
	}

	@GetMapping(value = "/getAll")
	ResponseEntity<List<WorkGroup>> getWorkGroups() {
		return ResponseEntity.ok().body(workGroupService.getWorkGroups());
	}
}
