package com.bea.olp;

public class S_DUTYKey {
    private String instuCde;

    private String dutyCde;

    public String getInstuCde() {
        return instuCde;
    }

    public void setInstuCde(String instuCde) {
        this.instuCde = instuCde == null ? null : instuCde.trim();
    }

    public String getDutyCde() {
        return dutyCde;
    }

    public void setDutyCde(String dutyCde) {
        this.dutyCde = dutyCde == null ? null : dutyCde.trim();
    }
}