package com.bea.olp;

public class WF_TASKPOOL_USERKey {
    private String tpid;

    private String userid;

    public String getTpid() {
        return tpid;
    }

    public void setTpid(String tpid) {
        this.tpid = tpid == null ? null : tpid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
}