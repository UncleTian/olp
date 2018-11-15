package com.bea.olp;

public class BAT_XWFILE_CFG {
    private String fileId;

    private String fileName;

    private String dataFileName;

    private String signalFileName;

    private String checkFileNo;

    private String checkNumFlag;

    private String checkFormatFlag;

    private String useFlag;

    private String inputDate;

    private String taskNo;

    private String eventNo;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
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

    public String getCheckFileNo() {
        return checkFileNo;
    }

    public void setCheckFileNo(String checkFileNo) {
        this.checkFileNo = checkFileNo == null ? null : checkFileNo.trim();
    }

    public String getCheckNumFlag() {
        return checkNumFlag;
    }

    public void setCheckNumFlag(String checkNumFlag) {
        this.checkNumFlag = checkNumFlag == null ? null : checkNumFlag.trim();
    }

    public String getCheckFormatFlag() {
        return checkFormatFlag;
    }

    public void setCheckFormatFlag(String checkFormatFlag) {
        this.checkFormatFlag = checkFormatFlag == null ? null : checkFormatFlag.trim();
    }

    public String getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(String useFlag) {
        this.useFlag = useFlag == null ? null : useFlag.trim();
    }

    public String getInputDate() {
        return inputDate;
    }

    public void setInputDate(String inputDate) {
        this.inputDate = inputDate == null ? null : inputDate.trim();
    }

    public String getTaskNo() {
        return taskNo;
    }

    public void setTaskNo(String taskNo) {
        this.taskNo = taskNo == null ? null : taskNo.trim();
    }

    public String getEventNo() {
        return eventNo;
    }

    public void setEventNo(String eventNo) {
        this.eventNo = eventNo == null ? null : eventNo.trim();
    }
}