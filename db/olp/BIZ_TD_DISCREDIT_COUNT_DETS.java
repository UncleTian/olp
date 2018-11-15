package com.bea.olp;

public class BIZ_TD_DISCREDIT_COUNT_DETS {
    private String appNo;

    private String ruleId;

    private String type;

    private String overdueAmountRange;

    private String overdueDayRange;

    private String overdueCount;

    private String overdueTime;

    private String inputDate;

    private String inputTime;

    private String lastUpdateDate;

    private String lastUpdateTime;

    public String getAppNo() {
        return appNo;
    }

    public void setAppNo(String appNo) {
        this.appNo = appNo == null ? null : appNo.trim();
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId == null ? null : ruleId.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getOverdueAmountRange() {
        return overdueAmountRange;
    }

    public void setOverdueAmountRange(String overdueAmountRange) {
        this.overdueAmountRange = overdueAmountRange == null ? null : overdueAmountRange.trim();
    }

    public String getOverdueDayRange() {
        return overdueDayRange;
    }

    public void setOverdueDayRange(String overdueDayRange) {
        this.overdueDayRange = overdueDayRange == null ? null : overdueDayRange.trim();
    }

    public String getOverdueCount() {
        return overdueCount;
    }

    public void setOverdueCount(String overdueCount) {
        this.overdueCount = overdueCount == null ? null : overdueCount.trim();
    }

    public String getOverdueTime() {
        return overdueTime;
    }

    public void setOverdueTime(String overdueTime) {
        this.overdueTime = overdueTime == null ? null : overdueTime.trim();
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