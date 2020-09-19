import com.zhou.javakc.data.mongodb.MongodbApplication;
import com.zhou.javakc.data.mongodb.user.entity.User;
import com.zhou.javakc.data.mongodb.user.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest(classes = MongodbApplication.class)
public class MoongodbJunit {

    @Autowired
    private UserService userService;

    @Test
    public void test()
    {
        /*
         * 向MongoDB添加文档
         */
//        User entity = new User();
//        entity.setUserId(10);
//        entity.setUserName("spring-boot-mongodb");
//        entity.setUserAge(22);
//        entity.setUserBirthday(new Date());
//        entity.setUserAddress("北京市海淀区");
//
//        userService.save(entity);

        /*
         * 从MongoDB修改文档
         */
//        User entity = new User();
//        entity.setUserId(10);
//        entity.setUserName("spring-boot-mongodb1");
//        entity.setUserAge(21);
//        entity.setUserBirthday(new Date());
//        entity.setUserAddress("北京市海淀区1");
//
//        userService.update(entity);

        /*
         *  从MongoDB删除文档
         */
//        userService.remove(10);

        /*
         *  从MongoDB查找文档
         */
//        User entity = userService.findUserById(10);
//        System.out.println( entity );
    }

}
