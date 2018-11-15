package com.bea.olp;

public class BAT_TASK_MUTEX {
    private String mutexNo;

    private String mutexTaskNoList;

    private String useFlag;

    private String remarks;

    private String opUserId;

    private String opOrgId;

    private String inputDate;

    private String inputTime;

    private String lastUpdateDate;

    private String lastUpdateTime;

    public String getMutexNo() {
        return mutexNo;
    }

    public void setMutexNo(String mutexNo) {
        this.mutexNo = mutexNo == null ? null : mutexNo.trim();
    }

    public String getMutexTaskNoList() {
        return mutexTaskNoList;
    }

    public void setMutexTaskNoList(String mutexTaskNoList) {
        this.mutexTaskNoList = mutexTaskNoList == null ? null : mutexTaskNoList.trim();
    }

    public String getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(String useFlag) {
        this.useFlag = useFlag == null ? null : useFlag.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getOpUserId() {
        return opUserId;
    }

    public void setOpUserId(String opUserId) {
        this.opUserId = opUserId == null ? null : opUserId.trim();
    }

    public String getOpOrgId() {
        return opOrgId;
    }

    public void setOpOrgId(String opOrgId) {
        this.opOrgId = opOrgId == null ? null : opOrgId.trim();
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