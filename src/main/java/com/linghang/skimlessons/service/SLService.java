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

    /**
     * 全范围模糊搜索课程详情信息(带前提:老师/课程名)
     * @param key 搜索关键词
     * @param pageNum 当前页号
     * @param pageSize 单页条数
     * @return json数据
     */
    ServerResponse searchCourse(int condition, String key, int pageNum, int pageSize);

    /**
     * 学院范围模糊搜索课程详情信息(带前提:老师/课程名)
     * @param key 搜索关键词
     * @param pageNum 当前页号
     * @param pageSize 单页条数
     * @return json数据
     */
    ServerResponse searchCourseInCollege(int collegeId, int condition,
                                         String key, int pageNum, int pageSize);
}
