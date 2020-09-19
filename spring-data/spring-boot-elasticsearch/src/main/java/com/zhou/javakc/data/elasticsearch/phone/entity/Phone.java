package com.zhou.javakc.data.elasticsearch.phone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * Elasticsearch实体对象
 */
@Data
@AllArgsConstructor
@Document(indexName = "phone")
public class Phone {
    //主键
    @Id
    private int id;
    //产品名称
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String name;
    //产品类型
    @Field(type = FieldType.Keyword)
    private String type;
    //厂商品牌
    @Field(type = FieldType.Keyword)
    private String brand;
    //产品价格
    @Field(type = FieldType.Double)
    private Double price;
    //图片 不对图片查询,指定为 false
    @Field(type = FieldType.Keyword,index = false)
    private String images;
}
