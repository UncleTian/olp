package com.bea.olp;

import java.math.BigDecimal;

public class BAT_JD_CUSCREDIT_HIS {
    private String busiDate;

    private String custNo;

    private String proNo;

    private String limitNo;

    private String currency;

    private String circuSign;

    private String startDate;

    private String endDate;

    private BigDecimal creditLimit;

    private Short creditTime;

    private BigDecimal unmovedLimit;

    private String isTempoLimit;

    private String creditStatus;

    private String inputDate;

    private String inputTime;

    private String dataDate;

    public String getBusiDate() {
        return busiDate;
    }

    public void setBusiDate(String busiDate) {
        this.busiDate = busiDate == null ? null : busiDate.trim();
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo == null ? null : custNo.trim();
    }

    public String getProNo() {
        return proNo;
    }

    public void setProNo(String proNo) {
        this.proNo = proNo == null ? null : proNo.trim();
    }

    public String getLimitNo() {
        return limitNo;
    }

    public void setLimitNo(String limitNo) {
        this.limitNo = limitNo == null ? null : limitNo.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getCircuSign() {
        return circuSign;
    }

    public void setCircuSign(String circuSign) {
        this.circuSign = circuSign == null ? null : circuSign.trim();
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate == null ? null : startDate.trim();
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate == null ? null : endDate.trim();
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Short getCreditTime() {
        return creditTime;
    }

    public void setCreditTime(Short creditTime) {
        this.creditTime = creditTime;
    }

    public BigDecimal getUnmovedLimit() {
        return unmovedLimit;
    }

    public void setUnmovedLimit(BigDecimal unmovedLimit) {
        this.unmovedLimit = unmovedLimit;
    }

    public String getIsTempoLimit() {
        return isTempoLimit;
    }

    public void setIsTempoLimit(String isTempoLimit) {
        this.isTempoLimit = isTempoLimit == null ? null : isTempoLimit.trim();
    }

    public String getCreditStatus() {
        return creditStatus;
    }

    public void setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus == null ? null : creditStatus.trim();
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

    public String getDataDate() {
        return dataDate;
    }

    public void setDataDate(String dataDate) {
        this.dataDate = dataDate == null ? null : dataDate.trim();
    }
}