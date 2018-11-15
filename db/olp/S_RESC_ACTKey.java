package com.bea.olp;

public class S_RESC_ACTKey {
    private String rescCde;

    private String rescActCde;

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