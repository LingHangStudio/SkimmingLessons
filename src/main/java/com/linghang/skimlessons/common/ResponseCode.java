package com.linghang.skimlessons.common;

/**
 * @author origin
 * code模板
 */
public enum ResponseCode {
    //7000
    SUCCESS(0,"SUCCESS"),
    ERROR(1,"ERROR");

    private final int code;
    private final String desc;


    ResponseCode(int code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public int getCode(){
        return code;
    }
    public String getDesc(){
        return desc;
    }
}
