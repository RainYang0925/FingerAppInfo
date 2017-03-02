package com.finger.appinfo.controller;

import java.io.Serializable;

/**
 * Created by 古月随笔 on 2017/3/2.
 */
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 3997124446365032582L;
    /**
     * 错误码
     */
    private Integer code = 200;

    private T data;//数据

    private String msg; //消息提示

    private Integer bizCode;//业务码

    public Result() {
        super();
    }

    public Result(Integer code, Integer bizCode, String msg) {
        super();
        this.code = code;
        this.bizCode = bizCode;
        this.msg = msg;
    }

    public Result(Integer code, Integer bizCode, String msg, T data) {
        super();
        this.code = code;
        this.bizCode = bizCode;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getBizCode() {
        return bizCode;
    }

    public void setBizCode(Integer bizCode) {
        this.bizCode = bizCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
