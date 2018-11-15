package com.bea.olp;

import java.math.BigDecimal;

public class WF_STUDIO {
    private BigDecimal wfid;

    private String wfname;

    private String wfsign;

    private String wfsort;

    private String wffolder;

    private String wfver;

    private String state;

    private String author;

    private String depid;

    private String orgid;

    private String sysid;

    public BigDecimal getWfid() {
        return wfid;
    }

    public void setWfid(BigDecimal wfid) {
        this.wfid = wfid;
    }

    public String getWfname() {
        return wfname;
    }

    public void setWfname(String wfname) {
        this.wfname = wfname == null ? null : wfname.trim();
    }

    public String getWfsign() {
        return wfsign;
    }

    public void setWfsign(String wfsign) {
        this.wfsign = wfsign == null ? null : wfsign.trim();
    }

    public String getWfsort() {
        return wfsort;
    }

    public void setWfsort(String wfsort) {
        this.wfsort = wfsort == null ? null : wfsort.trim();
    }

    public String getWffolder() {
        return wffolder;
    }

    public void setWffolder(String wffolder) {
        this.wffolder = wffolder == null ? null : wffolder.trim();
    }

    public String getWfver() {
        return wfver;
    }

    public void setWfver(String wfver) {
        this.wfver = wfver == null ? null : wfver.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getDepid() {
        return depid;
    }

    public void setDepid(String depid) {
        this.depid = depid == null ? null : depid.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getSysid() {
        return sysid;
    }

    public void setSysid(String sysid) {
        this.sysid = sysid == null ? null : sysid.trim();
    }
}