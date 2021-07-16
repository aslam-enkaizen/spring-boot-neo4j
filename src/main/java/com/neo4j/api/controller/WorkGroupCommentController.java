package com.neo4j.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo4j.api.model.WorkGroupComment;
import com.neo4j.api.service.WorkGroupCommentService;

@RestController
@RequestMapping("/workGroupComment")
public class WorkGroupCommentController {
	@Autowired
	WorkGroupCommentService workGroupCommentService;

	@PostMapping(value = "/create")
	ResponseEntity<WorkGroupComment> createWorkGroupComment(@RequestBody WorkGroupComment workGroupComment) {
		return ResponseEntity.ok().body(workGroupCommentService.createWorkGroupComment(workGroupComment));
	}

	@GetMapping(value = "/getAll")
	ResponseEntity<List<WorkGroupComment>> getWorkGroupComments() {
		return ResponseEntity.ok().body(workGroupCommentService.getWorkGroupComments());
	}
}
