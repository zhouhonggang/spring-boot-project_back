import com.zhou.javakc.data.redis.RedisApplication;
import com.zhou.javakc.data.redis.component.RedisComponent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = RedisApplication.class)
public class RedisJunit {

    @Autowired
    private RedisComponent redisComponent;

    @Test
    public void test()
    {
        //1.向redis string类型写入数据
//        Assertions.assertTrue( redisComponent.set("redis1", "admin1") );
        //2.从redis string类型读取数据
//        Assertions.assertEquals( redisComponent.get("redis1"), "admin1" );

        //1.向redis hash类型写入数据
//        Assertions.assertTrue( redisComponent.hset("redis2", "key1", "value1") );
        //2.从redis hash类型读取数据
//        Assertions.assertEquals( redisComponent.hget("redis2", "key1"), "value1" );

        //1.向redis list类型写入数据
//        Assertions.assertTrue( redisComponent.lSet("redis3", 1) );
        //2.从redis list类型读取数据
//        Assertions.assertEquals( redisComponent.lGetIndex("redis3", 0), 1 );
    }

}
