package com.bea.olp;

import java.math.BigDecimal;

public class BAT_XW_DS_ACCOUNTING_FLOW_HIS {
    private String loanNo;

    private String tdDate;

    private String currency;

    private String tdCode;

    private String tdDescribe;

    private String loanSign;

    private BigDecimal acctAmt;

    private String branchNo;

    private String prodNo;

    private String subject;

    private String id;

    private String inputDate;

    private String inputTime;

    private String dataDate;

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

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getTdCode() {
        return tdCode;
    }

    public void setTdCode(String tdCode) {
        this.tdCode = tdCode == null ? null : tdCode.trim();
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

    public BigDecimal getAcctAmt() {
        return acctAmt;
    }

    public void setAcctAmt(BigDecimal acctAmt) {
        this.acctAmt = acctAmt;
    }

    public String getBranchNo() {
        return branchNo;
    }

    public void setBranchNo(String branchNo) {
        this.branchNo = branchNo == null ? null : branchNo.trim();
    }

    public String getProdNo() {
        return prodNo;
    }

    public void setProdNo(String prodNo) {
        this.prodNo = prodNo == null ? null : prodNo.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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