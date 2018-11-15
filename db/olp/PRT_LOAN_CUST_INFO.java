package com.bea.olp;

import java.math.BigDecimal;

public class PRT_LOAN_CUST_INFO {
    private String tpObjId;

    private String custId;

    private String custName;

    private String certType;

    private String certCode;

    private String loanNo;

    private String loanType;

    private String prdName;

    private String coPlatform;

    private BigDecimal crdAmt;

    private BigDecimal loanAmt;

    private BigDecimal loanBal;

    private BigDecimal loanInte;

    private BigDecimal loanNum;

    private String bizOrgId;

    private String channelType;

    private String dataDate;

    private String inputDate;

    private String inputTime;

    private String lastUpdateDate;

    private String lastUpdateTime;

    private String bizOpId;

    public String getTpObjId() {
        return tpObjId;
    }

    public void setTpObjId(String tpObjId) {
        this.tpObjId = tpObjId == null ? null : tpObjId.trim();
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId == null ? null : custId.trim();
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

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo == null ? null : loanNo.trim();
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType == null ? null : loanType.trim();
    }

    public String getPrdName() {
        return prdName;
    }

    public void setPrdName(String prdName) {
        this.prdName = prdName == null ? null : prdName.trim();
    }

    public String getCoPlatform() {
        return coPlatform;
    }

    public void setCoPlatform(String coPlatform) {
        this.coPlatform = coPlatform == null ? null : coPlatform.trim();
    }

    public BigDecimal getCrdAmt() {
        return crdAmt;
    }

    public void setCrdAmt(BigDecimal crdAmt) {
        this.crdAmt = crdAmt;
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

    public String getBizOrgId() {
        return bizOrgId;
    }

    public void setBizOrgId(String bizOrgId) {
        this.bizOrgId = bizOrgId == null ? null : bizOrgId.trim();
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType == null ? null : channelType.trim();
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

    public String getBizOpId() {
        return bizOpId;
    }

    public void setBizOpId(String bizOpId) {
        this.bizOpId = bizOpId == null ? null : bizOpId.trim();
    }
}