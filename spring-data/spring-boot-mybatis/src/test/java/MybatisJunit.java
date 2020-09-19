import com.zhou.javakc.data.mybatis.MybatisApplication;
import com.zhou.javakc.data.mybatis.user.entity.User;
import com.zhou.javakc.data.mybatis.user.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest(classes= MybatisApplication.class)
public class MybatisJunit {

    @Autowired
    private UserService userService;

    @Test
    public void insert()
    {
        /*
         * 注解添加
         */
//        User entity = new User();
//        entity.setUserName("spring-boot-mybatis");
//        entity.setUserAge(22);
//        entity.setUserBirthday(new Date());
//        entity.setUserAddress("北京市海淀区");

//        userService.insertAnnotation(entity);

        /*
         *  XML添加
         */
//        User entity = new User();
//        entity.setUserName("spring-boot-mybatis");
//        entity.setUserAge(22);
//        entity.setUserBirthday(new Date());
//        entity.setUserAddress("北京市海淀区");

//        userService.insertXML(entity);

        /*
         * 注解查询
         */
//        List<User> userList = userService.findByPageAnnotation(0, 5);
//        userList.forEach(System.out::println);

        /*
         * XML查询
         */
//        List<User> userList = userService.findByPageXML(0, 5);
//        userList.forEach(System.out::println);
    }

}
