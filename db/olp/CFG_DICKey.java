package com.bea.olp;

public class CFG_DICKey {
    private String opttype;

    private String enname;

    public String getOpttype() {
        return opttype;
    }

    public void setOpttype(String opttype) {
        this.opttype = opttype == null ? null : opttype.trim();
    }

    public String getEnname() {
        return enname;
    }

    public void setEnname(String enname) {
        this.enname = enname == null ? null : enname.trim();
    }
}