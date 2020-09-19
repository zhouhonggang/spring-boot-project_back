import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zhou.javakc.data.mybatisplus.MybatisplusApplication;
import com.zhou.javakc.data.mybatisplus.user.entity.User;
import com.zhou.javakc.data.mybatisplus.user.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest(classes= MybatisplusApplication.class)
public class MybatisplusJunit {

    @Autowired
    private UserService userService;

    @Test
    public void insert()
    {
        /*
         * 添加
         */
//        User entity = new User();
//        entity.setUserName("spring-boot-mybatis");
//        entity.setUserAge(22);
//        entity.setUserBirthday(new Date());
//        entity.setUserAddress("北京市海淀区");
//
//        userService.save(entity);

        /*
         * 查询
         */
//        List<User> userList = userService.list();
//        userList.forEach(System.out::println);

        /*
         * 动态条件分页查询
         */
//        Map<String, Object> params = new HashMap<>();
//        params.put("name", "spring-boot");
//
//        IPage<User> iPage = userService.findByPage(1, 5, params);
//        iPage.getRecords().forEach(System.out::println);
    }

}
