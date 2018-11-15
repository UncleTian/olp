package com.bea.olp;

public class CCR_M_GROUP_SCOREKey {
    private String serno;

    private String cusId;

    private String modelNo;

    private String groupNo;

    private String ccrDate;

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

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo == null ? null : modelNo.trim();
    }

    public String getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo == null ? null : groupNo.trim();
    }

    public String getCcrDate() {
        return ccrDate;
    }

    public void setCcrDate(String ccrDate) {
        this.ccrDate = ccrDate == null ? null : ccrDate.trim();
    }
}