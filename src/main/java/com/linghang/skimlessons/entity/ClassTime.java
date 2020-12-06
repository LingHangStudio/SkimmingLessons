package com.linghang.skimlessons.entity;

/**
 * all_class_schedule_time
 * 课程时间信息类
 * @author 田
 *
 */
public class ClassTime {

    private long id;

    //cls_shd_id
    private long classScheduleId;

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getClassScheduleId() {
        return classScheduleId;
    }

    public void setClassScheduleId(long classScheduleId) {
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

    public ClassTime(long id, long classScheduleId,
                     int startWeek, int endWeek,
                     String startSection, String endSection, int weekDay) {
        this.id = id;
        this.classScheduleId = classScheduleId;
        this.startWeek = startWeek;
        this.endWeek = endWeek;
        this.startSection = startSection;
        this.endSection = endSection;
        this.weekDay = weekDay;
    }
}
