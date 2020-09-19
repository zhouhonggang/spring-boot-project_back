package com.zhou.javakc.data.mybatis.user.entity;

import lombok.Data;

import java.util.Date;

/**
 * mybatis对象实体
 */
@Data
public class User {
    //主键(自增)
    private int userId;
    //姓名
    private String userName;
    //年龄
    private Integer userAge;
    //生日
    private Date userBirthday;
    //住址
    private String userAddress;
}
