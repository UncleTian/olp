package com.bea.olp;

public class WF_ORGVAR extends WF_ORGVARKey {
    private String orgname;

    private String varname;

    private String varvalue;

    private String sysid;

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname == null ? null : orgname.trim();
    }

    public String getVarname() {
        return varname;
    }

    public void setVarname(String varname) {
        this.varname = varname == null ? null : varname.trim();
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