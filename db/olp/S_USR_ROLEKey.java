package com.bea.olp;

public class S_USR_ROLEKey {
    private String roleCde;

    private String usrCde;

    public String getRoleCde() {
        return roleCde;
    }

    public void setRoleCde(String roleCde) {
        this.roleCde = roleCde == null ? null : roleCde.trim();
    }

    public String getUsrCde() {
        return usrCde;
    }

    public void setUsrCde(String usrCde) {
        this.usrCde = usrCde == null ? null : usrCde.trim();
    }
}