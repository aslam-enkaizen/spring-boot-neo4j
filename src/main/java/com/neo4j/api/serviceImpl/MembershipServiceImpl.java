package com.neo4j.api.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo4j.api.model.Membership;
import com.neo4j.api.repository.MembershipRepository;
import com.neo4j.api.service.MembershipService;

@Service
public class MembershipServiceImpl implements MembershipService {
	@Autowired
	MembershipRepository membershipRepository;

	@Override
	public Membership createMembership(Membership membership) {
		return membershipRepository.save(membership);
	}

	@Override
	public List<Membership> getMemberships() {
		return membershipRepository.findAll();
	}

	@Override
	public Membership getById(String id) {
		return membershipRepository.findById(id).get();
	}

}
