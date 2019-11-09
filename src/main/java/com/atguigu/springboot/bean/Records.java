package com.atguigu.springboot.bean;

import java.util.Date;

public class Records {
    private Integer id;

    private Date time;

    private byte[] facefeature;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public byte[] getFacefeature() {
        return facefeature;
    }

    public void setFacefeature(byte[] facefeature) {
        this.facefeature = facefeature;
    }
}