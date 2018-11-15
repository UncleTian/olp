package com.bea.olp;

public class WF_S_DICKey {
    private String enname;

    private String dictype;

    public String getEnname() {
        return enname;
    }

    public void setEnname(String enname) {
        this.enname = enname == null ? null : enname.trim();
    }

    public String getDictype() {
        return dictype;
    }

    public void setDictype(String dictype) {
        this.dictype = dictype == null ? null : dictype.trim();
    }
}