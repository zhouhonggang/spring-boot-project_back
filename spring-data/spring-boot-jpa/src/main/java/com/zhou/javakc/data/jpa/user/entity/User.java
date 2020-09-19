package com.zhou.javakc.data.jpa.user.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * SpringDataJPA对象实体
 */
@Data
@Entity
@Table(name = "spring_boot_user")
public class User {
    //主键(自增)
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    //姓名
    @Column(name = "user_name")
    private String userName;
    //年龄
    @Column(name = "user_age")
    private Integer userAge;
    //生日
    @Column(name = "user_birthday")
    private Date userBirthday;
    //住址
    @Column(name = "user_address")
    private String userAddress;
}
