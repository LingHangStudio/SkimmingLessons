package com.linghang.skimlessons.service.impl;

import com.github.pagehelper.PageHelper;
import com.linghang.skimlessons.common.ServerResponse;
import com.linghang.skimlessons.dao.CourseDao;
import com.linghang.skimlessons.dao.CollegeDao;
import com.linghang.skimlessons.entity.College;
import com.linghang.skimlessons.entity.Course;
import com.linghang.skimlessons.enums.ResponseCode;
import com.linghang.skimlessons.enums.SearchCondition;
import com.linghang.skimlessons.service.SLService;
import com.linghang.skimlessons.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.Collator;
import java.util.*;

@Service("SLService")
public class SLServiceImpl implements SLService {

    @Autowired
    private CollegeDao collegeDao;
    @Autowired
    private CourseDao courseDao;

    //汉字拼音首字母排序
    private static final Comparator CHSComparator = Collator.getInstance(java.util.Locale.CHINA);

    @Override
    public ServerResponse getCollegeList() {
        List<College> allCollege = collegeDao.findAllCollege();

        return ServerResponse.createBySuccess("获取学院列表成功", allCollege);
    }

    @Override
    public ServerResponse getClassNameList(Integer collegeId, int pageNum, int pageSize) {
        ServerResponse paramValid = PageUtil.pageParamValid(pageNum, pageSize);
        if (!paramValid.isSuccess()) return paramValid;

        PageHelper.startPage(pageNum, pageSize);

        List<String> classNameList = courseDao.getClassNameList(collegeId);

        paramValid = PageUtil.pageParamValid(pageNum, classNameList);
        if (!paramValid.isSuccess()) return paramValid;

        return ServerResponse.createBySuccess("获取课程名称列表成功", classNameList);
    }

    @Override
    public ServerResponse getCourseInfo(int collegeId, String CourseName, int pageNum, int pageSize) {
        ServerResponse paramValid = PageUtil.pageParamValid(pageNum, pageSize);
        if (!paramValid.isSuccess()) return paramValid;

        PageHelper.startPage(pageNum, pageSize);

        List<Course> detailList = courseDao.getClassDetailList(collegeId, CourseName);

        paramValid = PageUtil.pageParamValid(pageNum, detailList);
        if (!paramValid.isSuccess()) return paramValid;

        return ServerResponse.createBySuccess("获取课程详情信息列表成功", detailList);
    }

    @Override
    public ServerResponse searchCourse(int condition, String key, int pageNum, int pageSize) {
        ServerResponse paramValid = PageUtil.pageParamValid(pageNum, pageSize);
        if (!paramValid.isSuccess()) return paramValid;

        PageHelper.startPage(pageNum, pageSize);

        List<Course> courseList = null;
        if (condition == SearchCondition.BY_COURSE_NAME.getCode())
            courseList = courseDao.searchByCourseName("%" + key + "%");
        else if (condition == SearchCondition.BY_TEACHER.getCode())
            courseList = courseDao.searchByTeacher("%" + key + "%");
        else return ServerResponse.createByError(
                    ResponseCode.INVALID_CONDITION.getCode(),
                    ResponseCode.INVALID_CONDITION.getDesc()
            );

        paramValid = PageUtil.pageParamValid(pageNum, courseList);
        if (!paramValid.isSuccess()) return paramValid;

        return ServerResponse.createBySuccess("全范围搜索成功", courseList);
    }

    @Override
    public ServerResponse searchCourseInCollege(int collegeId, int condition,
                                                String key, int pageNum, int pageSize) {
        ServerResponse paramValid = PageUtil.pageParamValid(pageNum, pageSize);
        if (!paramValid.isSuccess()) return paramValid;

        PageHelper.startPage(pageNum, pageSize);

        List<Course> courseList = null;
        if (condition == SearchCondition.BY_COURSE_NAME.getCode())
            courseList = courseDao.searchByCourseNameInCollege(collegeId, "%" + key + "%");
        else if (condition == SearchCondition.BY_TEACHER.getCode())
            courseList = courseDao.searchByTeacherInCollege(collegeId, "%" + key + "%");
        else return ServerResponse.createByError(
                    ResponseCode.INVALID_CONDITION.getCode(),
                    ResponseCode.INVALID_CONDITION.getDesc()
            );

        paramValid = PageUtil.pageParamValid(pageNum, courseList);
        if (!paramValid.isSuccess()) return paramValid;

        return ServerResponse.createBySuccess("学院范围搜索成功", courseList);
    }

}
