package com.bea.olp;

import java.math.BigDecimal;

public class SYS_FILE_INFO {
    private String fileNo;

    private String fileId;

    private String fileDesc;

    private String fileName;

    private String fileNameMapping;

    private String filePath;

    private BigDecimal fileSize;

    private String fileManageStatus;

    private String errorMsg;

    private String uploadTime;

    private String uploadOpId;

    private String uploadOrgId;

    private String importTime;

    private String importOpId;

    private String importOrgId;

    public String getFileNo() {
        return fileNo;
    }

    public void setFileNo(String fileNo) {
        this.fileNo = fileNo == null ? null : fileNo.trim();
    }

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

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFileNameMapping() {
        return fileNameMapping;
    }

    public void setFileNameMapping(String fileNameMapping) {
        this.fileNameMapping = fileNameMapping == null ? null : fileNameMapping.trim();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public BigDecimal getFileSize() {
        return fileSize;
    }

    public void setFileSize(BigDecimal fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileManageStatus() {
        return fileManageStatus;
    }

    public void setFileManageStatus(String fileManageStatus) {
        this.fileManageStatus = fileManageStatus == null ? null : fileManageStatus.trim();
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg == null ? null : errorMsg.trim();
    }

    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime == null ? null : uploadTime.trim();
    }

    public String getUploadOpId() {
        return uploadOpId;
    }

    public void setUploadOpId(String uploadOpId) {
        this.uploadOpId = uploadOpId == null ? null : uploadOpId.trim();
    }

    public String getUploadOrgId() {
        return uploadOrgId;
    }

    public void setUploadOrgId(String uploadOrgId) {
        this.uploadOrgId = uploadOrgId == null ? null : uploadOrgId.trim();
    }

    public String getImportTime() {
        return importTime;
    }

    public void setImportTime(String importTime) {
        this.importTime = importTime == null ? null : importTime.trim();
    }

    public String getImportOpId() {
        return importOpId;
    }

    public void setImportOpId(String importOpId) {
        this.importOpId = importOpId == null ? null : importOpId.trim();
    }

    public String getImportOrgId() {
        return importOrgId;
    }

    public void setImportOrgId(String importOrgId) {
        this.importOrgId = importOrgId == null ? null : importOrgId.trim();
    }
}