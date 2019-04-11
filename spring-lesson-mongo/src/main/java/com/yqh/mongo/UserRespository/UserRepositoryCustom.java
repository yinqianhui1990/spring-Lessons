package com.yqh.mongo.UserRespository;

import com.yqh.mongo.pojo.UserBo;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2019/4/10.
 */
public interface UserRepositoryCustom {
    public UserBo getUserByAddress(String address);
}
