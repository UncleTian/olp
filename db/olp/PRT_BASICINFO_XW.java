package com.bea.olp;

public class PRT_BASICINFO_XW {
    private String appId;

    private String appName;

    private String certificateType;

    private String idCardStart;

    private String idCardEnd;

    private String appPn;

    private String inputDate;

    private String inputTime;

    private String lastUpdateDate;

    private String lastUpdateTime;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType == null ? null : certificateType.trim();
    }

    public String getIdCardStart() {
        return idCardStart;
    }

    public void setIdCardStart(String idCardStart) {
        this.idCardStart = idCardStart == null ? null : idCardStart.trim();
    }

    public String getIdCardEnd() {
        return idCardEnd;
    }

    public void setIdCardEnd(String idCardEnd) {
        this.idCardEnd = idCardEnd == null ? null : idCardEnd.trim();
    }

    public String getAppPn() {
        return appPn;
    }

    public void setAppPn(String appPn) {
        this.appPn = appPn == null ? null : appPn.trim();
    }

    public String getInputDate() {
        return inputDate;
    }

    public void setInputDate(String inputDate) {
        this.inputDate = inputDate == null ? null : inputDate.trim();
    }

    public String getInputTime() {
        return inputTime;
    }

    public void setInputTime(String inputTime) {
        this.inputTime = inputTime == null ? null : inputTime.trim();
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate == null ? null : lastUpdateDate.trim();
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime == null ? null : lastUpdateTime.trim();
    }
}