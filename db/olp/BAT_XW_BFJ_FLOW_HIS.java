package com.bea.olp;

import java.math.BigDecimal;

public class BAT_XW_BFJ_FLOW_HIS {
    private String provisionsAcct;

    private String tdDate;

    private String subject;

    private BigDecimal tdAmt;

    private String tdDescribe;

    private String loanSign;

    private String loanNo;

    private String applyNo;

    private String fluTran;

    private String inputDate;

    private String inputTime;

    private String dataDate;

    public String getProvisionsAcct() {
        return provisionsAcct;
    }

    public void setProvisionsAcct(String provisionsAcct) {
        this.provisionsAcct = provisionsAcct == null ? null : provisionsAcct.trim();
    }

    public String getTdDate() {
        return tdDate;
    }

    public void setTdDate(String tdDate) {
        this.tdDate = tdDate == null ? null : tdDate.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public BigDecimal getTdAmt() {
        return tdAmt;
    }

    public void setTdAmt(BigDecimal tdAmt) {
        this.tdAmt = tdAmt;
    }

    public String getTdDescribe() {
        return tdDescribe;
    }

    public void setTdDescribe(String tdDescribe) {
        this.tdDescribe = tdDescribe == null ? null : tdDescribe.trim();
    }

    public String getLoanSign() {
        return loanSign;
    }

    public void setLoanSign(String loanSign) {
        this.loanSign = loanSign == null ? null : loanSign.trim();
    }

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo == null ? null : loanNo.trim();
    }

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo == null ? null : applyNo.trim();
    }

    public String getFluTran() {
        return fluTran;
    }

    public void setFluTran(String fluTran) {
        this.fluTran = fluTran == null ? null : fluTran.trim();
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