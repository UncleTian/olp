package com.bea.olp;

public class SF_TRANSRULEKey {
    private String transId;

    private String rulesetid;

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId == null ? null : transId.trim();
    }

    public String getRulesetid() {
        return rulesetid;
    }

    public void setRulesetid(String rulesetid) {
        this.rulesetid = rulesetid == null ? null : rulesetid.trim();
    }
}