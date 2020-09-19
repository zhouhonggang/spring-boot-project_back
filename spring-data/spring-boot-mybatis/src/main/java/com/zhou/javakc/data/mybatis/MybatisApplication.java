package com.zhou.javakc.data.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot整合Mybatis
 * @MapperScan 扫描数据层接口
 */
@SpringBootApplication
@MapperScan(basePackages = "com.zhou.javakc.data.mybatis.**.dao")
public class MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class, args);
    }

}