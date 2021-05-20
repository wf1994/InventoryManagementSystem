package com.inventorymanagementsystem.controller.entity;


import java.io.Serializable;

/**
 * @Description 响应码
 * @Param
 * @Return
 * @Author djj
 * @Date 2021/5/13
 * @Time 13:12
 */
public class ResponseMap implements Serializable {
    private static final long serialVersionUID = 1L;
    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
