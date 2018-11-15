package com.bea.olp;

public class CFG_ORG_MAPPING {
    private String manageOrgId;

    private String contTextOrg;

    public String getManageOrgId() {
        return manageOrgId;
    }

    public void setManageOrgId(String manageOrgId) {
        this.manageOrgId = manageOrgId == null ? null : manageOrgId.trim();
    }

    public String getContTextOrg() {
        return contTextOrg;
    }

    public void setContTextOrg(String contTextOrg) {
        this.contTextOrg = contTextOrg == null ? null : contTextOrg.trim();
    }
}