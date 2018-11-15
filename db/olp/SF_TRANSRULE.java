package com.bea.olp;

public class SF_TRANSRULE extends SF_TRANSRULEKey {
    private String ruleid;

    public String getRuleid() {
        return ruleid;
    }

    public void setRuleid(String ruleid) {
        this.ruleid = ruleid == null ? null : ruleid.trim();
    }
}