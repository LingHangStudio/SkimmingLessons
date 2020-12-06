package com.linghang.skimlessons.entity;

/**
 * all_class_schedule_time
 * 课程时间信息类
 * @author 田
 *
 */
public class ClassTime {

    private int id;

    //cls_shd_id
    private int classScheduleId;

    private int startWeek;

    private int endWeek;

    private String startSection;

    private String endSection;

    //week
    private int weekDay;


    @Override
    public String toString() {
        return "ClassTime{" +
                "id=" + id +
                ", classScheduleId=" + classScheduleId +
                ", startWeek=" + startWeek +
                ", endWeek=" + endWeek +
                ", startSection='" + startSection + '\'' +
                ", endSection='" + endSection + '\'' +
                ", weekDay=" + weekDay +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClassScheduleId() {
        return classScheduleId;
    }

    public void setClassScheduleId(int classScheduleId) {
        this.classScheduleId = classScheduleId;
    }

    public int getStartWeek() {
        return startWeek;
    }

    public void setStartWeek(int startWeek) {
        this.startWeek = startWeek;
    }

    public int getEndWeek() {
        return endWeek;
    }

    public void setEndWeek(int endWeek) {
        this.endWeek = endWeek;
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

    public int getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(int weekDay) {
        this.weekDay = weekDay;
    }

    public ClassTime() {}

    public ClassTime(Integer id, Integer classScheduleId,
                     Integer startWeek, Integer endWeek,
                     String startSection, String endSection, Integer weekDay) {
        this.id = id;
        this.classScheduleId = classScheduleId;
        this.startWeek = startWeek;
        this.endWeek = endWeek;
        this.startSection = startSection;
        this.endSection = endSection;
        this.weekDay = weekDay;
    }
}
