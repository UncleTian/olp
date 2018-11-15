package com.bea.olp;

import java.math.BigDecimal;

public class BAT_XW_FEE_HIS {
    private String shouldDeductDate;

    private BigDecimal shouldDeductAmt;

    private String realDeductDate;

    private BigDecimal realDeductAmt;

    private String deductStatus;

    private String applyNo;

    private String deductRuleId;

    private String deductRuleName;

    private String deductRuleCode;

    private BigDecimal deductBasics;

    private BigDecimal rate;

    private String inputDate;

    private String inputTime;

    private String dataDate;

    public String getShouldDeductDate() {
        return shouldDeductDate;
    }

    public void setShouldDeductDate(String shouldDeductDate) {
        this.shouldDeductDate = shouldDeductDate == null ? null : shouldDeductDate.trim();
    }

    public BigDecimal getShouldDeductAmt() {
        return shouldDeductAmt;
    }

    public void setShouldDeductAmt(BigDecimal shouldDeductAmt) {
        this.shouldDeductAmt = shouldDeductAmt;
    }

    public String getRealDeductDate() {
        return realDeductDate;
    }

    public void setRealDeductDate(String realDeductDate) {
        this.realDeductDate = realDeductDate == null ? null : realDeductDate.trim();
    }

    public BigDecimal getRealDeductAmt() {
        return realDeductAmt;
    }

    public void setRealDeductAmt(BigDecimal realDeductAmt) {
        this.realDeductAmt = realDeductAmt;
    }

    public String getDeductStatus() {
        return deductStatus;
    }

    public void setDeductStatus(String deductStatus) {
        this.deductStatus = deductStatus == null ? null : deductStatus.trim();
    }

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo == null ? null : applyNo.trim();
    }

    public String getDeductRuleId() {
        return deductRuleId;
    }

    public void setDeductRuleId(String deductRuleId) {
        this.deductRuleId = deductRuleId == null ? null : deductRuleId.trim();
    }

    public String getDeductRuleName() {
        return deductRuleName;
    }

    public void setDeductRuleName(String deductRuleName) {
        this.deductRuleName = deductRuleName == null ? null : deductRuleName.trim();
    }

    public String getDeductRuleCode() {
        return deductRuleCode;
    }

    public void setDeductRuleCode(String deductRuleCode) {
        this.deductRuleCode = deductRuleCode == null ? null : deductRuleCode.trim();
    }

    public BigDecimal getDeductBasics() {
        return deductBasics;
    }

    public void setDeductBasics(BigDecimal deductBasics) {
        this.deductBasics = deductBasics;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
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