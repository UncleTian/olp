package com.bea.olp;

public class S_BCHKey {
    private String instuCde;

    private String bchCde;

    public String getInstuCde() {
        return instuCde;
    }

    public void setInstuCde(String instuCde) {
        this.instuCde = instuCde == null ? null : instuCde.trim();
    }

    public String getBchCde() {
        return bchCde;
    }

    public void setBchCde(String bchCde) {
        this.bchCde = bchCde == null ? null : bchCde.trim();
    }
}