package com.zhou.javakc.data.neo4j.emp.dao;

import com.zhou.javakc.data.neo4j.emp.entity.Emp;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpDao extends Neo4jRepository<Emp, Long> {
    
}
