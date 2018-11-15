package com.bea.olp;

import java.math.BigDecimal;

public class PRT_LOAN_TYPE_INFO {
    private String loanType;

    private String tpObjId;

    private String bizOpId;

    private String bizOrgId;

    private BigDecimal crdAmt;

    private String dataDate;

    private String inputDate;

    private String inputTime;

    private String lastUpdateDate;

    private String lastUpdateTime;

    private BigDecimal loanAmt;

    private BigDecimal loanBal;

    private BigDecimal loanInte;

    private BigDecimal loanNum;

    private String custName;

    private String certCode;

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType == null ? null : loanType.trim();
    }

    public String getTpObjId() {
        return tpObjId;
    }

    public void setTpObjId(String tpObjId) {
        this.tpObjId = tpObjId == null ? null : tpObjId.trim();
    }

    public String getBizOpId() {
        return bizOpId;
    }

    public void setBizOpId(String bizOpId) {
        this.bizOpId = bizOpId == null ? null : bizOpId.trim();
    }

    public String getBizOrgId() {
        return bizOrgId;
    }

    public void setBizOrgId(String bizOrgId) {
        this.bizOrgId = bizOrgId == null ? null : bizOrgId.trim();
    }

    public BigDecimal getCrdAmt() {
        return crdAmt;
    }

    public void setCrdAmt(BigDecimal crdAmt) {
        this.crdAmt = crdAmt;
    }

    public String getDataDate() {
        return dataDate;
    }

    public void setDataDate(String dataDate) {
        this.dataDate = dataDate == null ? null : dataDate.trim();
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

    public BigDecimal getLoanAmt() {
        return loanAmt;
    }

    public void setLoanAmt(BigDecimal loanAmt) {
        this.loanAmt = loanAmt;
    }

    public BigDecimal getLoanBal() {
        return loanBal;
    }

    public void setLoanBal(BigDecimal loanBal) {
        this.loanBal = loanBal;
    }

    public BigDecimal getLoanInte() {
        return loanInte;
    }

    public void setLoanInte(BigDecimal loanInte) {
        this.loanInte = loanInte;
    }

    public BigDecimal getLoanNum() {
        return loanNum;
    }

    public void setLoanNum(BigDecimal loanNum) {
        this.loanNum = loanNum;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getCertCode() {
        return certCode;
    }

    public void setCertCode(String certCode) {
        this.certCode = certCode == null ? null : certCode.trim();
    }
}