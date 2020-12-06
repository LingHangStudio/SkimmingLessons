package com.linghang.skimlessons.entity;

/**
 *
 * @author 田
 * 学院信息类
 */
public class College {

    private int id;

    private String collegeName;

    private int courseTotal;

    @Override
    public String toString() {
        return "College{" +
                "id=" + id +
                ", collegeName='" + collegeName + '\'' +
                ", courseTotal=" + courseTotal +
                '}';
    }

    public int getCourseTotal() {
        return courseTotal;
    }

    public void setCourseTotal(int courseTotal) {
        this.courseTotal = courseTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public College() {}

    public College(Integer id, String collegeName, Integer courseTotal) {
        this.id = id;
        this.collegeName = collegeName;
        this.courseTotal = courseTotal;
    }
}
