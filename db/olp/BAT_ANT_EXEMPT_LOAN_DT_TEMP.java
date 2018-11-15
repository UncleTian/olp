package com.bea.olp;

public class BAT_ANT_EXEMPT_LOAN_DT_TEMP {
    private String contractNo;

    private String seqNo;

    private String exemptDate;

    private Short currIntBal;

    private Short currOvdIntBal;

    private Short currOvdPrinPnltBal;

    private Short currOvdIntPnltBal;

    private Short exemptAmt;

    private Short exemptIntAmt;

    private Short exemptOvdIntAmt;

    private Short exemptOvdPrinPnltAmt;

    private Short exemptOvdIntPnltAmt;

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

    public String getExemptDate() {
        return exemptDate;
    }

    public void setExemptDate(String exemptDate) {
        this.exemptDate = exemptDate == null ? null : exemptDate.trim();
    }

    public Short getCurrIntBal() {
        return currIntBal;
    }

    public void setCurrIntBal(Short currIntBal) {
        this.currIntBal = currIntBal;
    }

    public Short getCurrOvdIntBal() {
        return currOvdIntBal;
    }

    public void setCurrOvdIntBal(Short currOvdIntBal) {
        this.currOvdIntBal = currOvdIntBal;
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

    public Short getExemptAmt() {
        return exemptAmt;
    }

    public void setExemptAmt(Short exemptAmt) {
        this.exemptAmt = exemptAmt;
    }

    public Short getExemptIntAmt() {
        return exemptIntAmt;
    }

    public void setExemptIntAmt(Short exemptIntAmt) {
        this.exemptIntAmt = exemptIntAmt;
    }

    public Short getExemptOvdIntAmt() {
        return exemptOvdIntAmt;
    }

    public void setExemptOvdIntAmt(Short exemptOvdIntAmt) {
        this.exemptOvdIntAmt = exemptOvdIntAmt;
    }

    public Short getExemptOvdPrinPnltAmt() {
        return exemptOvdPrinPnltAmt;
    }

    public void setExemptOvdPrinPnltAmt(Short exemptOvdPrinPnltAmt) {
        this.exemptOvdPrinPnltAmt = exemptOvdPrinPnltAmt;
    }

    public Short getExemptOvdIntPnltAmt() {
        return exemptOvdIntPnltAmt;
    }

    public void setExemptOvdIntPnltAmt(Short exemptOvdIntPnltAmt) {
        this.exemptOvdIntPnltAmt = exemptOvdIntPnltAmt;
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