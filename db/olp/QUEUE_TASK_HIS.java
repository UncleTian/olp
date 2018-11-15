package com.bea.olp;

import java.math.BigDecimal;

public class QUEUE_TASK_HIS {
    private String appNo;

    private String coPlatform;

    private String prdCode;

    private String channelType;

    private String prdType;

    private String appType;

    private String flowType;

    private String inType;

    private String queueStatus;

    private String curNodeId;

    private String errorCode;

    private String errorMsg;

    private String evalTime;

    private String executeTime;

    private BigDecimal hangTimes;

    private String inTime;

    private String outTime;

    private String lastUpdateTime;

    public String getAppNo() {
        return appNo;
    }

    public void setAppNo(String appNo) {
        this.appNo = appNo == null ? null : appNo.trim();
    }

    public String getCoPlatform() {
        return coPlatform;
    }

    public void setCoPlatform(String coPlatform) {
        this.coPlatform = coPlatform == null ? null : coPlatform.trim();
    }

    public String getPrdCode() {
        return prdCode;
    }

    public void setPrdCode(String prdCode) {
        this.prdCode = prdCode == null ? null : prdCode.trim();
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType == null ? null : channelType.trim();
    }

    public String getPrdType() {
        return prdType;
    }

    public void setPrdType(String prdType) {
        this.prdType = prdType == null ? null : prdType.trim();
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType == null ? null : appType.trim();
    }

    public String getFlowType() {
        return flowType;
    }

    public void setFlowType(String flowType) {
        this.flowType = flowType == null ? null : flowType.trim();
    }

    public String getInType() {
        return inType;
    }

    public void setInType(String inType) {
        this.inType = inType == null ? null : inType.trim();
    }

    public String getQueueStatus() {
        return queueStatus;
    }

    public void setQueueStatus(String queueStatus) {
        this.queueStatus = queueStatus == null ? null : queueStatus.trim();
    }

    public String getCurNodeId() {
        return curNodeId;
    }

    public void setCurNodeId(String curNodeId) {
        this.curNodeId = curNodeId == null ? null : curNodeId.trim();
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode == null ? null : errorCode.trim();
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg == null ? null : errorMsg.trim();
    }

    public String getEvalTime() {
        return evalTime;
    }

    public void setEvalTime(String evalTime) {
        this.evalTime = evalTime == null ? null : evalTime.trim();
    }

    public String getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(String executeTime) {
        this.executeTime = executeTime == null ? null : executeTime.trim();
    }

    public BigDecimal getHangTimes() {
        return hangTimes;
    }

    public void setHangTimes(BigDecimal hangTimes) {
        this.hangTimes = hangTimes;
    }

    public String getInTime() {
        return inTime;
    }

    public void setInTime(String inTime) {
        this.inTime = inTime == null ? null : inTime.trim();
    }

    public String getOutTime() {
        return outTime;
    }

    public void setOutTime(String outTime) {
        this.outTime = outTime == null ? null : outTime.trim();
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime == null ? null : lastUpdateTime.trim();
    }
}