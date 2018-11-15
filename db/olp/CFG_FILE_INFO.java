package com.bea.olp;

import java.math.BigDecimal;

public class CFG_FILE_INFO {
    private String fileId;

    private String fileDesc;

    private BigDecimal fileSize;

    private BigDecimal dataMaxNum;

    private String fileType;

    private String filePath;

    private String dataManageType;

    private String fileManageType;

    private String useFlag;

    private String bizOpId;

    private String bizOrgId;

    private String inputTime;

    private String inputDate;

    private String lastUpdateTime;

    private String lastUpdateDate;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }

    public String getFileDesc() {
        return fileDesc;
    }

    public void setFileDesc(String fileDesc) {
        this.fileDesc = fileDesc == null ? null : fileDesc.trim();
    }

    public BigDecimal getFileSize() {
        return fileSize;
    }

    public void setFileSize(BigDecimal fileSize) {
        this.fileSize = fileSize;
    }

    public BigDecimal getDataMaxNum() {
        return dataMaxNum;
    }

    public void setDataMaxNum(BigDecimal dataMaxNum) {
        this.dataMaxNum = dataMaxNum;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public String getDataManageType() {
        return dataManageType;
    }

    public void setDataManageType(String dataManageType) {
        this.dataManageType = dataManageType == null ? null : dataManageType.trim();
    }

    public String getFileManageType() {
        return fileManageType;
    }

    public void setFileManageType(String fileManageType) {
        this.fileManageType = fileManageType == null ? null : fileManageType.trim();
    }

    public String getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(String useFlag) {
        this.useFlag = useFlag == null ? null : useFlag.trim();
    }

    public String getBizOpId() {
        return bizOpId;
    }

    public void setBizOpId(String bizOpId) {
        this.bizOpId = bizOpId == null ? null : bizOpId.trim();
    }

    public String getBizOrgId() {
        return bizOrgId;
    }

    public void setBizOrgId(String bizOrgId) {
        this.bizOrgId = bizOrgId == null ? null : bizOrgId.trim();
    }

    public String getInputTime() {
        return inputTime;
    }

    public void setInputTime(String inputTime) {
        this.inputTime = inputTime == null ? null : inputTime.trim();
    }

    public String getInputDate() {
        return inputDate;
    }

    public void setInputDate(String inputDate) {
        this.inputDate = inputDate == null ? null : inputDate.trim();
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime == null ? null : lastUpdateTime.trim();
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate == null ? null : lastUpdateDate.trim();
    }
}