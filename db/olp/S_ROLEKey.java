package com.bea.olp;

public class S_ROLEKey {
    private String instuCde;

    private String roleCde;

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
}