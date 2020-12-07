package com.linghang.skimlessons.util;

import com.linghang.skimlessons.common.ServerResponse;
import com.linghang.skimlessons.enums.ResponseCode;

/**
 * 字符串工具类
 * @author 田
 *
 */
public class StrUtil {

    /**
     * 判断字符串是否为有效字符串
     * @param str 字符串
     * @return bool
     */
    public static boolean strValid(String str) {
        return str != null && !str.isEmpty();
    }

    /**
     * 判断字符串是否为有效字符串
     * @param str 字符串
     * @return bool
     */
    public static boolean strInvalid(String str) {
        return str == null || str.isEmpty();
    }

    /**
     * 返回字符串无效的错误响应
     * @return 错误响应
     */
    public static ServerResponse strInvalidResponse() {
        return ServerResponse.createByError(
                ResponseCode.STRING_EMPTY.getCode(),
                ResponseCode.STRING_EMPTY.getDesc()
        );
    }
}
