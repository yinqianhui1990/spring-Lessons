package com.test.mv.model;

/**
 * @Author: yinqianhui
 * @Date Created by ThinkPad on 2019/1/7.
 */
public class Response {
    private String  code;
    private String msg;
    private Object object;

    public Response() {
    }

    public Response(Object object) {
        this.code="0";
        this.msg="成功";
        this.object = object;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
