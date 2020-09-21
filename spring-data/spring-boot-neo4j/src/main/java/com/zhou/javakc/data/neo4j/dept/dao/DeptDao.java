package com.zhou.javakc.data.neo4j.dept.dao;

import com.zhou.javakc.data.neo4j.dept.entity.Dept;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptDao extends Neo4jRepository<Dept, Long> {

}
