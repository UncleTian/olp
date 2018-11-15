package com.bea.olp;

public class S_ROLE_RULE extends S_ROLE_RULEKey {
    private String sts;

    private String lastChgDt;

    private String lastChgUsr;

    public String getSts() {
        return sts;
    }

    public void setSts(String sts) {
        this.sts = sts == null ? null : sts.trim();
    }

    public String getLastChgDt() {
        return lastChgDt;
    }

    public void setLastChgDt(String lastChgDt) {
        this.lastChgDt = lastChgDt == null ? null : lastChgDt.trim();
    }

    public String getLastChgUsr() {
        return lastChgUsr;
    }

    public void setLastChgUsr(String lastChgUsr) {
        this.lastChgUsr = lastChgUsr == null ? null : lastChgUsr.trim();
    }
}