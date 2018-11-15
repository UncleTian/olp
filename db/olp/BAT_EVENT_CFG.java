package com.bea.olp;

import java.math.BigDecimal;

public class BAT_EVENT_CFG {
    private String eventNo;

    private String taskNo;

    private String eventClass;

    private BigDecimal runNum;

    private String dataFileName;

    private String signalFileName;

    private String tabName;

    private String md5Flag;

    private String useFlag;

    private String opUserId;

    private String opOrgId;

    private String inputDate;

    private String inputTime;

    private String lastUpdateDate;

    private String lastUpdateTime;

    private String fullFlag;

    public String getEventNo() {
        return eventNo;
    }

    public void setEventNo(String eventNo) {
        this.eventNo = eventNo == null ? null : eventNo.trim();
    }

    public String getTaskNo() {
        return taskNo;
    }

    public void setTaskNo(String taskNo) {
        this.taskNo = taskNo == null ? null : taskNo.trim();
    }

    public String getEventClass() {
        return eventClass;
    }

    public void setEventClass(String eventClass) {
        this.eventClass = eventClass == null ? null : eventClass.trim();
    }

    public BigDecimal getRunNum() {
        return runNum;
    }

    public void setRunNum(BigDecimal runNum) {
        this.runNum = runNum;
    }

    public String getDataFileName() {
        return dataFileName;
    }

    public void setDataFileName(String dataFileName) {
        this.dataFileName = dataFileName == null ? null : dataFileName.trim();
    }

    public String getSignalFileName() {
        return signalFileName;
    }

    public void setSignalFileName(String signalFileName) {
        this.signalFileName = signalFileName == null ? null : signalFileName.trim();
    }

    public String getTabName() {
        return tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName == null ? null : tabName.trim();
    }

    public String getMd5Flag() {
        return md5Flag;
    }

    public void setMd5Flag(String md5Flag) {
        this.md5Flag = md5Flag == null ? null : md5Flag.trim();
    }

    public String getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(String useFlag) {
        this.useFlag = useFlag == null ? null : useFlag.trim();
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

    public String getFullFlag() {
        return fullFlag;
    }

    public void setFullFlag(String fullFlag) {
        this.fullFlag = fullFlag == null ? null : fullFlag.trim();
    }
}