package com.yqh.mongo.UserRespository.impl;

import com.yqh.mongo.UserRespository.UserRepositoryCustom;
import com.yqh.mongo.pojo.UserBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2019/4/10.
 */
public class UserRepositoryImpl implements UserRepositoryCustom{
    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public UserBo getUserByAddress(String address) {
        Query query = new Query(Criteria.where("address").is(address));
        UserBo userBo = mongoTemplate.findOne(query, UserBo.class);
        return userBo;
    }
}
