package com.bea.olp;

public class BIZ_TD_CROSS_FREQUENCY_DETAIL extends BIZ_TD_CROSS_FREQUENCY_DETAILKey {
    private String crossFrequencyDetailList;

    private String inputDate;

    private String inputTime;

    private String lastUpdateDate;

    private String lastUpdateTime;

    public String getCrossFrequencyDetailList() {
        return crossFrequencyDetailList;
    }

    public void setCrossFrequencyDetailList(String crossFrequencyDetailList) {
        this.crossFrequencyDetailList = crossFrequencyDetailList == null ? null : crossFrequencyDetailList.trim();
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