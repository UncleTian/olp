package com.bea.olp;

public class SF_APPCLASSIFY {
    private String forder;

    private String cnname;

    private String descinfo;

    private String sysid;

    public String getForder() {
        return forder;
    }

    public void setForder(String forder) {
        this.forder = forder == null ? null : forder.trim();
    }

    public String getCnname() {
        return cnname;
    }

    public void setCnname(String cnname) {
        this.cnname = cnname == null ? null : cnname.trim();
    }

    public String getDescinfo() {
        return descinfo;
    }

    public void setDescinfo(String descinfo) {
        this.descinfo = descinfo == null ? null : descinfo.trim();
    }

    public String getSysid() {
        return sysid;
    }

    public void setSysid(String sysid) {
        this.sysid = sysid == null ? null : sysid.trim();
    }
}