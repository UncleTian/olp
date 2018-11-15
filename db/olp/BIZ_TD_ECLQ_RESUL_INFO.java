package com.bea.olp;

public class BIZ_TD_ECLQ_RESUL_INFO {
    private String appNo;

    private String consumeAbilitySuccess;

    private String yLatestInAmtMin;

    private String inputDate;

    private String inputTime;

    private String lastUpdateDate;

    private String lastUpdateTime;

    private String errorInfo;

    public String getAppNo() {
        return appNo;
    }

    public void setAppNo(String appNo) {
        this.appNo = appNo == null ? null : appNo.trim();
    }

    public String getConsumeAbilitySuccess() {
        return consumeAbilitySuccess;
    }

    public void setConsumeAbilitySuccess(String consumeAbilitySuccess) {
        this.consumeAbilitySuccess = consumeAbilitySuccess == null ? null : consumeAbilitySuccess.trim();
    }

    public String getyLatestInAmtMin() {
        return yLatestInAmtMin;
    }

    public void setyLatestInAmtMin(String yLatestInAmtMin) {
        this.yLatestInAmtMin = yLatestInAmtMin == null ? null : yLatestInAmtMin.trim();
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

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo == null ? null : errorInfo.trim();
    }
}