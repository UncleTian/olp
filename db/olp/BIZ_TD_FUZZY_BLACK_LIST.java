package com.bea.olp;

public class BIZ_TD_FUZZY_BLACK_LIST extends BIZ_TD_FUZZY_BLACK_LISTKey {
    private String description;

    private String fraudTypeDisplayName;

    private String fuzzyListDetails;

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

    public String getFraudTypeDisplayName() {
        return fraudTypeDisplayName;
    }

    public void setFraudTypeDisplayName(String fraudTypeDisplayName) {
        this.fraudTypeDisplayName = fraudTypeDisplayName == null ? null : fraudTypeDisplayName.trim();
    }

    public String getFuzzyListDetails() {
        return fuzzyListDetails;
    }

    public void setFuzzyListDetails(String fuzzyListDetails) {
        this.fuzzyListDetails = fuzzyListDetails == null ? null : fuzzyListDetails.trim();
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