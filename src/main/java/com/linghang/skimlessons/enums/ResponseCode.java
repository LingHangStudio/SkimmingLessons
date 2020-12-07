package com.linghang.skimlessons.enums;

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
    INVALID_CONDITION(11, "无效的前提条件，前提只能为0(通过老师)或1(通过课名)"),
    STRING_EMPTY(2, "参数为空串，此处参数不允许为空串"),
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
