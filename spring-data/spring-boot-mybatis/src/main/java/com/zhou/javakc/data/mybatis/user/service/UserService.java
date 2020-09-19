package com.zhou.javakc.data.mybatis.user.service;

import com.zhou.javakc.data.mybatis.user.dao.UserDao;
import com.zhou.javakc.data.mybatis.user.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Mybatis逻辑层接口
 */
@Service
@Transactional(readOnly = true)
public class UserService {

    @Autowired
    private UserDao userDao;

    @Transactional(readOnly = false)
    public int insertAnnotation(User entity)
    {
        return userDao.insertAnnotation(entity);
    }

    @Transactional(readOnly = false)
    public int insertXML(User entity)
    {
        return userDao.insertXML(entity);
    }

    public List<User> findByPageAnnotation(int start, int size)
    {
        return userDao.findByPageAnnotation(start, size);
    }

    public List<User> findByPageXML(int start, int size)
    {
        return userDao.findByPageXML(start, size);
    }

}