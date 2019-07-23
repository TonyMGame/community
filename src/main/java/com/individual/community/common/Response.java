package com.individual.community.common;

import lombok.Data;

import java.io.Serializable;


@Data
public class Response<T> implements Serializable {

    private static final long serialVersionUID = -4505655308965878999L;

    //请求成功返回码为：0000
    private static final String successCode = "0000";
    //返回数据
    private T data;
    //返回码
    private String code;
    //返回描述
    private String msg;

    public Response(){
        this.code = successCode;
        this.msg = "请求成功";
    }

    public Response(String code,String msg){
        this();
        this.code = code;
        this.msg = msg;
    }
    public Response(String code,String msg,T data){
        this();
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public Response(T data){
        this();
        this.data = data;
    }

}
