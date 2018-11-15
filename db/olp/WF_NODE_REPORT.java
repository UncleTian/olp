package com.bea.olp;

public class WF_NODE_REPORT extends WF_NODE_REPORTKey {
    private String inBatchNo;

    private String inBatchTime;

    private String outBatchNo;

    private String outBatchTime;

    private String wfName;

    private String nodeSign;

    private String nodeName;

    private String nodeStartTime;

    private String nodeEndTime;

    private String nodeStatus;

    private String currentNodeUser;

    private String currentNodeProcessors;

    private String batchStatus;

    private String lastUpdOprId;

    private String lastUpdPgmId;

    private String lastUpdTime;

    public String getInBatchNo() {
        return inBatchNo;
    }

    public void setInBatchNo(String inBatchNo) {
        this.inBatchNo = inBatchNo == null ? null : inBatchNo.trim();
    }

    public String getInBatchTime() {
        return inBatchTime;
    }

    public void setInBatchTime(String inBatchTime) {
        this.inBatchTime = inBatchTime == null ? null : inBatchTime.trim();
    }

    public String getOutBatchNo() {
        return outBatchNo;
    }

    public void setOutBatchNo(String outBatchNo) {
        this.outBatchNo = outBatchNo == null ? null : outBatchNo.trim();
    }

    public String getOutBatchTime() {
        return outBatchTime;
    }

    public void setOutBatchTime(String outBatchTime) {
        this.outBatchTime = outBatchTime == null ? null : outBatchTime.trim();
    }

    public String getWfName() {
        return wfName;
    }

    public void setWfName(String wfName) {
        this.wfName = wfName == null ? null : wfName.trim();
    }

    public String getNodeSign() {
        return nodeSign;
    }

    public void setNodeSign(String nodeSign) {
        this.nodeSign = nodeSign == null ? null : nodeSign.trim();
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName == null ? null : nodeName.trim();
    }

    public String getNodeStartTime() {
        return nodeStartTime;
    }

    public void setNodeStartTime(String nodeStartTime) {
        this.nodeStartTime = nodeStartTime == null ? null : nodeStartTime.trim();
    }

    public String getNodeEndTime() {
        return nodeEndTime;
    }

    public void setNodeEndTime(String nodeEndTime) {
        this.nodeEndTime = nodeEndTime == null ? null : nodeEndTime.trim();
    }

    public String getNodeStatus() {
        return nodeStatus;
    }

    public void setNodeStatus(String nodeStatus) {
        this.nodeStatus = nodeStatus == null ? null : nodeStatus.trim();
    }

    public String getCurrentNodeUser() {
        return currentNodeUser;
    }

    public void setCurrentNodeUser(String currentNodeUser) {
        this.currentNodeUser = currentNodeUser == null ? null : currentNodeUser.trim();
    }

    public String getCurrentNodeProcessors() {
        return currentNodeProcessors;
    }

    public void setCurrentNodeProcessors(String currentNodeProcessors) {
        this.currentNodeProcessors = currentNodeProcessors == null ? null : currentNodeProcessors.trim();
    }

    public String getBatchStatus() {
        return batchStatus;
    }

    public void setBatchStatus(String batchStatus) {
        this.batchStatus = batchStatus == null ? null : batchStatus.trim();
    }

    public String getLastUpdOprId() {
        return lastUpdOprId;
    }

    public void setLastUpdOprId(String lastUpdOprId) {
        this.lastUpdOprId = lastUpdOprId == null ? null : lastUpdOprId.trim();
    }

    public String getLastUpdPgmId() {
        return lastUpdPgmId;
    }

    public void setLastUpdPgmId(String lastUpdPgmId) {
        this.lastUpdPgmId = lastUpdPgmId == null ? null : lastUpdPgmId.trim();
    }

    public String getLastUpdTime() {
        return lastUpdTime;
    }

    public void setLastUpdTime(String lastUpdTime) {
        this.lastUpdTime = lastUpdTime == null ? null : lastUpdTime.trim();
    }
}