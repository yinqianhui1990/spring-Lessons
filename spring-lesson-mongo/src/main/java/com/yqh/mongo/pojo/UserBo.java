package com.yqh.mongo.pojo;

import java.io.Serializable;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2019/4/10.
 */
public class UserBo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
