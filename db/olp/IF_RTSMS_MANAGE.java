package com.bea.olp;

import java.math.BigDecimal;

public class IF_RTSMS_MANAGE extends IF_RTSMS_MANAGEKey {
    private String custIdCore;

    private String custName;

    private String cusAccType;

    private String cusAccNo;

    private String smsOrgNo;

    private String smsOrgName;

    private String smsChannel;

    private String smsObjAddr;

    private String fromSys;

    private String saveWay;

    private String smsInfo;

    private BigDecimal sendNum;

    private String sendStrTime;

    private String sendEndTime;

    private String smsReturnNo;

    private String state;

    public String getCustIdCore() {
        return custIdCore;
    }

    public void setCustIdCore(String custIdCore) {
        this.custIdCore = custIdCore == null ? null : custIdCore.trim();
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getCusAccType() {
        return cusAccType;
    }

    public void setCusAccType(String cusAccType) {
        this.cusAccType = cusAccType == null ? null : cusAccType.trim();
    }

    public String getCusAccNo() {
        return cusAccNo;
    }

    public void setCusAccNo(String cusAccNo) {
        this.cusAccNo = cusAccNo == null ? null : cusAccNo.trim();
    }

    public String getSmsOrgNo() {
        return smsOrgNo;
    }

    public void setSmsOrgNo(String smsOrgNo) {
        this.smsOrgNo = smsOrgNo == null ? null : smsOrgNo.trim();
    }

    public String getSmsOrgName() {
        return smsOrgName;
    }

    public void setSmsOrgName(String smsOrgName) {
        this.smsOrgName = smsOrgName == null ? null : smsOrgName.trim();
    }

    public String getSmsChannel() {
        return smsChannel;
    }

    public void setSmsChannel(String smsChannel) {
        this.smsChannel = smsChannel == null ? null : smsChannel.trim();
    }

    public String getSmsObjAddr() {
        return smsObjAddr;
    }

    public void setSmsObjAddr(String smsObjAddr) {
        this.smsObjAddr = smsObjAddr == null ? null : smsObjAddr.trim();
    }

    public String getFromSys() {
        return fromSys;
    }

    public void setFromSys(String fromSys) {
        this.fromSys = fromSys == null ? null : fromSys.trim();
    }

    public String getSaveWay() {
        return saveWay;
    }

    public void setSaveWay(String saveWay) {
        this.saveWay = saveWay == null ? null : saveWay.trim();
    }

    public String getSmsInfo() {
        return smsInfo;
    }

    public void setSmsInfo(String smsInfo) {
        this.smsInfo = smsInfo == null ? null : smsInfo.trim();
    }

    public BigDecimal getSendNum() {
        return sendNum;
    }

    public void setSendNum(BigDecimal sendNum) {
        this.sendNum = sendNum;
    }

    public String getSendStrTime() {
        return sendStrTime;
    }

    public void setSendStrTime(String sendStrTime) {
        this.sendStrTime = sendStrTime == null ? null : sendStrTime.trim();
    }

    public String getSendEndTime() {
        return sendEndTime;
    }

    public void setSendEndTime(String sendEndTime) {
        this.sendEndTime = sendEndTime == null ? null : sendEndTime.trim();
    }

    public String getSmsReturnNo() {
        return smsReturnNo;
    }

    public void setSmsReturnNo(String smsReturnNo) {
        this.smsReturnNo = smsReturnNo == null ? null : smsReturnNo.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}