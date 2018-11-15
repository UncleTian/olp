package com.bea.olp;

public class BAT_ANT_REPAY_INSTMNT_DT_HIS {
    private String contractNo;

    private String seqNo;

    private Short termNo;

    private String repayAmtType;

    private String repayDate;

    private Short currPrinBal;

    private Short currIntBal;

    private Short currOvdPrinPnltBal;

    private Short currOvdIntPnltBal;

    private Short repayAmt;

    private Short paidPrinAmt;

    private Short paidIntAmt;

    private Short paidOvdPrinPnltAmt;

    private Short paidOvdIntPnltAmt;

    private String inputDate;

    private String inputTime;

    private String dataDate;

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo == null ? null : seqNo.trim();
    }

    public Short getTermNo() {
        return termNo;
    }

    public void setTermNo(Short termNo) {
        this.termNo = termNo;
    }

    public String getRepayAmtType() {
        return repayAmtType;
    }

    public void setRepayAmtType(String repayAmtType) {
        this.repayAmtType = repayAmtType == null ? null : repayAmtType.trim();
    }

    public String getRepayDate() {
        return repayDate;
    }

    public void setRepayDate(String repayDate) {
        this.repayDate = repayDate == null ? null : repayDate.trim();
    }

    public Short getCurrPrinBal() {
        return currPrinBal;
    }

    public void setCurrPrinBal(Short currPrinBal) {
        this.currPrinBal = currPrinBal;
    }

    public Short getCurrIntBal() {
        return currIntBal;
    }

    public void setCurrIntBal(Short currIntBal) {
        this.currIntBal = currIntBal;
    }

    public Short getCurrOvdPrinPnltBal() {
        return currOvdPrinPnltBal;
    }

    public void setCurrOvdPrinPnltBal(Short currOvdPrinPnltBal) {
        this.currOvdPrinPnltBal = currOvdPrinPnltBal;
    }

    public Short getCurrOvdIntPnltBal() {
        return currOvdIntPnltBal;
    }

    public void setCurrOvdIntPnltBal(Short currOvdIntPnltBal) {
        this.currOvdIntPnltBal = currOvdIntPnltBal;
    }

    public Short getRepayAmt() {
        return repayAmt;
    }

    public void setRepayAmt(Short repayAmt) {
        this.repayAmt = repayAmt;
    }

    public Short getPaidPrinAmt() {
        return paidPrinAmt;
    }

    public void setPaidPrinAmt(Short paidPrinAmt) {
        this.paidPrinAmt = paidPrinAmt;
    }

    public Short getPaidIntAmt() {
        return paidIntAmt;
    }

    public void setPaidIntAmt(Short paidIntAmt) {
        this.paidIntAmt = paidIntAmt;
    }

    public Short getPaidOvdPrinPnltAmt() {
        return paidOvdPrinPnltAmt;
    }

    public void setPaidOvdPrinPnltAmt(Short paidOvdPrinPnltAmt) {
        this.paidOvdPrinPnltAmt = paidOvdPrinPnltAmt;
    }

    public Short getPaidOvdIntPnltAmt() {
        return paidOvdIntPnltAmt;
    }

    public void setPaidOvdIntPnltAmt(Short paidOvdIntPnltAmt) {
        this.paidOvdIntPnltAmt = paidOvdIntPnltAmt;
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