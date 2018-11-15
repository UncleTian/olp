package com.bea.olp;

import java.math.BigDecimal;

public class BAT_SOP_DKXX_HIS {
    private String dtDate;

    private String billNo;

    private String loanStatus;

    private BigDecimal overdueAmt;

    private BigDecimal outstdIntst;

    private BigDecimal innerIntst;

    private BigDecimal outerIntst;

    private BigDecimal overdueDay;

    private String inputDate;

    private String inputTime;

    private String lastUpdateDate;

    private String lastUpdateTime;

    public String getDtDate() {
        return dtDate;
    }

    public void setDtDate(String dtDate) {
        this.dtDate = dtDate == null ? null : dtDate.trim();
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus == null ? null : loanStatus.trim();
    }

    public BigDecimal getOverdueAmt() {
        return overdueAmt;
    }

    public void setOverdueAmt(BigDecimal overdueAmt) {
        this.overdueAmt = overdueAmt;
    }

    public BigDecimal getOutstdIntst() {
        return outstdIntst;
    }

    public void setOutstdIntst(BigDecimal outstdIntst) {
        this.outstdIntst = outstdIntst;
    }

    public BigDecimal getInnerIntst() {
        return innerIntst;
    }

    public void setInnerIntst(BigDecimal innerIntst) {
        this.innerIntst = innerIntst;
    }

    public BigDecimal getOuterIntst() {
        return outerIntst;
    }

    public void setOuterIntst(BigDecimal outerIntst) {
        this.outerIntst = outerIntst;
    }

    public BigDecimal getOverdueDay() {
        return overdueDay;
    }

    public void setOverdueDay(BigDecimal overdueDay) {
        this.overdueDay = overdueDay;
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