package com.bea.olp;

public class WF_LINKMANKey {
    private String regiuserid;

    private String linkmanid;

    public String getRegiuserid() {
        return regiuserid;
    }

    public void setRegiuserid(String regiuserid) {
        this.regiuserid = regiuserid == null ? null : regiuserid.trim();
    }

    public String getLinkmanid() {
        return linkmanid;
    }

    public void setLinkmanid(String linkmanid) {
        this.linkmanid = linkmanid == null ? null : linkmanid.trim();
    }
}