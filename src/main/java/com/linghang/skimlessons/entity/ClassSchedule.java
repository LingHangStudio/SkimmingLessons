package com.linghang.skimlessons.entity;

/**
 * all_class_schedule
 * 课程信息类
 * @author 田
 *
 */
public class ClassSchedule {

    private long id;

    private String courseName;

    private String teacherName;

    //classroom_num
    private int classroomId;

    private long collegeId;


    @Override
    public String toString() {
        return "ClassSchedule{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", classroomId=" + classroomId +
                ", collegeId=" + collegeId +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public long getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(long collegeId) {
        this.collegeId = collegeId;
    }

    public ClassSchedule() {}

    public ClassSchedule(long id, String courseName, String teacherName,
                         int classroomId, long collegeId) {
        this.id = id;
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.classroomId = classroomId;
        this.collegeId = collegeId;
    }
}
