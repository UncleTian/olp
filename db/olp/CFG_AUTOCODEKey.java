package com.bea.olp;

public class CFG_AUTOCODEKey {
    private String atype;

    private String owner;

    public String getAtype() {
        return atype;
    }

    public void setAtype(String atype) {
        this.atype = atype == null ? null : atype.trim();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }
}