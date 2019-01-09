package com.test.mv.model;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2017/12/29.
 */
public class User {
    private  String name;
    private String id;

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
