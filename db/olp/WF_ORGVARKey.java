package com.bea.olp;

public class WF_ORGVARKey {
    private String orgid;

    private String varid;

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getVarid() {
        return varid;
    }

    public void setVarid(String varid) {
        this.varid = varid == null ? null : varid.trim();
    }
}