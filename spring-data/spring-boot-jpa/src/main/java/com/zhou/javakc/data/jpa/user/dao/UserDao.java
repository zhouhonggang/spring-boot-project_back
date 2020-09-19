package com.zhou.javakc.data.jpa.user.dao;

import com.zhou.javakc.data.jpa.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * SpringDataJPA数据层接口
 */
public interface UserDao extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {
}
