package com.zhou.javakc.data.mongodb.user.dao.impl;

import com.zhou.javakc.data.mongodb.user.dao.UserDao;
import com.zhou.javakc.data.mongodb.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void save(User entity) {
        mongoTemplate.save(entity);
    }

    @Override
    public void remove(Integer id) {
        Query query = new Query(Criteria.where("_id").is(id));
        mongoTemplate.remove(query, User.class);
    }

    @Override
    public void update(User entity) {
        Query query = new Query(Criteria.where("_id").is(entity.getUserId()));

        Update update = new Update();
        update.set("userName", entity.getUserName());
        update.set("userAge", entity.getUserAge());
        update.set("userBirthday", entity.getUserBirthday());
        update.set("userAddress", entity.getUserAddress());

        mongoTemplate.updateFirst(query, update, User.class);
    }

    @Override
    public User findUserById(Integer id) {
        Query query = new Query(Criteria.where("_id").is(id));
        return mongoTemplate.findOne(query, User.class);
    }

}
