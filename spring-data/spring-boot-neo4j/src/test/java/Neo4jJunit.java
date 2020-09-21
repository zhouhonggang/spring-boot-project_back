import com.zhou.javakc.data.neo4j.Neo4jApplication;
import com.zhou.javakc.data.neo4j.relationship.service.DeptEmpRelationshipService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Neo4jApplication.class)
public class Neo4jJunit {

    @Autowired
    private DeptEmpRelationshipService deptEmpRelationshipService;

    @Test
    public void test()
    {
        //清空数据
//        match (n) detach delete n

        //1.
//        Emp emp = Emp.builder().name("方莉").build();
//        Dept dept = Dept.builder().name("软件研发部").build();
//        DeptEmpRelationship deptEmpRelationship = DeptEmpRelationship.builder().indexName("建立关系1").dept(dept).emp(emp).build();
//        deptEmpRelationshipService.save(deptEmpRelationship);

        //2.
//        Emp emp = Emp.builder().name("知慧").build();
//        Dept dept = deptEmpRelationshipService.findById(0L);
//        DeptEmpRelationship deptEmpRelationship = DeptEmpRelationship.builder().indexName("建立关系1").dept(dept).emp(emp).build();
//        deptEmpRelationshipService.save(deptEmpRelationship);
    }

}
