package com.linghang.skimlessons.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * all_class_schedule
 * && all_class_schedule_time
 * && classroom
 * 课程详情信息类
 * @author 田
 */
public class Course {
    //all_class_schedule 的主键ID
    private int id;

    private String courseName;

    private String teacherName;

    //classroom_num
    @JsonIgnore
    private int classroomId;

    private String buildingName;

    private String areaNum;

    private String roomNum;

    private String campusName;

    private Integer startWeek;

    private Integer endWeek;

    //week
    private Integer weekDay;

    private String startSection;

    private String endSection;


    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", classroomId=" + classroomId +
                ", buildingName='" + buildingName + '\'' +
                ", areaNum='" + areaNum + '\'' +
                ", roomNum='" + roomNum + '\'' +
                ", campusName='" + campusName + '\'' +
                ", startWeek=" + startWeek +
                ", endWeek=" + endWeek +
                ", weekDay=" + weekDay +
                ", startSection='" + startSection + '\'' +
                ", endSection='" + endSection + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(int classroomId) {
        this.classroomId = classroomId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getAreaNum() {
        return areaNum;
    }

    public void setAreaNum(String areaNum) {
        this.areaNum = areaNum;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public String getCampusName() {
        return campusName;
    }

    public void setCampusName(String campusName) {
        this.campusName = campusName;
    }

    public Integer getStartWeek() {
        return startWeek;
    }

    public void setStartWeek(Integer startWeek) {
        this.startWeek = startWeek;
    }

    public Integer getEndWeek() {
        return endWeek;
    }

    public void setEndWeek(Integer endWeek) {
        this.endWeek = endWeek;
    }

    public Integer getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(Integer weekDay) {
        this.weekDay = weekDay;
    }

    public String getStartSection() {
        return startSection;
    }

    public void setStartSection(String startSection) {
        this.startSection = startSection;
    }

    public String getEndSection() {
        return endSection;
    }

    public void setEndSection(String endSection) {
        this.endSection = endSection;
    }

    public Course() {}

    public Course(Integer id, String courseName, String teacherName,
                  Integer classroomId, String buildingName, String areaNum,
                  String roomNum, String campusName, Integer startWeek,
                  Integer endWeek, Integer weekDay, String startSection,
                  String endSection) {
        this.id = id;
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.classroomId = classroomId;
        this.buildingName = buildingName;
        this.areaNum = areaNum;
        this.roomNum = roomNum;
        this.campusName = campusName;
        this.startWeek = startWeek;
        this.endWeek = endWeek;
        this.weekDay = weekDay;
        this.startSection = startSection;
        this.endSection = endSection;
    }
}
