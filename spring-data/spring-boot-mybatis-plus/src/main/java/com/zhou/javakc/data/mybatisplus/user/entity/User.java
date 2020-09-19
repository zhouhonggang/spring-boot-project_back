package com.zhou.javakc.data.mybatisplus.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * mybatis plus对象实体
 */
@Data
@TableName("spring_boot_user")
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
