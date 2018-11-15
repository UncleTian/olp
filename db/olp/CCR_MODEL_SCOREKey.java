package com.bea.olp;

public class CCR_MODEL_SCOREKey {
    private String modelNo;

    private String cusId;

    private String ccrDate;

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo == null ? null : modelNo.trim();
    }

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId == null ? null : cusId.trim();
    }

    public String getCcrDate() {
        return ccrDate;
    }

    public void setCcrDate(String ccrDate) {
        this.ccrDate = ccrDate == null ? null : ccrDate.trim();
    }
}