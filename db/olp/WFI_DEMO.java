package com.bea.olp;

public class WFI_DEMO {
    private String serno;

    private String cusId;

    private String cusName;

    private String wfApprSts;

    public String getSerno() {
        return serno;
    }

    public void setSerno(String serno) {
        this.serno = serno == null ? null : serno.trim();
    }

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId == null ? null : cusId.trim();
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName == null ? null : cusName.trim();
    }

    public String getWfApprSts() {
        return wfApprSts;
    }

    public void setWfApprSts(String wfApprSts) {
        this.wfApprSts = wfApprSts == null ? null : wfApprSts.trim();
    }
}