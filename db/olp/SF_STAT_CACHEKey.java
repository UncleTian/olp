package com.bea.olp;

import java.math.BigDecimal;

public class SF_STAT_CACHEKey {
    private String statid;

    private String matchvalue;

    private BigDecimal transtime;

    public String getStatid() {
        return statid;
    }

    public void setStatid(String statid) {
        this.statid = statid == null ? null : statid.trim();
    }

    public String getMatchvalue() {
        return matchvalue;
    }

    public void setMatchvalue(String matchvalue) {
        this.matchvalue = matchvalue == null ? null : matchvalue.trim();
    }

    public BigDecimal getTranstime() {
        return transtime;
    }

    public void setTranstime(BigDecimal transtime) {
        this.transtime = transtime;
    }
}