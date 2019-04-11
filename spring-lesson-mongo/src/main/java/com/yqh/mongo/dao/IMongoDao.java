package com.yqh.mongo.dao;

import com.mongodb.WriteResult;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.List;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2019/4/10.
 */
public interface IMongoDao<T> {
    /**
     * 根据条件查询
     */
    public List<T> find(Query query);

    /**
     * 根据条件查询一个
     */
    public T findOne(Query query);

    /**
     * 插入
     */
    public void save(T entity);
    /**
     * 根据条件 更新
     */
    public WriteResult update(Query query, Update update);

    /**
     * 获得所有该类型记录,并且指定了集合名(表的意思)
     */
    public List<T> findAll(String collectionName);

    /**
     * 根据条件 获得总数
     */
    public long count(Query query);
    /**
     * 根据条件 删除
     *
     * @param query
     */
    public void remove(Query query);
    /**
     * 分页查询
     */
    public Page<T> findPage(Page<T> page, Query query);
}

