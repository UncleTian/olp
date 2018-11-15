package com.bea.olp;

public class S_DEPTKey {
    private String instuCde;

    private String depCde;

    public String getInstuCde() {
        return instuCde;
    }

    public void setInstuCde(String instuCde) {
        this.instuCde = instuCde == null ? null : instuCde.trim();
    }

    public String getDepCde() {
        return depCde;
    }

    public void setDepCde(String depCde) {
        this.depCde = depCde == null ? null : depCde.trim();
    }
}