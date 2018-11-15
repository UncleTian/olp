package com.bea.olp;

public class BIZ_CFG_OCCUPATION {
    private String occupationId;

    private String source;

    private String occupation;

    private String cbmCode;

    private String occupationDesc;

    private String occupationRiskLevel;

    private String inputDate;

    private String inputTime;

    public String getOccupationId() {
        return occupationId;
    }

    public void setOccupationId(String occupationId) {
        this.occupationId = occupationId == null ? null : occupationId.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation == null ? null : occupation.trim();
    }

    public String getCbmCode() {
        return cbmCode;
    }

    public void setCbmCode(String cbmCode) {
        this.cbmCode = cbmCode == null ? null : cbmCode.trim();
    }

    public String getOccupationDesc() {
        return occupationDesc;
    }

    public void setOccupationDesc(String occupationDesc) {
        this.occupationDesc = occupationDesc == null ? null : occupationDesc.trim();
    }

    public String getOccupationRiskLevel() {
        return occupationRiskLevel;
    }

    public void setOccupationRiskLevel(String occupationRiskLevel) {
        this.occupationRiskLevel = occupationRiskLevel == null ? null : occupationRiskLevel.trim();
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