package com.zhou.javakc.data.elasticsearch.phone.service;

import com.zhou.javakc.data.elasticsearch.phone.dao.PhoneDao;
import com.zhou.javakc.data.elasticsearch.phone.entity.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

/**
 * Elasticsearch逻辑层实现
 */
@Service
public class PhoneService {

    @Autowired
    private PhoneDao phoneDao;

    /**
     * 添加文档
     * @param phone 文档
     */
    public void save(Phone phone)
    {
        phoneDao.save(phone);
    }

    /**
     * 查询全部
     * @return 列表
     */
    public Iterator<Phone> findAll()
    {
        return phoneDao.findAll().iterator();
    }

    /**
     * 根据名称搜索
     * @param name 名称
     * @return 符合条件结果
     */
    public List<Phone> findByNameLike(String name)
    {
        return phoneDao.findByNameLike(name);
    }

}
