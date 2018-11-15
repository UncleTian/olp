package com.bea.olp;

public class S_ROLE_RULEKey {
    private String instuCde;

    private String roleCde;

    private String rescCde;

    private String rescActCde;

    public String getInstuCde() {
        return instuCde;
    }

    public void setInstuCde(String instuCde) {
        this.instuCde = instuCde == null ? null : instuCde.trim();
    }

    public String getRoleCde() {
        return roleCde;
    }

    public void setRoleCde(String roleCde) {
        this.roleCde = roleCde == null ? null : roleCde.trim();
    }

    public String getRescCde() {
        return rescCde;
    }

    public void setRescCde(String rescCde) {
        this.rescCde = rescCde == null ? null : rescCde.trim();
    }

    public String getRescActCde() {
        return rescActCde;
    }

    public void setRescActCde(String rescActCde) {
        this.rescActCde = rescActCde == null ? null : rescActCde.trim();
    }
}