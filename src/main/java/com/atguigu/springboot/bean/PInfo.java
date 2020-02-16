package com.atguigu.springboot.bean;

public class PInfo {
    private Integer pId;

    private String pPicturelocal;

    private String pTime;

    private Integer pLocal;

    private byte[] pPicture;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpPicturelocal() {
        return pPicturelocal;
    }

    public void setpPicturelocal(String pPicturelocal) {
        this.pPicturelocal = pPicturelocal == null ? null : pPicturelocal.trim();
    }

    public String getpTime() {
        return pTime;
    }

    public void setpTime(String pTime) {
        this.pTime = pTime == null ? null : pTime.trim();
    }

    public Integer getpLocal() {
        return pLocal;
    }

    public void setpLocal(Integer pLocal) {
        this.pLocal = pLocal;
    }

    public byte[] getpPicture() {
        return pPicture;
    }

    public void setpPicture(byte[] pPicture) {
        this.pPicture = pPicture;
    }
}