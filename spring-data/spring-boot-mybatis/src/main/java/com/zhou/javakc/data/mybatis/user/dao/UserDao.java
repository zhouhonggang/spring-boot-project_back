package com.zhou.javakc.data.mybatis.user.dao;

import com.zhou.javakc.data.mybatis.user.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Mybatis数据层接口
 */
public interface UserDao {

    /**
     * mybatis注解方式添加
     * @param entity 实体
     * @return 影响条数
     */
    @Insert(" insert into spring_boot_user(user_name, user_age, user_birthday, user_address) " +
            " values(#{userName}, #{userAge}, #{userBirthday}, #{userAddress})")
    int insertAnnotation(User entity);

    /**
     * mybatis XML方式添加 -> resources/mapper/UserMapper.xml
     * @param entity 实体
     * @return 影响条数
     */
    int insertXML(User entity);

    /**
     * mybatis注解方式查询
     * @param start 起始条数
     * @param size 每页条数
     * @return 结果集
     */
    @Select(" select user_id, user_name, user_age, user_birthday, user_address from spring_boot_user limit #{start}, #{size}")
    List<User> findByPageAnnotation(@Param("start")int start, @Param("size")int size);

    /**
     * mybatis XML方式查询
     * @param start 起始条数
     * @param size 每页条数
     * @return 结果集
     */
    List<User> findByPageXML(@Param("start")int start, @Param("size")int size);

}
