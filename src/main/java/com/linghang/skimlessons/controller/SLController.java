package com.linghang.skimlessons.controller;

import com.linghang.skimlessons.common.ServerResponse;
import com.linghang.skimlessons.service.SLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 蹭课controller
 * @author 田
 */
@RestController
@RequestMapping("/sl")
public class SLController {

    @Autowired
    private SLService slService;

    // 获取学院列表
    @GetMapping("getCollegeList")
    public ServerResponse getCollegeList() {
        return slService.getCollegeList();
    }

    // 通过学院ID获取课程名称列表
    @GetMapping("getCourseNameList")
    public ServerResponse getCourseNameList(
            @RequestParam("collegeId") Integer collegeId,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "15") Integer pageSize) {
        return slService.getClassNameList(collegeId, pageNum, pageSize);
    }

    //通过课程名称获取课程详情信息列表
    @GetMapping("getCourseDetail")
    public ServerResponse getCourseDetail(
            @RequestParam("collegeId") Integer collegeId,
            @RequestParam("courseName") String courseName,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        return slService.getCourseInfo(collegeId, courseName, pageNum, pageSize);
    }

    //全范围模糊搜索课程详情信息(带前提:老师/课程名)
    @GetMapping("searchWithCondition")
    public ServerResponse searchWithCondition(
            @RequestParam("condition") Integer condition,
            @RequestParam("key") String key,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        return slService.searchCourse(condition, key, pageNum, pageSize);
    }

    //全范围模糊搜索课程详情信息(带前提:老师/课程名)
    @GetMapping("searchInCollegeWithCondition")
    public ServerResponse searchInCollegeWithCondition(
            @RequestParam("condition") Integer condition,
            @RequestParam("collegeId") Integer collegeId,
            @RequestParam("key") String key,
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        return slService.searchCourseInCollege(collegeId, condition, key, pageNum, pageSize);
    }
}
