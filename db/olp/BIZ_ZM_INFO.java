package com.bea.olp;

import java.math.BigDecimal;

public class BIZ_ZM_INFO {
    private String appNo;

    private String applyNo;

    private String companyName;

    private String occupation;

    private String haveCarFlag;

    private String haveFangFlag;

    private String authFinLast1mCnt;

    private String authFinLast3mCnt;

    private String authFinLast6mCnt;

    private String ovdOrderCnt6m;

    private String ovdOrderAmt6m;

    private String mobileFixedDays;

    private String adrStabilityDays;

    private String last6mAvgAssetTotal;

    private String totPayAmt6m;

    private String xfdcIndex;

    private String positiveBizCnt1y;

    private BigDecimal zmScore;

    private String inputDate;

    private String inputTime;

    public String getAppNo() {
        return appNo;
    }

    public void setAppNo(String appNo) {
        this.appNo = appNo == null ? null : appNo.trim();
    }

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo == null ? null : applyNo.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation == null ? null : occupation.trim();
    }

    public String getHaveCarFlag() {
        return haveCarFlag;
    }

    public void setHaveCarFlag(String haveCarFlag) {
        this.haveCarFlag = haveCarFlag == null ? null : haveCarFlag.trim();
    }

    public String getHaveFangFlag() {
        return haveFangFlag;
    }

    public void setHaveFangFlag(String haveFangFlag) {
        this.haveFangFlag = haveFangFlag == null ? null : haveFangFlag.trim();
    }

    public String getAuthFinLast1mCnt() {
        return authFinLast1mCnt;
    }

    public void setAuthFinLast1mCnt(String authFinLast1mCnt) {
        this.authFinLast1mCnt = authFinLast1mCnt == null ? null : authFinLast1mCnt.trim();
    }

    public String getAuthFinLast3mCnt() {
        return authFinLast3mCnt;
    }

    public void setAuthFinLast3mCnt(String authFinLast3mCnt) {
        this.authFinLast3mCnt = authFinLast3mCnt == null ? null : authFinLast3mCnt.trim();
    }

    public String getAuthFinLast6mCnt() {
        return authFinLast6mCnt;
    }

    public void setAuthFinLast6mCnt(String authFinLast6mCnt) {
        this.authFinLast6mCnt = authFinLast6mCnt == null ? null : authFinLast6mCnt.trim();
    }

    public String getOvdOrderCnt6m() {
        return ovdOrderCnt6m;
    }

    public void setOvdOrderCnt6m(String ovdOrderCnt6m) {
        this.ovdOrderCnt6m = ovdOrderCnt6m == null ? null : ovdOrderCnt6m.trim();
    }

    public String getOvdOrderAmt6m() {
        return ovdOrderAmt6m;
    }

    public void setOvdOrderAmt6m(String ovdOrderAmt6m) {
        this.ovdOrderAmt6m = ovdOrderAmt6m == null ? null : ovdOrderAmt6m.trim();
    }

    public String getMobileFixedDays() {
        return mobileFixedDays;
    }

    public void setMobileFixedDays(String mobileFixedDays) {
        this.mobileFixedDays = mobileFixedDays == null ? null : mobileFixedDays.trim();
    }

    public String getAdrStabilityDays() {
        return adrStabilityDays;
    }

    public void setAdrStabilityDays(String adrStabilityDays) {
        this.adrStabilityDays = adrStabilityDays == null ? null : adrStabilityDays.trim();
    }

    public String getLast6mAvgAssetTotal() {
        return last6mAvgAssetTotal;
    }

    public void setLast6mAvgAssetTotal(String last6mAvgAssetTotal) {
        this.last6mAvgAssetTotal = last6mAvgAssetTotal == null ? null : last6mAvgAssetTotal.trim();
    }

    public String getTotPayAmt6m() {
        return totPayAmt6m;
    }

    public void setTotPayAmt6m(String totPayAmt6m) {
        this.totPayAmt6m = totPayAmt6m == null ? null : totPayAmt6m.trim();
    }

    public String getXfdcIndex() {
        return xfdcIndex;
    }

    public void setXfdcIndex(String xfdcIndex) {
        this.xfdcIndex = xfdcIndex == null ? null : xfdcIndex.trim();
    }

    public String getPositiveBizCnt1y() {
        return positiveBizCnt1y;
    }

    public void setPositiveBizCnt1y(String positiveBizCnt1y) {
        this.positiveBizCnt1y = positiveBizCnt1y == null ? null : positiveBizCnt1y.trim();
    }

    public BigDecimal getZmScore() {
        return zmScore;
    }

    public void setZmScore(BigDecimal zmScore) {
        this.zmScore = zmScore;
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
}