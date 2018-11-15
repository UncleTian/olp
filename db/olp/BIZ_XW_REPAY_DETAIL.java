package com.bea.olp;

import java.math.BigDecimal;

public class BIZ_XW_REPAY_DETAIL {
    private String loanNo;

    private String tdDate;

    private BigDecimal tdPrin;

    private BigDecimal tdInt;

    private BigDecimal tdAmt;

    private BigDecimal tdPnlt;

    private String acctDate;

    private BigDecimal acctAmt;

    private Short termNo;

    private String autoRepaySign;

    private String applyNo;

    private String inputDate;

    private String inputTime;

    private String dataDate;

    private String lastUpdateDate;

    private String lastUpdateTime;

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo == null ? null : loanNo.trim();
    }

    public String getTdDate() {
        return tdDate;
    }

    public void setTdDate(String tdDate) {
        this.tdDate = tdDate == null ? null : tdDate.trim();
    }

    public BigDecimal getTdPrin() {
        return tdPrin;
    }

    public void setTdPrin(BigDecimal tdPrin) {
        this.tdPrin = tdPrin;
    }

    public BigDecimal getTdInt() {
        return tdInt;
    }

    public void setTdInt(BigDecimal tdInt) {
        this.tdInt = tdInt;
    }

    public BigDecimal getTdAmt() {
        return tdAmt;
    }

    public void setTdAmt(BigDecimal tdAmt) {
        this.tdAmt = tdAmt;
    }

    public BigDecimal getTdPnlt() {
        return tdPnlt;
    }

    public void setTdPnlt(BigDecimal tdPnlt) {
        this.tdPnlt = tdPnlt;
    }

    public String getAcctDate() {
        return acctDate;
    }

    public void setAcctDate(String acctDate) {
        this.acctDate = acctDate == null ? null : acctDate.trim();
    }

    public BigDecimal getAcctAmt() {
        return acctAmt;
    }

    public void setAcctAmt(BigDecimal acctAmt) {
        this.acctAmt = acctAmt;
    }

    public Short getTermNo() {
        return termNo;
    }

    public void setTermNo(Short termNo) {
        this.termNo = termNo;
    }

    public String getAutoRepaySign() {
        return autoRepaySign;
    }

    public void setAutoRepaySign(String autoRepaySign) {
        this.autoRepaySign = autoRepaySign == null ? null : autoRepaySign.trim();
    }

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo == null ? null : applyNo.trim();
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