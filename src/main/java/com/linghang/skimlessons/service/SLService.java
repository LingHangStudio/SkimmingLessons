package com.linghang.skimlessons.service;

import com.linghang.skimlessons.common.ServerResponse;

/**
 * 蹭课Service
 * @author 田
 */
public interface SLService {

    /**
     * 获取学院列表
     * @return json数据
     */
    ServerResponse getCollegeList();

    /**
     * 通过学院ID获取课程名称列表
     * @return json数据
     */
    ServerResponse getClassNameList(Integer collegeId, int pageNum, int pageSize);

    /**
     * 通过课程名获取课程详细信息
     * @param CourseName 课程名
     * @param pageNum 页号
     * @param pageSize 单页容量
     * @return json数据
     */
    ServerResponse getCourseInfo(String CourseName, int pageNum, int pageSize);
}
