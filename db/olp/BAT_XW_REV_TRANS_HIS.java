package com.bea.olp;

import java.math.BigDecimal;

public class BAT_XW_REV_TRANS_HIS {
    private String loanNo;

    private String reversalReason;

    private String originalTdDate;

    private String reversalDate;

    private BigDecimal reversalAmt;

    private BigDecimal reversalPrin;

    private BigDecimal reversalInt;

    private BigDecimal reversalPnlt;

    private BigDecimal writeoffAmt;

    private String inputDate;

    private String inputTime;

    private String dataDate;

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo == null ? null : loanNo.trim();
    }

    public String getReversalReason() {
        return reversalReason;
    }

    public void setReversalReason(String reversalReason) {
        this.reversalReason = reversalReason == null ? null : reversalReason.trim();
    }

    public String getOriginalTdDate() {
        return originalTdDate;
    }

    public void setOriginalTdDate(String originalTdDate) {
        this.originalTdDate = originalTdDate == null ? null : originalTdDate.trim();
    }

    public String getReversalDate() {
        return reversalDate;
    }

    public void setReversalDate(String reversalDate) {
        this.reversalDate = reversalDate == null ? null : reversalDate.trim();
    }

    public BigDecimal getReversalAmt() {
        return reversalAmt;
    }

    public void setReversalAmt(BigDecimal reversalAmt) {
        this.reversalAmt = reversalAmt;
    }

    public BigDecimal getReversalPrin() {
        return reversalPrin;
    }

    public void setReversalPrin(BigDecimal reversalPrin) {
        this.reversalPrin = reversalPrin;
    }

    public BigDecimal getReversalInt() {
        return reversalInt;
    }

    public void setReversalInt(BigDecimal reversalInt) {
        this.reversalInt = reversalInt;
    }

    public BigDecimal getReversalPnlt() {
        return reversalPnlt;
    }

    public void setReversalPnlt(BigDecimal reversalPnlt) {
        this.reversalPnlt = reversalPnlt;
    }

    public BigDecimal getWriteoffAmt() {
        return writeoffAmt;
    }

    public void setWriteoffAmt(BigDecimal writeoffAmt) {
        this.writeoffAmt = writeoffAmt;
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