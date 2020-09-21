package com.zhou.javakc.data.neo4j.relationship.service;

import com.zhou.javakc.data.neo4j.dept.dao.DeptDao;
import com.zhou.javakc.data.neo4j.dept.entity.Dept;
import com.zhou.javakc.data.neo4j.emp.dao.EmpDao;
import com.zhou.javakc.data.neo4j.emp.entity.Emp;
import com.zhou.javakc.data.neo4j.relationship.dao.DeptEmpRelationshipDao;
import com.zhou.javakc.data.neo4j.relationship.entity.DeptEmpRelationship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptEmpRelationshipService {

    private EmpDao empDao;
    private DeptDao deptDao;
    private DeptEmpRelationshipDao deptEmpRelationshipDao;

    @Autowired
    public DeptEmpRelationshipService(EmpDao empDao, DeptDao deptDao, DeptEmpRelationshipDao deptEmpRelationshipDao) {
        this.empDao = empDao;
        this.deptDao = deptDao;
        this.deptEmpRelationshipDao = deptEmpRelationshipDao;
    }

    public void save(Emp entity)
    {
        empDao.save(entity);
    }

    public void save(Dept entity)
    {
        deptDao.save(entity);
    }

    public void save(DeptEmpRelationship entity)
    {
        deptEmpRelationshipDao.save(entity);
    }

    public Dept findById(Long id)
    {
        return deptDao.findById(id).get();
    }

}
