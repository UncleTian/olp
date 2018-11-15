package com.bea.olp;

public class WF_TASKPOOL {
    private String tpid;

    private String tpname;

    private String tpdsc;

    private String sysid;

    public String getTpid() {
        return tpid;
    }

    public void setTpid(String tpid) {
        this.tpid = tpid == null ? null : tpid.trim();
    }

    public String getTpname() {
        return tpname;
    }

    public void setTpname(String tpname) {
        this.tpname = tpname == null ? null : tpname.trim();
    }

    public String getTpdsc() {
        return tpdsc;
    }

    public void setTpdsc(String tpdsc) {
        this.tpdsc = tpdsc == null ? null : tpdsc.trim();
    }

    public String getSysid() {
        return sysid;
    }

    public void setSysid(String sysid) {
        this.sysid = sysid == null ? null : sysid.trim();
    }
}