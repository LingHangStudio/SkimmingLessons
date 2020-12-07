package com.linghang.skimlessons.enums;

/**
 * 查找前提条件
 */
public enum SearchCondition {

    BY_TEACHER(0),
    BY_COURSE_NAME(1),
    ;

    private final int code;

    SearchCondition(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
