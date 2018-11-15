package com.bea.olp;

public class BIZ_TD_CUSTOM_LIST extends BIZ_TD_CUSTOM_LISTKey {
    private String description;

    private String highRiskAreas;

    private String hitListDatas;

    private String inputDate;

    private String inputTime;

    private String lastUpdateDate;

    private String lastUpdateTime;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getHighRiskAreas() {
        return highRiskAreas;
    }

    public void setHighRiskAreas(String highRiskAreas) {
        this.highRiskAreas = highRiskAreas == null ? null : highRiskAreas.trim();
    }

    public String getHitListDatas() {
        return hitListDatas;
    }

    public void setHitListDatas(String hitListDatas) {
        this.hitListDatas = hitListDatas == null ? null : hitListDatas.trim();
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