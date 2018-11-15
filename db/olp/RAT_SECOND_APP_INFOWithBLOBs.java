package com.bea.olp;

public class RAT_SECOND_APP_INFOWithBLOBs extends RAT_SECOND_APP_INFO {
    private String platformReason;

    private String changeReason;

    private String extInfo;

    public String getPlatformReason() {
        return platformReason;
    }

    public void setPlatformReason(String platformReason) {
        this.platformReason = platformReason == null ? null : platformReason.trim();
    }

    public String getChangeReason() {
        return changeReason;
    }

    public void setChangeReason(String changeReason) {
        this.changeReason = changeReason == null ? null : changeReason.trim();
    }

    public String getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo == null ? null : extInfo.trim();
    }
}