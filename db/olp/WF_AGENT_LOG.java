package com.bea.olp;

public class WF_AGENT_LOG extends WF_AGENT_LOGKey {
    private String wfid;

    private String wfsign;

    private String replacer;

    private String sysid;

    public String getWfid() {
        return wfid;
    }

    public void setWfid(String wfid) {
        this.wfid = wfid == null ? null : wfid.trim();
    }

    public String getWfsign() {
        return wfsign;
    }

    public void setWfsign(String wfsign) {
        this.wfsign = wfsign == null ? null : wfsign.trim();
    }

    public String getReplacer() {
        return replacer;
    }

    public void setReplacer(String replacer) {
        this.replacer = replacer == null ? null : replacer.trim();
    }

    public String getSysid() {
        return sysid;
    }

    public void setSysid(String sysid) {
        this.sysid = sysid == null ? null : sysid.trim();
    }
}