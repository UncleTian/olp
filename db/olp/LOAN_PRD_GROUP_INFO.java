package com.bea.olp;

public class LOAN_PRD_GROUP_INFO {
    private String lmtNo;

    private String parentNo;

    private String lmtName;

    private String lmtStatus;

    private String remark;

    private String inputTime;

    private String inputId;

    private String inputBrId;

    private String lastUpdateTime;

    private String lastUpdateId;

    public String getLmtNo() {
        return lmtNo;
    }

    public void setLmtNo(String lmtNo) {
        this.lmtNo = lmtNo == null ? null : lmtNo.trim();
    }

    public String getParentNo() {
        return parentNo;
    }

    public void setParentNo(String parentNo) {
        this.parentNo = parentNo == null ? null : parentNo.trim();
    }

    public String getLmtName() {
        return lmtName;
    }

    public void setLmtName(String lmtName) {
        this.lmtName = lmtName == null ? null : lmtName.trim();
    }

    public String getLmtStatus() {
        return lmtStatus;
    }

    public void setLmtStatus(String lmtStatus) {
        this.lmtStatus = lmtStatus == null ? null : lmtStatus.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getInputTime() {
        return inputTime;
    }

    public void setInputTime(String inputTime) {
        this.inputTime = inputTime == null ? null : inputTime.trim();
    }

    public String getInputId() {
        return inputId;
    }

    public void setInputId(String inputId) {
        this.inputId = inputId == null ? null : inputId.trim();
    }

    public String getInputBrId() {
        return inputBrId;
    }

    public void setInputBrId(String inputBrId) {
        this.inputBrId = inputBrId == null ? null : inputBrId.trim();
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime == null ? null : lastUpdateTime.trim();
    }

    public String getLastUpdateId() {
        return lastUpdateId;
    }

    public void setLastUpdateId(String lastUpdateId) {
        this.lastUpdateId = lastUpdateId == null ? null : lastUpdateId.trim();
    }
}