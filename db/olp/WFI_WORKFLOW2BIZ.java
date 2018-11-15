package com.bea.olp;

public class WFI_WORKFLOW2BIZ {
    private String pk1;

    private String applType;

    private String wfsign;

    private String wfname;

    private String appUrl;

    private String bizUrl;

    private String preventList;

    private String sceneScope;

    private String remark;

    public String getPk1() {
        return pk1;
    }

    public void setPk1(String pk1) {
        this.pk1 = pk1 == null ? null : pk1.trim();
    }

    public String getApplType() {
        return applType;
    }

    public void setApplType(String applType) {
        this.applType = applType == null ? null : applType.trim();
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

    public String getAppUrl() {
        return appUrl;
    }

    public void setAppUrl(String appUrl) {
        this.appUrl = appUrl == null ? null : appUrl.trim();
    }

    public String getBizUrl() {
        return bizUrl;
    }

    public void setBizUrl(String bizUrl) {
        this.bizUrl = bizUrl == null ? null : bizUrl.trim();
    }

    public String getPreventList() {
        return preventList;
    }

    public void setPreventList(String preventList) {
        this.preventList = preventList == null ? null : preventList.trim();
    }

    public String getSceneScope() {
        return sceneScope;
    }

    public void setSceneScope(String sceneScope) {
        this.sceneScope = sceneScope == null ? null : sceneScope.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}