package com.neo4j.api.model;

import java.util.UUID;

public class BaseNode {
	public String getUniqueID() {
		return UUID.randomUUID().toString();
	}
}
