package com.linghang.skimlessons.util;

import com.linghang.skimlessons.enums.ResponseCode;
import com.linghang.skimlessons.common.ServerResponse;

import java.util.List;

/**
 * 分页参数异常判断工具
 * @author 田
 *
 */
public class PageUtil {

    /**
     * 判断分页参数是否正常
     * @param pageNum 当前页号
     * @param pageSize 单页容量
     * @return 服务器响应，如果参数不正常，则返回对应错误响应，否则返回成功响应
     */
    public static ServerResponse pageParamValid(int pageNum, int pageSize) {
        if (pageSize > 100) return ServerResponse.createByError(
                ResponseCode.PAGE_SIZE_TOO_LARGE.getCode(),
                ResponseCode.PAGE_SIZE_TOO_LARGE.getDesc());

        if(pageSize < 1) return ServerResponse.createByError(
                ResponseCode.PAGE_SIZE_TOO_LITTLE.getCode(),
                ResponseCode.PAGE_SIZE_TOO_LITTLE.getDesc()
        );

        if (pageNum < 1) return ServerResponse.createByError(
                ResponseCode.PAGE_NUM_OUT_LOWEST_BOUNDS.getCode(),
                ResponseCode.PAGE_NUM_OUT_LOWEST_BOUNDS.getDesc()
        );

        return ServerResponse.createBySuccess();
    }

    /**
     * 判断分页参数是否正常
     * @param pageNum 当前页号
     * @param list 判断的查询结果列表
     * @return 服务器响应，如果列表为空，则返回对应错误相应，否则返回成功响应
     */
    public static ServerResponse pageParamValid(int pageNum, List list) {
        if (list.isEmpty()) {
            if (pageNum == 1) return ServerResponse.createByError(
                    ResponseCode.EMPTY.getCode(),
                    ResponseCode.EMPTY.getDesc()
            );
            else return ServerResponse.createByError(
                    ResponseCode.PAGE_NUM_OUT_HIGHEST_BOUNDS.getCode(),
                    ResponseCode.PAGE_NUM_OUT_HIGHEST_BOUNDS.getDesc()
            );
        }

        return ServerResponse.createBySuccess();
    }
}
