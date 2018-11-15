package com.bea.olp;

public class WF_VAR {
    private String varid;

    private String varname;

    private String vardesc;

    private String varvalue;

    private String sysid;

    public String getVarid() {
        return varid;
    }

    public void setVarid(String varid) {
        this.varid = varid == null ? null : varid.trim();
    }

    public String getVarname() {
        return varname;
    }

    public void setVarname(String varname) {
        this.varname = varname == null ? null : varname.trim();
    }

    public String getVardesc() {
        return vardesc;
    }

    public void setVardesc(String vardesc) {
        this.vardesc = vardesc == null ? null : vardesc.trim();
    }

    public String getVarvalue() {
        return varvalue;
    }

    public void setVarvalue(String varvalue) {
        this.varvalue = varvalue == null ? null : varvalue.trim();
    }

    public String getSysid() {
        return sysid;
    }

    public void setSysid(String sysid) {
        this.sysid = sysid == null ? null : sysid.trim();
    }
}