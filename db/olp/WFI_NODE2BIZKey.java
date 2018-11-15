package com.bea.olp;

public class WFI_NODE2BIZKey {
    private String pk1;

    private String nodeid;

    public String getPk1() {
        return pk1;
    }

    public void setPk1(String pk1) {
        this.pk1 = pk1 == null ? null : pk1.trim();
    }

    public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid == null ? null : nodeid.trim();
    }
}