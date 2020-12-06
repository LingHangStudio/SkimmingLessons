package com.linghang.skimlessons.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


/**
 * @param <T>
 * @author origin
 * 返回数据序列化
 */
@JsonSerialize
public class ServerResponse<T> {

    @JsonInclude(JsonInclude.Include.NON_NULL)  //  为空时省略该属性
    private String msg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    public String getMsg() {
        return msg;
    }

    public int getStatus() {
        return status;
    }

    public T getData() {
        return data;
    }

    public ServerResponse(int status, String msg) {
        this.msg = msg;
        this.status = status;
    }

    public ServerResponse(int status, String msg, T data) {
        this.msg = msg;
        this.status = status;
        this.data = data;
    }

    public ServerResponse(int status, T data) {
        this.status = status;
        this.data = data;
    }

    public ServerResponse(int status) {
        this.status = status;
    }

    //  不在序列化当中
    @JsonIgnore
    public boolean isSuccess() {
        return this.status == ResponseCode.SUCCESS.getCode();
    }

    public static <T> ServerResponse<T> createBySuccess() {
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode());
    }

    public static <T> ServerResponse<T> createBySuccessMsg(String msg) {
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(), msg);
    }

    public static <T> ServerResponse<T> createBySuccess(String msg, T data) {
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(), msg, data);
    }

    public static <T> ServerResponse<T> createByError() {
        return new ServerResponse<T>(ResponseCode.ERROR.getCode());
    }

    public static <T> ServerResponse<T> createByErrorMsg(String msg) {
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(), msg);
    }

    public static <T> ServerResponse<T> createByError(String msg, T data) {
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(), msg, data);
    }

    public static <T> ServerResponse<T> createByError(Integer code, String msg) {
        return new ServerResponse<T>(code, msg, null);
    }
}
