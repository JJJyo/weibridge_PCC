package com.atguigu.springboot.bean;

public class FacedataWithBLOBs extends Facedata {
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
}