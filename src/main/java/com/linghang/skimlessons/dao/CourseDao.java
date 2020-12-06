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
    List<Course> getClassDetailList(String className);

}
