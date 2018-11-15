package com.bea.olp;

public class LOAN_PRD_GROUP_REL {
    private String lmtNo;

    private String prdNo;

    private String relState;

    public String getLmtNo() {
        return lmtNo;
    }

    public void setLmtNo(String lmtNo) {
        this.lmtNo = lmtNo == null ? null : lmtNo.trim();
    }

    public String getPrdNo() {
        return prdNo;
    }

    public void setPrdNo(String prdNo) {
        this.prdNo = prdNo == null ? null : prdNo.trim();
    }

    public String getRelState() {
        return relState;
    }

    public void setRelState(String relState) {
        this.relState = relState == null ? null : relState.trim();
    }
}