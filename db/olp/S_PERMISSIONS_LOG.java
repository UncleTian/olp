package com.bea.olp;

public class S_PERMISSIONS_LOG {
    private String ctDate;

    private String ctFlag;

    private String lastUpdateTime;

    public String getCtDate() {
        return ctDate;
    }

    public void setCtDate(String ctDate) {
        this.ctDate = ctDate == null ? null : ctDate.trim();
    }

    public String getCtFlag() {
        return ctFlag;
    }

    public void setCtFlag(String ctFlag) {
        this.ctFlag = ctFlag == null ? null : ctFlag.trim();
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime == null ? null : lastUpdateTime.trim();
    }
}