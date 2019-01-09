package com.yqh.spring.service;

import com.yqh.spring.model.User;
import org.omg.CORBA.ULongSeqHelper;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2019/1/9.
 */
public interface IUserService {
     public User getUserByName(String name);
}
