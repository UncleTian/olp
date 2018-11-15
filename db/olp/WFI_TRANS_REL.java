package com.bea.olp;

public class WFI_TRANS_REL {
    private String transId;

    private String shfId;

    private String orgId;

    private String prdType;

    private String bizType;

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId == null ? null : transId.trim();
    }

    public String getShfId() {
        return shfId;
    }

    public void setShfId(String shfId) {
        this.shfId = shfId == null ? null : shfId.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getPrdType() {
        return prdType;
    }

    public void setPrdType(String prdType) {
        this.prdType = prdType == null ? null : prdType.trim();
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType == null ? null : bizType.trim();
    }
}