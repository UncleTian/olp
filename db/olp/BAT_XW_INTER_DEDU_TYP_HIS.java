package com.bea.olp;

import java.math.BigDecimal;

public class BAT_XW_INTER_DEDU_TYP_HIS {
    private String loanNo;

    private String prodNo;

    private String prodName;

    private BigDecimal loanAmt;

    private BigDecimal oriRate;

    private String intDeduType;

    private BigDecimal intDeduRate;

    private String deduStartDate;

    private String deduEndDate;

    private BigDecimal deduInt;

    private String inputDate;

    private String inputTime;

    private String dataDate;

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo == null ? null : loanNo.trim();
    }

    public String getProdNo() {
        return prodNo;
    }

    public void setProdNo(String prodNo) {
        this.prodNo = prodNo == null ? null : prodNo.trim();
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName == null ? null : prodName.trim();
    }

    public BigDecimal getLoanAmt() {
        return loanAmt;
    }

    public void setLoanAmt(BigDecimal loanAmt) {
        this.loanAmt = loanAmt;
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

    public BigDecimal getIntDeduRate() {
        return intDeduRate;
    }

    public void setIntDeduRate(BigDecimal intDeduRate) {
        this.intDeduRate = intDeduRate;
    }

    public String getDeduStartDate() {
        return deduStartDate;
    }

    public void setDeduStartDate(String deduStartDate) {
        this.deduStartDate = deduStartDate == null ? null : deduStartDate.trim();
    }

    public String getDeduEndDate() {
        return deduEndDate;
    }

    public void setDeduEndDate(String deduEndDate) {
        this.deduEndDate = deduEndDate == null ? null : deduEndDate.trim();
    }

    public BigDecimal getDeduInt() {
        return deduInt;
    }

    public void setDeduInt(BigDecimal deduInt) {
        this.deduInt = deduInt;
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