package com.bea.olp;

public class BIZ_TD_CROSS_EVENT_DETAIL extends BIZ_TD_CROSS_EVENT_DETAILKey {
    private String inputDate;

    private String inputTime;

    private String lastUpdateDate;

    private String lastUpdateTime;

    private String crossEventDetailList;

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

    public String getCrossEventDetailList() {
        return crossEventDetailList;
    }

    public void setCrossEventDetailList(String crossEventDetailList) {
        this.crossEventDetailList = crossEventDetailList == null ? null : crossEventDetailList.trim();
    }
}