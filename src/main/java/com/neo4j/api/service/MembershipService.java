package com.neo4j.api.service;

import java.util.List;

import com.neo4j.api.model.Membership;

public interface MembershipService {
	Membership createMembership(Membership membership);

	List<Membership> getMemberships();

	Membership getById(Long id);
}
