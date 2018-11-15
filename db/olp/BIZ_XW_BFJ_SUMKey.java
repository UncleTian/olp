package com.bea.olp;

public class BIZ_XW_BFJ_SUMKey {
    private String provisionsAcct;

    private String tdDate;

    public String getProvisionsAcct() {
        return provisionsAcct;
    }

    public void setProvisionsAcct(String provisionsAcct) {
        this.provisionsAcct = provisionsAcct == null ? null : provisionsAcct.trim();
    }

    public String getTdDate() {
        return tdDate;
    }

    public void setTdDate(String tdDate) {
        this.tdDate = tdDate == null ? null : tdDate.trim();
    }
}