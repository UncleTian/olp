package com.bea.olp;

public class WFI_SHUF2ORGKey {
    private String shfId;

    private String orgId;

    public String getShfId() {
        return shfId;
    }

    public void setShfId(String shfId) {
        this.shfId = shfId == null ? null : shfId.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }
}