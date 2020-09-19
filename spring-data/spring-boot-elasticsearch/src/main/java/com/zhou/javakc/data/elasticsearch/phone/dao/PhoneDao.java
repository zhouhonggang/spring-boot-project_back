package com.zhou.javakc.data.elasticsearch.phone.dao;

import com.zhou.javakc.data.elasticsearch.phone.entity.Phone;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * Elasticsearch数据层接口
 */
public interface PhoneDao extends ElasticsearchRepository<Phone, Integer> {
    List<Phone> findByNameLike(String name);
}
