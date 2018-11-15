package com.bea.olp;

public class BIZ_CFG_INDUSTRY {
    private String industryId;

    private String industryCode;

    private String industryName;

    private String industryRiskLeve;

    private String inputDate;

    private String inputTime;

    public String getIndustryId() {
        return industryId;
    }

    public void setIndustryId(String industryId) {
        this.industryId = industryId == null ? null : industryId.trim();
    }

    public String getIndustryCode() {
        return industryCode;
    }

    public void setIndustryCode(String industryCode) {
        this.industryCode = industryCode == null ? null : industryCode.trim();
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName == null ? null : industryName.trim();
    }

    public String getIndustryRiskLeve() {
        return industryRiskLeve;
    }

    public void setIndustryRiskLeve(String industryRiskLeve) {
        this.industryRiskLeve = industryRiskLeve == null ? null : industryRiskLeve.trim();
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
}