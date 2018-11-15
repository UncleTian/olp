package com.bea.olp;

import java.math.BigDecimal;

public class BAT_SOP_HKDZ_HIS {
    private String dtDate;

    private String billNo;

    private String paySerno;

    private String coPlatform;

    private String prdCode;

    private String payWay;

    private String tranCode;

    private String norPayFlag;

    private String excPayFlag;

    private BigDecimal payTotalAmt;

    private BigDecimal paiedExpnormAmt;

    private BigDecimal paiedExpinteAmt;

    private BigDecimal paiedExcnormAmt;

    private BigDecimal paiedExcinteAmt;

    private String tradeType;

    private BigDecimal payBalAmt;

    private BigDecimal balNormAmt;

    private String inputDate;

    private String inputTime;

    private String lastUpdateDate;

    private String lastUpdateTime;

    public String getDtDate() {
        return dtDate;
    }

    public void setDtDate(String dtDate) {
        this.dtDate = dtDate == null ? null : dtDate.trim();
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
    }

    public String getPaySerno() {
        return paySerno;
    }

    public void setPaySerno(String paySerno) {
        this.paySerno = paySerno == null ? null : paySerno.trim();
    }

    public String getCoPlatform() {
        return coPlatform;
    }

    public void setCoPlatform(String coPlatform) {
        this.coPlatform = coPlatform == null ? null : coPlatform.trim();
    }

    public String getPrdCode() {
        return prdCode;
    }

    public void setPrdCode(String prdCode) {
        this.prdCode = prdCode == null ? null : prdCode.trim();
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay == null ? null : payWay.trim();
    }

    public String getTranCode() {
        return tranCode;
    }

    public void setTranCode(String tranCode) {
        this.tranCode = tranCode == null ? null : tranCode.trim();
    }

    public String getNorPayFlag() {
        return norPayFlag;
    }

    public void setNorPayFlag(String norPayFlag) {
        this.norPayFlag = norPayFlag == null ? null : norPayFlag.trim();
    }

    public String getExcPayFlag() {
        return excPayFlag;
    }

    public void setExcPayFlag(String excPayFlag) {
        this.excPayFlag = excPayFlag == null ? null : excPayFlag.trim();
    }

    public BigDecimal getPayTotalAmt() {
        return payTotalAmt;
    }

    public void setPayTotalAmt(BigDecimal payTotalAmt) {
        this.payTotalAmt = payTotalAmt;
    }

    public BigDecimal getPaiedExpnormAmt() {
        return paiedExpnormAmt;
    }

    public void setPaiedExpnormAmt(BigDecimal paiedExpnormAmt) {
        this.paiedExpnormAmt = paiedExpnormAmt;
    }

    public BigDecimal getPaiedExpinteAmt() {
        return paiedExpinteAmt;
    }

    public void setPaiedExpinteAmt(BigDecimal paiedExpinteAmt) {
        this.paiedExpinteAmt = paiedExpinteAmt;
    }

    public BigDecimal getPaiedExcnormAmt() {
        return paiedExcnormAmt;
    }

    public void setPaiedExcnormAmt(BigDecimal paiedExcnormAmt) {
        this.paiedExcnormAmt = paiedExcnormAmt;
    }

    public BigDecimal getPaiedExcinteAmt() {
        return paiedExcinteAmt;
    }

    public void setPaiedExcinteAmt(BigDecimal paiedExcinteAmt) {
        this.paiedExcinteAmt = paiedExcinteAmt;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType == null ? null : tradeType.trim();
    }

    public BigDecimal getPayBalAmt() {
        return payBalAmt;
    }

    public void setPayBalAmt(BigDecimal payBalAmt) {
        this.payBalAmt = payBalAmt;
    }

    public BigDecimal getBalNormAmt() {
        return balNormAmt;
    }

    public void setBalNormAmt(BigDecimal balNormAmt) {
        this.balNormAmt = balNormAmt;
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
}