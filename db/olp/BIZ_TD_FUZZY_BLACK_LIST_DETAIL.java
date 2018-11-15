package com.bea.olp;

public class BIZ_TD_FUZZY_BLACK_LIST_DETAIL {
    private String appNo;

    private String ruleId;

    private String type;

    private String fraudTypeDisplayName;

    private String fuzzyIdNumber;

    private String fuzzyName;

    private String fraudType;

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

    public String getFraudTypeDisplayName() {
        return fraudTypeDisplayName;
    }

    public void setFraudTypeDisplayName(String fraudTypeDisplayName) {
        this.fraudTypeDisplayName = fraudTypeDisplayName == null ? null : fraudTypeDisplayName.trim();
    }

    public String getFuzzyIdNumber() {
        return fuzzyIdNumber;
    }

    public void setFuzzyIdNumber(String fuzzyIdNumber) {
        this.fuzzyIdNumber = fuzzyIdNumber == null ? null : fuzzyIdNumber.trim();
    }

    public String getFuzzyName() {
        return fuzzyName;
    }

    public void setFuzzyName(String fuzzyName) {
        this.fuzzyName = fuzzyName == null ? null : fuzzyName.trim();
    }

    public String getFraudType() {
        return fraudType;
    }

    public void setFraudType(String fraudType) {
        this.fraudType = fraudType == null ? null : fraudType.trim();
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