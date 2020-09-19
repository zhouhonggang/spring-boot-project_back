import com.zhou.javakc.data.jpa.JPAApplication;
import com.zhou.javakc.data.jpa.user.entity.User;
import com.zhou.javakc.data.jpa.user.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import java.util.Date;

@SpringBootTest(classes= JPAApplication.class)
public class JPAJunit {

    @Autowired
    private UserService userService;

    @Test
    public void insert()
    {
        /*
         * 添加
         */
//        User entity = new User();
//        entity.setUserName("spring-boot-jpa");
//        entity.setUserAge(23);
//        entity.setUserBirthday(new Date());
//        entity.setUserAddress("北京市朝阳区");
//
//        userService.save(entity);


        /*
         * 动态条件分页查询
         */
//        User entity = new User();
//        entity.setUserName("spring-boot-jpa");
//
//        Page<User> page = userService.findByPage(entity, 0, 5);
//        page.forEach(System.out::println);
    }

}
