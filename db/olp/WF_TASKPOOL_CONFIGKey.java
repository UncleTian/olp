package com.bea.olp;

public class WF_TASKPOOL_CONFIGKey {
    private String tpid;

    private String relatedType;

    private String relatedCode;

    public String getTpid() {
        return tpid;
    }

    public void setTpid(String tpid) {
        this.tpid = tpid == null ? null : tpid.trim();
    }

    public String getRelatedType() {
        return relatedType;
    }

    public void setRelatedType(String relatedType) {
        this.relatedType = relatedType == null ? null : relatedType.trim();
    }

    public String getRelatedCode() {
        return relatedCode;
    }

    public void setRelatedCode(String relatedCode) {
        this.relatedCode = relatedCode == null ? null : relatedCode.trim();
    }
}