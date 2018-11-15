package com.bea.olp;

import java.math.BigDecimal;

public class RPT_FIVE_CLASSIFY {
    private String seralNo;

    private String wfApprSts;

    private String classifyLevelNew;

    private String billNo;

    private String custName;

    private String certType;

    private String certCode;

    private String classifyLevel;

    private BigDecimal overdueDay;

    private BigDecimal loanBal;

    private BigDecimal loanAmt;

    private String contStatus;

    private String dataDate;

    public String getSeralNo() {
        return seralNo;
    }

    public void setSeralNo(String seralNo) {
        this.seralNo = seralNo == null ? null : seralNo.trim();
    }

    public String getWfApprSts() {
        return wfApprSts;
    }

    public void setWfApprSts(String wfApprSts) {
        this.wfApprSts = wfApprSts == null ? null : wfApprSts.trim();
    }

    public String getClassifyLevelNew() {
        return classifyLevelNew;
    }

    public void setClassifyLevelNew(String classifyLevelNew) {
        this.classifyLevelNew = classifyLevelNew == null ? null : classifyLevelNew.trim();
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType == null ? null : certType.trim();
    }

    public String getCertCode() {
        return certCode;
    }

    public void setCertCode(String certCode) {
        this.certCode = certCode == null ? null : certCode.trim();
    }

    public String getClassifyLevel() {
        return classifyLevel;
    }

    public void setClassifyLevel(String classifyLevel) {
        this.classifyLevel = classifyLevel == null ? null : classifyLevel.trim();
    }

    public BigDecimal getOverdueDay() {
        return overdueDay;
    }

    public void setOverdueDay(BigDecimal overdueDay) {
        this.overdueDay = overdueDay;
    }

    public BigDecimal getLoanBal() {
        return loanBal;
    }

    public void setLoanBal(BigDecimal loanBal) {
        this.loanBal = loanBal;
    }

    public BigDecimal getLoanAmt() {
        return loanAmt;
    }

    public void setLoanAmt(BigDecimal loanAmt) {
        this.loanAmt = loanAmt;
    }

    public String getContStatus() {
        return contStatus;
    }

    public void setContStatus(String contStatus) {
        this.contStatus = contStatus == null ? null : contStatus.trim();
    }

    public String getDataDate() {
        return dataDate;
    }

    public void setDataDate(String dataDate) {
        this.dataDate = dataDate == null ? null : dataDate.trim();
    }
}