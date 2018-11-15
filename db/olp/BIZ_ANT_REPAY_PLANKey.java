package com.bea.olp;

public class BIZ_ANT_REPAY_PLANKey {
    private String contractNo;

    private Short termNo;

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    public Short getTermNo() {
        return termNo;
    }

    public void setTermNo(Short termNo) {
        this.termNo = termNo;
    }
}