package com.bea.olp;

public class WF_AGENT_LOGKey {
    private String instanceid;

    private String nodeid;

    private String nodestarttime;

    private String originaluser;

    public String getInstanceid() {
        return instanceid;
    }

    public void setInstanceid(String instanceid) {
        this.instanceid = instanceid == null ? null : instanceid.trim();
    }

    public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid == null ? null : nodeid.trim();
    }

    public String getNodestarttime() {
        return nodestarttime;
    }

    public void setNodestarttime(String nodestarttime) {
        this.nodestarttime = nodestarttime == null ? null : nodestarttime.trim();
    }

    public String getOriginaluser() {
        return originaluser;
    }

    public void setOriginaluser(String originaluser) {
        this.originaluser = originaluser == null ? null : originaluser.trim();
    }
}