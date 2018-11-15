package com.bea.olp;

import java.math.BigDecimal;

public class CFG_SMS_TEMPLATE {
    private String smsId;

    private String sendStartTime;

    private String sendEndTime;

    private BigDecimal sendNum;

    private String smsInfo;

    private String smsObj;

    private String smsChannel;

    private String smsStatus;

    private String remarks;

    private String bizOpId;

    private String bizOrgId;

    private String inputDate;

    private String inputTime;

    private String lastUpdateDate;

    private String lastUpdateTime;

    public String getSmsId() {
        return smsId;
    }

    public void setSmsId(String smsId) {
        this.smsId = smsId == null ? null : smsId.trim();
    }

    public String getSendStartTime() {
        return sendStartTime;
    }

    public void setSendStartTime(String sendStartTime) {
        this.sendStartTime = sendStartTime == null ? null : sendStartTime.trim();
    }

    public String getSendEndTime() {
        return sendEndTime;
    }

    public void setSendEndTime(String sendEndTime) {
        this.sendEndTime = sendEndTime == null ? null : sendEndTime.trim();
    }

    public BigDecimal getSendNum() {
        return sendNum;
    }

    public void setSendNum(BigDecimal sendNum) {
        this.sendNum = sendNum;
    }

    public String getSmsInfo() {
        return smsInfo;
    }

    public void setSmsInfo(String smsInfo) {
        this.smsInfo = smsInfo == null ? null : smsInfo.trim();
    }

    public String getSmsObj() {
        return smsObj;
    }

    public void setSmsObj(String smsObj) {
        this.smsObj = smsObj == null ? null : smsObj.trim();
    }

    public String getSmsChannel() {
        return smsChannel;
    }

    public void setSmsChannel(String smsChannel) {
        this.smsChannel = smsChannel == null ? null : smsChannel.trim();
    }

    public String getSmsStatus() {
        return smsStatus;
    }

    public void setSmsStatus(String smsStatus) {
        this.smsStatus = smsStatus == null ? null : smsStatus.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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