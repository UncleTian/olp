package com.bea.olp;

import java.math.BigDecimal;

public class BAT_XW_INTER_DEDU_TEMP {
    private String loanNo;

    private Short totalTerms;

    private Short termNo;

    private String deduDate;

    private BigDecimal oriRate;

    private String intDeduType;

    private BigDecimal intAmt;

    private BigDecimal intDeduAmt;

    private BigDecimal intAfterAmt;

    private BigDecimal deduRate;

    private String inputDate;

    private String inputTime;

    private String dataDate;

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo == null ? null : loanNo.trim();
    }

    public Short getTotalTerms() {
        return totalTerms;
    }

    public void setTotalTerms(Short totalTerms) {
        this.totalTerms = totalTerms;
    }

    public Short getTermNo() {
        return termNo;
    }

    public void setTermNo(Short termNo) {
        this.termNo = termNo;
    }

    public String getDeduDate() {
        return deduDate;
    }

    public void setDeduDate(String deduDate) {
        this.deduDate = deduDate == null ? null : deduDate.trim();
    }

    public BigDecimal getOriRate() {
        return oriRate;
    }

    public void setOriRate(BigDecimal oriRate) {
        this.oriRate = oriRate;
    }

    public String getIntDeduType() {
        return intDeduType;
    }

    public void setIntDeduType(String intDeduType) {
        this.intDeduType = intDeduType == null ? null : intDeduType.trim();
    }

    public BigDecimal getIntAmt() {
        return intAmt;
    }

    public void setIntAmt(BigDecimal intAmt) {
        this.intAmt = intAmt;
    }

    public BigDecimal getIntDeduAmt() {
        return intDeduAmt;
    }

    public void setIntDeduAmt(BigDecimal intDeduAmt) {
        this.intDeduAmt = intDeduAmt;
    }

    public BigDecimal getIntAfterAmt() {
        return intAfterAmt;
    }

    public void setIntAfterAmt(BigDecimal intAfterAmt) {
        this.intAfterAmt = intAfterAmt;
    }

    public BigDecimal getDeduRate() {
        return deduRate;
    }

    public void setDeduRate(BigDecimal deduRate) {
        this.deduRate = deduRate;
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