package com.bea.olp;

import java.math.BigDecimal;

public class BAT_XW_FEE_REL_HIS {
    private String loanNo;

    private String feeRuleId;

    private String feeRuleName;

    private String feeRuleCode;

    private BigDecimal feeRate;

    private String inputDate;

    private String inputTime;

    private String dataDate;

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo == null ? null : loanNo.trim();
    }

    public String getFeeRuleId() {
        return feeRuleId;
    }

    public void setFeeRuleId(String feeRuleId) {
        this.feeRuleId = feeRuleId == null ? null : feeRuleId.trim();
    }

    public String getFeeRuleName() {
        return feeRuleName;
    }

    public void setFeeRuleName(String feeRuleName) {
        this.feeRuleName = feeRuleName == null ? null : feeRuleName.trim();
    }

    public String getFeeRuleCode() {
        return feeRuleCode;
    }

    public void setFeeRuleCode(String feeRuleCode) {
        this.feeRuleCode = feeRuleCode == null ? null : feeRuleCode.trim();
    }

    public BigDecimal getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(BigDecimal feeRate) {
        this.feeRate = feeRate;
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