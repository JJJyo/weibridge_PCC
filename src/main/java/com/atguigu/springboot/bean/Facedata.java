package com.atguigu.springboot.bean;

public class Facedata {
    private Integer id;

    private String name;

    private String idnumber;

    private Integer datasize;

    private String starttime;

    private String terminaltime;

    private String cameraip;

    private String macip;

    private byte[] image;

    private byte[] data;

    private byte[] fullimage;

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public byte[] getFullimage() {
        return fullimage;
    }

    public void setFullimage(byte[] fullimage) {
        this.fullimage = fullimage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber == null ? null : idnumber.trim();
    }

    public Integer getDatasize() {
        return datasize;
    }

    public void setDatasize(Integer datasize) {
        this.datasize = datasize;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public String getTerminaltime() {
        return terminaltime;
    }

    public void setTerminaltime(String terminaltime) {
        this.terminaltime = terminaltime == null ? null : terminaltime.trim();
    }

    public String getCameraip() {
        return cameraip;
    }

    public void setCameraip(String cameraip) {
        this.cameraip = cameraip == null ? null : cameraip.trim();
    }

    public String getMacip() {
        return macip;
    }

    public void setMacip(String macip) {
        this.macip = macip == null ? null : macip.trim();
    }
}