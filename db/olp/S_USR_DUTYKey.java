package com.bea.olp;

public class S_USR_DUTYKey {
    private String dutyCde;

    private String usrCde;

    public String getDutyCde() {
        return dutyCde;
    }

    public void setDutyCde(String dutyCde) {
        this.dutyCde = dutyCde == null ? null : dutyCde.trim();
    }

    public String getUsrCde() {
        return usrCde;
    }

    public void setUsrCde(String usrCde) {
        this.usrCde = usrCde == null ? null : usrCde.trim();
    }
}