package com.zhou.javakc.data.neo4j.emp.entity;

import lombok.Builder;
import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

@Data
@Builder
@NodeEntity(label = "Emp")
public class Emp {
    @Id
    @GeneratedValue
    private Long id;
    @Property(name = "name")
    private String name;
}
