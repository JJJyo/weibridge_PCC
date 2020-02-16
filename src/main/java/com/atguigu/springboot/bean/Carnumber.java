package com.atguigu.springboot.bean;

public class Carnumber {
    private Integer id;

    private String carnumber;

    private Integer location;

    private String time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber == null ? null : carnumber.trim();
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }
}