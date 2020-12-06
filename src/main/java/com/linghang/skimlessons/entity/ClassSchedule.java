package com.linghang.skimlessons.entity;

/**
 * all_class_schedule
 * 课程信息类
 * @author 田
 *
 */
public class ClassSchedule {

    private int id;

    private String courseName;

    private String teacherName;

    private String term;

    //classroom_num
    private int classroomId;

    private int collegeId;


    @Override
    public String toString() {
        return "ClassSchedule{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", term='" + term + '\'' +
                ", classroomId=" + classroomId +
                ", collegeId=" + collegeId +
                '}';
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
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

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    public ClassSchedule() {}

    public ClassSchedule(Integer id, String courseName,
                         String teacherName, String term,
                         Integer classroomId, Integer collegeId) {
        this.id = id;
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.term = term;
        this.classroomId = classroomId;
        this.collegeId = collegeId;
    }
}
