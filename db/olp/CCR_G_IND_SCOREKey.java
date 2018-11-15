package com.bea.olp;

public class CCR_G_IND_SCOREKey {
    private String serno;

    private String cusId;

    private String groupNo;

    private String indexNo;

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

    public String getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo == null ? null : groupNo.trim();
    }

    public String getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(String indexNo) {
        this.indexNo = indexNo == null ? null : indexNo.trim();
    }

    public String getCcrDate() {
        return ccrDate;
    }

    public void setCcrDate(String ccrDate) {
        this.ccrDate = ccrDate == null ? null : ccrDate.trim();
    }
}