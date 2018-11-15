package com.bea.olp;

public class BIZ_TD_DISCREDIT_COUNT extends BIZ_TD_DISCREDIT_COUNTKey {
    private String description;

    private String discreditTimes;

    private String overdueDetails;

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

    public String getDiscreditTimes() {
        return discreditTimes;
    }

    public void setDiscreditTimes(String discreditTimes) {
        this.discreditTimes = discreditTimes == null ? null : discreditTimes.trim();
    }

    public String getOverdueDetails() {
        return overdueDetails;
    }

    public void setOverdueDetails(String overdueDetails) {
        this.overdueDetails = overdueDetails == null ? null : overdueDetails.trim();
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