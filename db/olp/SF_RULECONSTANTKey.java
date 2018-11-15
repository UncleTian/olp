package com.bea.olp;

public class SF_RULECONSTANTKey {
    private String rulesetid;

    private String ruleid;

    private String constantId;

    public String getRulesetid() {
        return rulesetid;
    }

    public void setRulesetid(String rulesetid) {
        this.rulesetid = rulesetid == null ? null : rulesetid.trim();
    }

    public String getRuleid() {
        return ruleid;
    }

    public void setRuleid(String ruleid) {
        this.ruleid = ruleid == null ? null : ruleid.trim();
    }

    public String getConstantId() {
        return constantId;
    }

    public void setConstantId(String constantId) {
        this.constantId = constantId == null ? null : constantId.trim();
    }
}