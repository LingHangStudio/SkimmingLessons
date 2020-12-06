package com.linghang.skimlessons.entity;

/**
 *
 * @author 田
 * 学院信息类
 */
public class College {

    private int id;

    private String collegeName;

    @Override
    public String toString() {
        return "College{" +
                "id=" + id +
                ", collegeName='" + collegeName + '\'' +
                '}';
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

    public College(Integer id, String collegeName) {
        this.id = id;
        this.collegeName = collegeName;
    }
}
