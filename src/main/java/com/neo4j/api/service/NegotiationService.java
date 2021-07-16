package com.neo4j.api.service;

import java.util.List;

import com.neo4j.api.model.Negotiation;

public interface NegotiationService {
	Negotiation createNegotiation(Negotiation negotiation);

	List<Negotiation> getNegotiations();
}
