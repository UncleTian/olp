package com.bea.olp;

public class BIZ_XW_REV_TRANSKey {
    private String loanNo;

    private String reversalDate;

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo == null ? null : loanNo.trim();
    }

    public String getReversalDate() {
        return reversalDate;
    }

    public void setReversalDate(String reversalDate) {
        this.reversalDate = reversalDate == null ? null : reversalDate.trim();
    }
}