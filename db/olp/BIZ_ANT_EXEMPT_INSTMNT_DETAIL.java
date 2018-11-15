package com.bea.olp;

public class BIZ_ANT_EXEMPT_INSTMNT_DETAIL {
    private String contractNo;

    private String seqNo;

    private Short termNo;

    private String settleDate;

    private Short currIntBal;

    private Short currOvdPrinPnltBal;

    private Short currOvdIntPnltBal;

    private Short exemptAmt;

    private Short exemptIntAmt;

    private Short exemptOvdPrinPnltAmt;

    private Short exemptOvdIntPnltAmt;

    private String inputDate;

    private String inputTime;

    private String lastUpdateDate;

    private String lastUpdateTime;

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

    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate == null ? null : settleDate.trim();
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

    public String getDataDate() {
        return dataDate;
    }

    public void setDataDate(String dataDate) {
        this.dataDate = dataDate == null ? null : dataDate.trim();
    }
}