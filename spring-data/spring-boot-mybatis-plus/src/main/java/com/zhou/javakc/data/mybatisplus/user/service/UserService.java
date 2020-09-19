package com.zhou.javakc.data.mybatisplus.user.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhou.javakc.data.mybatisplus.user.dao.UserDao;
import com.zhou.javakc.data.mybatisplus.user.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Map;

/**
 * Mybatis逻辑层接口
 */
@Service
public class UserService extends ServiceImpl<UserDao, User> {

    /**
     * 动态条件分页查询
     * @param current 当前页码
     * @param size 每页条数
     * @param params 动态条件
     * @return 结果集
     */
    public IPage<User> findByPage(int current, int size, Map<String, Object> params)
    {
        //分页参数
        IPage<User> page = new Page<>(current, size);
        //查询参数
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        if(!StringUtils.isEmpty(params.get("name")))
        {
            wrapper.like("user_name", params.get("name"));
        }
        return baseMapper.selectPage(page, wrapper);
    }

}