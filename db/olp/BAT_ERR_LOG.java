package com.bea.olp;

public class BAT_ERR_LOG {
    private String threadsSerno;

    private String ruleSn;

    private String errInfo;

    private String runDate;

    private String recordTime;

    private String failReason;

    public String getThreadsSerno() {
        return threadsSerno;
    }

    public void setThreadsSerno(String threadsSerno) {
        this.threadsSerno = threadsSerno == null ? null : threadsSerno.trim();
    }

    public String getRuleSn() {
        return ruleSn;
    }

    public void setRuleSn(String ruleSn) {
        this.ruleSn = ruleSn == null ? null : ruleSn.trim();
    }

    public String getErrInfo() {
        return errInfo;
    }

    public void setErrInfo(String errInfo) {
        this.errInfo = errInfo == null ? null : errInfo.trim();
    }

    public String getRunDate() {
        return runDate;
    }

    public void setRunDate(String runDate) {
        this.runDate = runDate == null ? null : runDate.trim();
    }

    public String getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(String recordTime) {
        this.recordTime = recordTime == null ? null : recordTime.trim();
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason == null ? null : failReason.trim();
    }
}