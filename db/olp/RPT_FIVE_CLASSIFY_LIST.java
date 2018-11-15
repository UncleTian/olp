package com.bea.olp;

public class RPT_FIVE_CLASSIFY_LIST {
    private String seralNo;

    private String glSeralNo;

    private String wfApprSts;

    private String remark;

    public String getSeralNo() {
        return seralNo;
    }

    public void setSeralNo(String seralNo) {
        this.seralNo = seralNo == null ? null : seralNo.trim();
    }

    public String getGlSeralNo() {
        return glSeralNo;
    }

    public void setGlSeralNo(String glSeralNo) {
        this.glSeralNo = glSeralNo == null ? null : glSeralNo.trim();
    }

    public String getWfApprSts() {
        return wfApprSts;
    }

    public void setWfApprSts(String wfApprSts) {
        this.wfApprSts = wfApprSts == null ? null : wfApprSts.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}