package com.bea.olp;

public class ORG_QUERY_LIMITS {
    private String bchCde;

    private String bchDown;

    public String getBchCde() {
        return bchCde;
    }

    public void setBchCde(String bchCde) {
        this.bchCde = bchCde == null ? null : bchCde.trim();
    }

    public String getBchDown() {
        return bchDown;
    }

    public void setBchDown(String bchDown) {
        this.bchDown = bchDown == null ? null : bchDown.trim();
    }
}