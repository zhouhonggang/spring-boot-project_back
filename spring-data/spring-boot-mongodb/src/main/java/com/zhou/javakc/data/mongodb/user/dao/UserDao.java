package com.zhou.javakc.data.mongodb.user.dao;

import com.zhou.javakc.data.mongodb.user.entity.User;

public interface UserDao {
    void save(User entity);
    void remove(Integer id);
    void update(User entity);
    User findUserById(Integer id);
}
