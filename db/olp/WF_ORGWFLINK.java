package com.bea.olp;

public class WF_ORGWFLINK {
    private String unid;

    private String orgid;

    private String orgname;

    private String appid;

    private String appname;

    private String subtype1;

    private String subtype2;

    private String subtype3;

    private String wfsign;

    private String wfname;

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid == null ? null : unid.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname == null ? null : orgname.trim();
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname == null ? null : appname.trim();
    }

    public String getSubtype1() {
        return subtype1;
    }

    public void setSubtype1(String subtype1) {
        this.subtype1 = subtype1 == null ? null : subtype1.trim();
    }

    public String getSubtype2() {
        return subtype2;
    }

    public void setSubtype2(String subtype2) {
        this.subtype2 = subtype2 == null ? null : subtype2.trim();
    }

    public String getSubtype3() {
        return subtype3;
    }

    public void setSubtype3(String subtype3) {
        this.subtype3 = subtype3 == null ? null : subtype3.trim();
    }

    public String getWfsign() {
        return wfsign;
    }

    public void setWfsign(String wfsign) {
        this.wfsign = wfsign == null ? null : wfsign.trim();
    }

    public String getWfname() {
        return wfname;
    }

    public void setWfname(String wfname) {
        this.wfname = wfname == null ? null : wfname.trim();
    }
}