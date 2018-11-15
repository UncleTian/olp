package com.bea.olp;

import java.math.BigDecimal;

public class BAT_JD_REPAY_FLOW_HIS {
    private String busiDate;

    private String contractNo;

    private String proNo;

    private String limitNo;

    private String loanNo;

    private String stageNo;

    private String repayDate;

    private String serialNo;

    private String repayMethod;

    private BigDecimal accumShuldRepayPrinc;

    private BigDecimal realPrincAmt;

    private BigDecimal accumShuldRepayInt;

    private BigDecimal realIntAmt;

    private BigDecimal accumShuldRepayPenalty;

    private BigDecimal realPenaltyIntAmt;

    private Short terms;

    private Short oddTerms;

    private String repayType;

    private BigDecimal serviceCharge;

    private String inputDate;

    private String inputTime;

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

    public String getStageNo() {
        return stageNo;
    }

    public void setStageNo(String stageNo) {
        this.stageNo = stageNo == null ? null : stageNo.trim();
    }

    public String getRepayDate() {
        return repayDate;
    }

    public void setRepayDate(String repayDate) {
        this.repayDate = repayDate == null ? null : repayDate.trim();
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo == null ? null : serialNo.trim();
    }

    public String getRepayMethod() {
        return repayMethod;
    }

    public void setRepayMethod(String repayMethod) {
        this.repayMethod = repayMethod == null ? null : repayMethod.trim();
    }

    public BigDecimal getAccumShuldRepayPrinc() {
        return accumShuldRepayPrinc;
    }

    public void setAccumShuldRepayPrinc(BigDecimal accumShuldRepayPrinc) {
        this.accumShuldRepayPrinc = accumShuldRepayPrinc;
    }

    public BigDecimal getRealPrincAmt() {
        return realPrincAmt;
    }

    public void setRealPrincAmt(BigDecimal realPrincAmt) {
        this.realPrincAmt = realPrincAmt;
    }

    public BigDecimal getAccumShuldRepayInt() {
        return accumShuldRepayInt;
    }

    public void setAccumShuldRepayInt(BigDecimal accumShuldRepayInt) {
        this.accumShuldRepayInt = accumShuldRepayInt;
    }

    public BigDecimal getRealIntAmt() {
        return realIntAmt;
    }

    public void setRealIntAmt(BigDecimal realIntAmt) {
        this.realIntAmt = realIntAmt;
    }

    public BigDecimal getAccumShuldRepayPenalty() {
        return accumShuldRepayPenalty;
    }

    public void setAccumShuldRepayPenalty(BigDecimal accumShuldRepayPenalty) {
        this.accumShuldRepayPenalty = accumShuldRepayPenalty;
    }

    public BigDecimal getRealPenaltyIntAmt() {
        return realPenaltyIntAmt;
    }

    public void setRealPenaltyIntAmt(BigDecimal realPenaltyIntAmt) {
        this.realPenaltyIntAmt = realPenaltyIntAmt;
    }

    public Short getTerms() {
        return terms;
    }

    public void setTerms(Short terms) {
        this.terms = terms;
    }

    public Short getOddTerms() {
        return oddTerms;
    }

    public void setOddTerms(Short oddTerms) {
        this.oddTerms = oddTerms;
    }

    public String getRepayType() {
        return repayType;
    }

    public void setRepayType(String repayType) {
        this.repayType = repayType == null ? null : repayType.trim();
    }

    public BigDecimal getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(BigDecimal serviceCharge) {
        this.serviceCharge = serviceCharge;
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