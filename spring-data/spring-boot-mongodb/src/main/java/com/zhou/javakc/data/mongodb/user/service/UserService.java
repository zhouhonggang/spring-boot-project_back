package com.zhou.javakc.data.mongodb.user.service;

import com.zhou.javakc.data.mongodb.user.dao.UserDao;
import com.zhou.javakc.data.mongodb.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void save(User entity)
    {
        userDao.save(entity);
    }

    public void remove(Integer id)
    {
        userDao.remove(id);
    }

    public void update(User entity)
    {
        userDao.update(entity);
    }

    public  User findUserById(Integer id)
    {
        return userDao.findUserById(id);
    }

}
