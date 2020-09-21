package com.zhou.javakc.data.neo4j.relationship.entity;

import com.zhou.javakc.data.neo4j.dept.entity.Dept;
import com.zhou.javakc.data.neo4j.emp.entity.Emp;
import lombok.Builder;
import lombok.Data;
import org.neo4j.ogm.annotation.*;

@Data
@Builder
@RelationshipEntity(type = "DeptEmpRelationship")
public class DeptEmpRelationship {
    @Id
    @GeneratedValue
    private Long id;
    private String indexName;
    @StartNode
    private Dept dept;
    @EndNode
    private Emp emp;
}
