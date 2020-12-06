package com.linghang.skimlessons.entity;

/**
 * classroom
 * 教室信息类
 * @author 田
 *
 */
public class Classroom {

    private long id;

    private String buildingName;

    private String areaNum;

    private String roomNum;

    private String campusName;


    @Override
    public String toString() {
        return "Classroom{" +
                "id=" + id +
                ", buildingName='" + buildingName + '\'' +
                ", areaNum='" + areaNum + '\'' +
                ", roomNum='" + roomNum + '\'' +
                ", campusName='" + campusName + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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


    public Classroom() {}

    public Classroom(long id, String buildingName, String areaNum, String roomNum, String campusName) {
        this.id = id;
        this.buildingName = buildingName;
        this.areaNum = areaNum;
        this.roomNum = roomNum;
        this.campusName = campusName;
    }
}
