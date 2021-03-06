package com.bea.olp;

import java.math.BigDecimal;

public class BAT_XW_SPECIAL_TRAN_TEMP {
    private String loanNo;

    private String tdDate;

    private String tdType;

    private BigDecimal tdAmt;

    private Short updateTerm;

    private String detailMsg;

    private String repayPlanUpdateSign;

    private String inputDate;

    private String inputTime;

    private String dataDate;

    private String applyNo;

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

    public String getTdType() {
        return tdType;
    }

    public void setTdType(String tdType) {
        this.tdType = tdType == null ? null : tdType.trim();
    }

    public BigDecimal getTdAmt() {
        return tdAmt;
    }

    public void setTdAmt(BigDecimal tdAmt) {
        this.tdAmt = tdAmt;
    }

    public Short getUpdateTerm() {
        return updateTerm;
    }

    public void setUpdateTerm(Short updateTerm) {
        this.updateTerm = updateTerm;
    }

    public String getDetailMsg() {
        return detailMsg;
    }

    public void setDetailMsg(String detailMsg) {
        this.detailMsg = detailMsg == null ? null : detailMsg.trim();
    }

    public String getRepayPlanUpdateSign() {
        return repayPlanUpdateSign;
    }

    public void setRepayPlanUpdateSign(String repayPlanUpdateSign) {
        this.repayPlanUpdateSign = repayPlanUpdateSign == null ? null : repayPlanUpdateSign.trim();
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

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo == null ? null : applyNo.trim();
    }
}