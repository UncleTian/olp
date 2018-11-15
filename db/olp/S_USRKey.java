package com.bea.olp;

public class S_USRKey {
    private String instuCde;

    private String usrCde;

    public String getInstuCde() {
        return instuCde;
    }

    public void setInstuCde(String instuCde) {
        this.instuCde = instuCde == null ? null : instuCde.trim();
    }

    public String getUsrCde() {
        return usrCde;
    }

    public void setUsrCde(String usrCde) {
        this.usrCde = usrCde == null ? null : usrCde.trim();
    }
}