package com.bea.olp;

public class SF_RULESETINFO {
    private String name;

    private String cnname;

    private String descinfo;

    private String forder;

    private String checkout;

    private String levels;

    private String type;

    private String appsign;

    private String publishext;

    private String sysid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public String getForder() {
        return forder;
    }

    public void setForder(String forder) {
        this.forder = forder == null ? null : forder.trim();
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout == null ? null : checkout.trim();
    }

    public String getLevels() {
        return levels;
    }

    public void setLevels(String levels) {
        this.levels = levels == null ? null : levels.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getAppsign() {
        return appsign;
    }

    public void setAppsign(String appsign) {
        this.appsign = appsign == null ? null : appsign.trim();
    }

    public String getPublishext() {
        return publishext;
    }

    public void setPublishext(String publishext) {
        this.publishext = publishext == null ? null : publishext.trim();
    }

    public String getSysid() {
        return sysid;
    }

    public void setSysid(String sysid) {
        this.sysid = sysid == null ? null : sysid.trim();
    }
}