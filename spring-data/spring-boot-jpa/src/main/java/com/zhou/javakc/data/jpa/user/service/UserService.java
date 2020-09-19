package com.zhou.javakc.data.jpa.user.service;

import com.zhou.javakc.data.jpa.user.dao.UserDao;
import com.zhou.javakc.data.jpa.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

/**
 * SpringDataJPA逻辑层实现
 */
@Service
@Transactional(readOnly = true)
public class UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 添加
     * @param entity 实体
     * @return 对象
     */
    @Transactional(readOnly = false)
    public User save(User entity)
    {
        return userDao.save(entity);
    }

    /**
     * 动态条件分页查询
     * @param entity 动态查询条件
     * @param page 起始页码 0开始
     * @param size 每页条数
     * @return 结果集
     */
    public Page<User> findByPage(User entity, int page, int size)
    {
        //分页参数
        Pageable pageable = PageRequest.of(page, size);
        //查询条件
        Specification<User> specification = new Specification<User>(){
            @Override
            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                //封装动态查询条件
                List<Predicate> predicates = new ArrayList<>();
                //验证用户名称是否作为查询条件
                if(!StringUtils.isEmpty(entity.getUserName()))
                {
                    //userName为User实体中的属性名称, 并非数据库字段名称
                    predicates.add(criteriaBuilder.like(root.get("userName"), "%" + entity.getUserName() + "%"));
                }
                return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        };
        //分页查询
        return userDao.findAll(specification, pageable);
    }

}
