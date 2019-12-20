package com.individual.community.bean.sdk;

public class Result<T> {
    private int code;
    private T data;

    Result(int code) {
        this.code = code;
    }

    Result(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public static Result code(int code) {
        return data(code, (Object)null);
    }

    public static Result data(int code, Object data) {
        return new Result(code, data);
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String toString() {
        return "Result{code=" + this.code + ", data=" + this.data + '}';
    }
}
