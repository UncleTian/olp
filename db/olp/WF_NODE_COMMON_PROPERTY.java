package com.bea.olp;

public class WF_NODE_COMMON_PROPERTY {
    private String nodeid;

    private String wfid;

    private String nodetype;

    private String nodename;

    private String nodesign;

    private String nodedescription;

    private String nodeformid;

    private String nodeformname;

    private String noderoutertype;

    private String nodepowercontrol;

    private String nodeweigh;

    public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid == null ? null : nodeid.trim();
    }

    public String getWfid() {
        return wfid;
    }

    public void setWfid(String wfid) {
        this.wfid = wfid == null ? null : wfid.trim();
    }

    public String getNodetype() {
        return nodetype;
    }

    public void setNodetype(String nodetype) {
        this.nodetype = nodetype == null ? null : nodetype.trim();
    }

    public String getNodename() {
        return nodename;
    }

    public void setNodename(String nodename) {
        this.nodename = nodename == null ? null : nodename.trim();
    }

    public String getNodesign() {
        return nodesign;
    }

    public void setNodesign(String nodesign) {
        this.nodesign = nodesign == null ? null : nodesign.trim();
    }

    public String getNodedescription() {
        return nodedescription;
    }

    public void setNodedescription(String nodedescription) {
        this.nodedescription = nodedescription == null ? null : nodedescription.trim();
    }

    public String getNodeformid() {
        return nodeformid;
    }

    public void setNodeformid(String nodeformid) {
        this.nodeformid = nodeformid == null ? null : nodeformid.trim();
    }

    public String getNodeformname() {
        return nodeformname;
    }

    public void setNodeformname(String nodeformname) {
        this.nodeformname = nodeformname == null ? null : nodeformname.trim();
    }

    public String getNoderoutertype() {
        return noderoutertype;
    }

    public void setNoderoutertype(String noderoutertype) {
        this.noderoutertype = noderoutertype == null ? null : noderoutertype.trim();
    }

    public String getNodepowercontrol() {
        return nodepowercontrol;
    }

    public void setNodepowercontrol(String nodepowercontrol) {
        this.nodepowercontrol = nodepowercontrol == null ? null : nodepowercontrol.trim();
    }

    public String getNodeweigh() {
        return nodeweigh;
    }

    public void setNodeweigh(String nodeweigh) {
        this.nodeweigh = nodeweigh == null ? null : nodeweigh.trim();
    }
}