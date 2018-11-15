package com.bea.olp;

import java.math.BigDecimal;

public class BAT_CONTROL_HIS {
    private String openDay;

    private BigDecimal threadNum;

    private String warnTime;

    private String exitTime;

    private BigDecimal waitTime;

    private String smsFlag;

    private String beginTime;

    private String endTime;

    private String controlStatus;

    private String lastUpdateTime;

    public String getOpenDay() {
        return openDay;
    }

    public void setOpenDay(String openDay) {
        this.openDay = openDay == null ? null : openDay.trim();
    }

    public BigDecimal getThreadNum() {
        return threadNum;
    }

    public void setThreadNum(BigDecimal threadNum) {
        this.threadNum = threadNum;
    }

    public String getWarnTime() {
        return warnTime;
    }

    public void setWarnTime(String warnTime) {
        this.warnTime = warnTime == null ? null : warnTime.trim();
    }

    public String getExitTime() {
        return exitTime;
    }

    public void setExitTime(String exitTime) {
        this.exitTime = exitTime == null ? null : exitTime.trim();
    }

    public BigDecimal getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(BigDecimal waitTime) {
        this.waitTime = waitTime;
    }

    public String getSmsFlag() {
        return smsFlag;
    }

    public void setSmsFlag(String smsFlag) {
        this.smsFlag = smsFlag == null ? null : smsFlag.trim();
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime == null ? null : beginTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public String getControlStatus() {
        return controlStatus;
    }

    public void setControlStatus(String controlStatus) {
        this.controlStatus = controlStatus == null ? null : controlStatus.trim();
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime == null ? null : lastUpdateTime.trim();
    }
}