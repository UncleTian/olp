package com.bea.olp;

public class LOG_AUDIT_CONFIG {
    private String pkId;

    private String instuId;

    private String bchId;

    private String rescId;

    private String isAudit;

    private String lastChgTime;

    public String getPkId() {
        return pkId;
    }

    public void setPkId(String pkId) {
        this.pkId = pkId == null ? null : pkId.trim();
    }

    public String getInstuId() {
        return instuId;
    }

    public void setInstuId(String instuId) {
        this.instuId = instuId == null ? null : instuId.trim();
    }

    public String getBchId() {
        return bchId;
    }

    public void setBchId(String bchId) {
        this.bchId = bchId == null ? null : bchId.trim();
    }

    public String getRescId() {
        return rescId;
    }

    public void setRescId(String rescId) {
        this.rescId = rescId == null ? null : rescId.trim();
    }

    public String getIsAudit() {
        return isAudit;
    }

    public void setIsAudit(String isAudit) {
        this.isAudit = isAudit == null ? null : isAudit.trim();
    }

    public String getLastChgTime() {
        return lastChgTime;
    }

    public void setLastChgTime(String lastChgTime) {
        this.lastChgTime = lastChgTime == null ? null : lastChgTime.trim();
    }
}