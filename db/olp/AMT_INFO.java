package com.bea.olp;

import java.math.BigDecimal;

public class AMT_INFO {
    private String serno;

    private String amttype;

    private String codeNo;

    private BigDecimal amt;

    private String optype;

    private String amtStatus;

    private String inputTime;

    private String inputId;

    private String inputBrId;

    private String lastUpdateTime;

    private String lastUpdateId;

    private BigDecimal avaAmt;

    private String loanProp;

    private String prdCode;

    private String coPlatform;

    public String getSerno() {
        return serno;
    }

    public void setSerno(String serno) {
        this.serno = serno == null ? null : serno.trim();
    }

    public String getAmttype() {
        return amttype;
    }

    public void setAmttype(String amttype) {
        this.amttype = amttype == null ? null : amttype.trim();
    }

    public String getCodeNo() {
        return codeNo;
    }

    public void setCodeNo(String codeNo) {
        this.codeNo = codeNo == null ? null : codeNo.trim();
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public String getOptype() {
        return optype;
    }

    public void setOptype(String optype) {
        this.optype = optype == null ? null : optype.trim();
    }

    public String getAmtStatus() {
        return amtStatus;
    }

    public void setAmtStatus(String amtStatus) {
        this.amtStatus = amtStatus == null ? null : amtStatus.trim();
    }

    public String getInputTime() {
        return inputTime;
    }

    public void setInputTime(String inputTime) {
        this.inputTime = inputTime == null ? null : inputTime.trim();
    }

    public String getInputId() {
        return inputId;
    }

    public void setInputId(String inputId) {
        this.inputId = inputId == null ? null : inputId.trim();
    }

    public String getInputBrId() {
        return inputBrId;
    }

    public void setInputBrId(String inputBrId) {
        this.inputBrId = inputBrId == null ? null : inputBrId.trim();
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime == null ? null : lastUpdateTime.trim();
    }

    public String getLastUpdateId() {
        return lastUpdateId;
    }

    public void setLastUpdateId(String lastUpdateId) {
        this.lastUpdateId = lastUpdateId == null ? null : lastUpdateId.trim();
    }

    public BigDecimal getAvaAmt() {
        return avaAmt;
    }

    public void setAvaAmt(BigDecimal avaAmt) {
        this.avaAmt = avaAmt;
    }

    public String getLoanProp() {
        return loanProp;
    }

    public void setLoanProp(String loanProp) {
        this.loanProp = loanProp == null ? null : loanProp.trim();
    }

    public String getPrdCode() {
        return prdCode;
    }

    public void setPrdCode(String prdCode) {
        this.prdCode = prdCode == null ? null : prdCode.trim();
    }

    public String getCoPlatform() {
        return coPlatform;
    }

    public void setCoPlatform(String coPlatform) {
        this.coPlatform = coPlatform == null ? null : coPlatform.trim();
    }
}