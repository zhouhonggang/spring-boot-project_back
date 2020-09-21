package com.zhou.javakc.data.neo4j.relationship.dao;

import com.zhou.javakc.data.neo4j.relationship.entity.DeptEmpRelationship;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface DeptEmpRelationshipDao extends Neo4jRepository<DeptEmpRelationship, Long> {
}
