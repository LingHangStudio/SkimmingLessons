package com.linghang.skimlessons.service.impl;

import com.github.pagehelper.PageHelper;
import com.linghang.skimlessons.common.ResponseCode;
import com.linghang.skimlessons.common.ServerResponse;
import com.linghang.skimlessons.dao.CourseDao;
import com.linghang.skimlessons.dao.CollegeDao;
import com.linghang.skimlessons.entity.College;
import com.linghang.skimlessons.entity.Course;
import com.linghang.skimlessons.service.SLService;
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

        PageHelper.startPage(pageNum, pageSize);

        List<String> classNameList = courseDao.getClassNameList(collegeId);

        if (classNameList.isEmpty()) return ServerResponse.createByError(
                ResponseCode.PAGE_NUM_OUT_HIGHEST_BOUNDS.getCode(),
                ResponseCode.PAGE_NUM_OUT_HIGHEST_BOUNDS.getDesc()
        );

        return ServerResponse.createBySuccess("获取课程名称列表成功", classNameList);
    }

    @Override
    public ServerResponse getCourseInfo(String CourseName, int pageNum, int pageSize) {
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

        PageHelper.startPage(pageNum, pageSize);

        List<Course> detailList = courseDao.getClassDetailList(CourseName);

        if (detailList.isEmpty()) return ServerResponse.createByError(
                ResponseCode.PAGE_NUM_OUT_HIGHEST_BOUNDS.getCode(),
                ResponseCode.PAGE_NUM_OUT_HIGHEST_BOUNDS.getDesc()
        );

        return ServerResponse.createBySuccess("获取课程详情信息列表成功", detailList);
    }

}
