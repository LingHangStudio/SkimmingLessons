package com.linghang.skimlessons.common;

/**
 * @author origin
 * code模板
 */
public enum ResponseCode {
    //7000
    SUCCESS(0,"SUCCESS"),
    ERROR(1,"ERROR"),
    PAGE_SIZE_TOO_LARGE(3, "单页条目数量过大"),
    PAGE_SIZE_TOO_LITTLE(4, "单页条目数量过小"),
    PAGE_NUM_OUT_LOWEST_BOUNDS(6, "页数超过最小范围"),
    PAGE_NUM_OUT_HIGHEST_BOUNDS(7,"页数超过最大范围"),
    EMPTY(9, "查询结果为空"),
    ;

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
