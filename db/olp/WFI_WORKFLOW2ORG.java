package com.bea.olp;

public class WFI_WORKFLOW2ORG {
    private String wf2orgId;

    private String orgId;

    private String orgName;

    private String applType;

    private String wfsign;

    private String wfname;

    private String remark;

    public String getWf2orgId() {
        return wf2orgId;
    }

    public void setWf2orgId(String wf2orgId) {
        this.wf2orgId = wf2orgId == null ? null : wf2orgId.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}