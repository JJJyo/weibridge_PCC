package com.atguigu.springboot.bean;

public class TUeInfo {
    private Long id;

    private String siteName;

    private String deviceSn;

    private String siteSn;

    private String imsi;

    private String imei;

    private String rssi;

    private String stmsi;

    private String mac;

    private String latype;

    private Byte indication;

    private Boolean realtime;

    private String captureTime;

    private Long rarta;

    private String createTime;

    private String cityName;

    private String cityCode;

    private String band;

    private String operator;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName == null ? null : siteName.trim();
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn == null ? null : deviceSn.trim();
    }

    public String getSiteSn() {
        return siteSn;
    }

    public void setSiteSn(String siteSn) {
        this.siteSn = siteSn == null ? null : siteSn.trim();
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi == null ? null : imsi.trim();
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    public String getRssi() {
        return rssi;
    }

    public void setRssi(String rssi) {
        this.rssi = rssi == null ? null : rssi.trim();
    }

    public String getStmsi() {
        return stmsi;
    }

    public void setStmsi(String stmsi) {
        this.stmsi = stmsi == null ? null : stmsi.trim();
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac == null ? null : mac.trim();
    }

    public String getLatype() {
        return latype;
    }

    public void setLatype(String latype) {
        this.latype = latype == null ? null : latype.trim();
    }

    public Byte getIndication() {
        return indication;
    }

    public void setIndication(Byte indication) {
        this.indication = indication;
    }

    public Boolean getRealtime() {
        return realtime;
    }

    public void setRealtime(Boolean realtime) {
        this.realtime = realtime;
    }

    public String getCaptureTime() {
        return captureTime;
    }

    public void setCaptureTime(String captureTime) {
        this.captureTime = captureTime == null ? null : captureTime.trim();
    }

    public Long getRarta() {
        return rarta;
    }

    public void setRarta(Long rarta) {
        this.rarta = rarta;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band == null ? null : band.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }
}