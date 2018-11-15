package com.bea.olp;

public class BIZ_TD_RISK_RULES_INFO extends BIZ_TD_RISK_RULES_INFOKey {
    private String suspectTeamDetailList;

    private String inputDate;

    private String inputTime;

    private String lastUpdateDate;

    private String lastUpdateTime;

    public String getSuspectTeamDetailList() {
        return suspectTeamDetailList;
    }

    public void setSuspectTeamDetailList(String suspectTeamDetailList) {
        this.suspectTeamDetailList = suspectTeamDetailList == null ? null : suspectTeamDetailList.trim();
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