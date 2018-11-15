package com.bea.olp;

import java.math.BigDecimal;

public class BIZ_JD_REPAY_PLAN {
    private String busiDate;

    private String contractNo;

    private String proNo;

    private String limitNo;

    private String loanNo;

    private String stagSigNo;

    private Short termNo;

    private String princDueDate;

    private BigDecimal princAmt;

    private String intDueDate;

    private BigDecimal intAmt;

    private Short termTotal;

    private BigDecimal odIntAmt;

    private BigDecimal installRate;

    private String inputDate;

    private String inputTime;

    private String lastUpdateDate;

    private String lastUpdateTime;

    private String dataDate;

    public String getBusiDate() {
        return busiDate;
    }

    public void setBusiDate(String busiDate) {
        this.busiDate = busiDate == null ? null : busiDate.trim();
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    public String getProNo() {
        return proNo;
    }

    public void setProNo(String proNo) {
        this.proNo = proNo == null ? null : proNo.trim();
    }

    public String getLimitNo() {
        return limitNo;
    }

    public void setLimitNo(String limitNo) {
        this.limitNo = limitNo == null ? null : limitNo.trim();
    }

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo == null ? null : loanNo.trim();
    }

    public String getStagSigNo() {
        return stagSigNo;
    }

    public void setStagSigNo(String stagSigNo) {
        this.stagSigNo = stagSigNo == null ? null : stagSigNo.trim();
    }

    public Short getTermNo() {
        return termNo;
    }

    public void setTermNo(Short termNo) {
        this.termNo = termNo;
    }

    public String getPrincDueDate() {
        return princDueDate;
    }

    public void setPrincDueDate(String princDueDate) {
        this.princDueDate = princDueDate == null ? null : princDueDate.trim();
    }

    public BigDecimal getPrincAmt() {
        return princAmt;
    }

    public void setPrincAmt(BigDecimal princAmt) {
        this.princAmt = princAmt;
    }

    public String getIntDueDate() {
        return intDueDate;
    }

    public void setIntDueDate(String intDueDate) {
        this.intDueDate = intDueDate == null ? null : intDueDate.trim();
    }

    public BigDecimal getIntAmt() {
        return intAmt;
    }

    public void setIntAmt(BigDecimal intAmt) {
        this.intAmt = intAmt;
    }

    public Short getTermTotal() {
        return termTotal;
    }

    public void setTermTotal(Short termTotal) {
        this.termTotal = termTotal;
    }

    public BigDecimal getOdIntAmt() {
        return odIntAmt;
    }

    public void setOdIntAmt(BigDecimal odIntAmt) {
        this.odIntAmt = odIntAmt;
    }

    public BigDecimal getInstallRate() {
        return installRate;
    }

    public void setInstallRate(BigDecimal installRate) {
        this.installRate = installRate;
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