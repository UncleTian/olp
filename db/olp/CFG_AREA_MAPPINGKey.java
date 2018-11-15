package com.bea.olp;

public class CFG_AREA_MAPPINGKey {
    private String areaCode;

    private String manageOrgId;

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getManageOrgId() {
        return manageOrgId;
    }

    public void setManageOrgId(String manageOrgId) {
        this.manageOrgId = manageOrgId == null ? null : manageOrgId.trim();
    }
}