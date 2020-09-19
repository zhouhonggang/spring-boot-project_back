package com.zhou.javakc.data.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot整合Mybatis
 * @MapperScan 扫描数据层接口
 */
@SpringBootApplication
@MapperScan(basePackages = "com.zhou.javakc.data.mybatisplus.**.dao")
public class MybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisplusApplication.class, args);
    }

}