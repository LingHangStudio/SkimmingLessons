package com.linghang.skimlessons.dao;


import com.linghang.skimlessons.entity.ClassSchedule;
import com.linghang.skimlessons.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseDao {

    /**
     * 查询课程名称列表
     * @return 课程名称列表
     * @param collegeId 学院ID
     */
    List<String> getClassNameList(Integer collegeId);

    /**
     * 查询课程详情
     * @param className 课程名称
     * @return 课程详情列表
     */
    List<Course> getClassDetailList(Integer collegeId, String className);

    /**
     * 查询课程总数
     * @param collegeId 学院ID
     * @return 该学院课程总数
     */
    Integer getCourseCount(Integer collegeId);

    /**
     * 按课程名搜索课程详情(全范围)
     * @param key 关键词
     * @return 课程详情列表
     */
    List<Course> searchByCourseName(String key);

    /**
     * 按老师搜索课程详情(全范围)
     * @param key 关键词
     * @return 课程详情列表
     */
    List<Course> searchByTeacher(String key);

    /**
     * 按课程名搜索课程详情(学院范围)
     * @param key 关键词
     * @return 课程详情列表
     */
    List<Course> searchByCourseNameInCollege(Integer collegeId, String key);

    /**
     * 按老师搜索课程详情(学院范围)
     * @param key 关键词
     * @return 课程详情列表
     */
    List<Course> searchByTeacherInCollege(Integer collegeId, String key);

    /**
     * 合并搜索(全范围)
     * @param key 搜索关键词
     * @return 课程详情列表
     */
    List<Course> searchAll(String key);

    /**
     * 合并搜索(学院范围)
     * @param key 搜索关键词
     * @return 课程详情列表
     */
    List<Course> searchInCollege(Integer collegeId, String key);
}
