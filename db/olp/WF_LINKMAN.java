package com.bea.olp;

public class WF_LINKMAN extends WF_LINKMANKey {
    private String regiusername;

    private String linkmanno;

    private String linkmanname;

    private String linkrolename;

    private String linkroleid;

    private String linkorgname;

    private String linkorgid;

    private String regidate;

    public String getRegiusername() {
        return regiusername;
    }

    public void setRegiusername(String regiusername) {
        this.regiusername = regiusername == null ? null : regiusername.trim();
    }

    public String getLinkmanno() {
        return linkmanno;
    }

    public void setLinkmanno(String linkmanno) {
        this.linkmanno = linkmanno == null ? null : linkmanno.trim();
    }

    public String getLinkmanname() {
        return linkmanname;
    }

    public void setLinkmanname(String linkmanname) {
        this.linkmanname = linkmanname == null ? null : linkmanname.trim();
    }

    public String getLinkrolename() {
        return linkrolename;
    }

    public void setLinkrolename(String linkrolename) {
        this.linkrolename = linkrolename == null ? null : linkrolename.trim();
    }

    public String getLinkroleid() {
        return linkroleid;
    }

    public void setLinkroleid(String linkroleid) {
        this.linkroleid = linkroleid == null ? null : linkroleid.trim();
    }

    public String getLinkorgname() {
        return linkorgname;
    }

    public void setLinkorgname(String linkorgname) {
        this.linkorgname = linkorgname == null ? null : linkorgname.trim();
    }

    public String getLinkorgid() {
        return linkorgid;
    }

    public void setLinkorgid(String linkorgid) {
        this.linkorgid = linkorgid == null ? null : linkorgid.trim();
    }

    public String getRegidate() {
        return regidate;
    }

    public void setRegidate(String regidate) {
        this.regidate = regidate == null ? null : regidate.trim();
    }
}