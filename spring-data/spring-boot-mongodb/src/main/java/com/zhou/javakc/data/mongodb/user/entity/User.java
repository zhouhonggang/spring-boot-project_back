package com.zhou.javakc.data.mongodb.user.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "user_collection")
public class User {
    //主键
    @Id
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
