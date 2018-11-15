package com.bea.olp;

import java.math.BigDecimal;

public class WF_NODE_RECORDEND extends WF_NODE_RECORDENDKey {
    private String wfid;

    private String wfname;

    private String nodename;

    private String nodesign;

    private String nodenumber;

    private String nodestarttime;

    private String nodeendtime;

    private String nodeaccepttime;

    private String nodestatus;

    private String nodeplanendtime;

    private BigDecimal costtimes;

    private String currentnodeusers;

    private String currentnodeuser;

    private String currentnodeprocessors;

    private String originalusers;

    private String nodemulteit;

    private String nodeusermodifytype;

    private String nodeweigh;

    private String orgid;

    private String roleid;

    public String getWfid() {
        return wfid;
    }

    public void setWfid(String wfid) {
        this.wfid = wfid == null ? null : wfid.trim();
    }

    public String getWfname() {
        return wfname;
    }

    public void setWfname(String wfname) {
        this.wfname = wfname == null ? null : wfname.trim();
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

    public String getNodenumber() {
        return nodenumber;
    }

    public void setNodenumber(String nodenumber) {
        this.nodenumber = nodenumber == null ? null : nodenumber.trim();
    }

    public String getNodestarttime() {
        return nodestarttime;
    }

    public void setNodestarttime(String nodestarttime) {
        this.nodestarttime = nodestarttime == null ? null : nodestarttime.trim();
    }

    public String getNodeendtime() {
        return nodeendtime;
    }

    public void setNodeendtime(String nodeendtime) {
        this.nodeendtime = nodeendtime == null ? null : nodeendtime.trim();
    }

    public String getNodeaccepttime() {
        return nodeaccepttime;
    }

    public void setNodeaccepttime(String nodeaccepttime) {
        this.nodeaccepttime = nodeaccepttime == null ? null : nodeaccepttime.trim();
    }

    public String getNodestatus() {
        return nodestatus;
    }

    public void setNodestatus(String nodestatus) {
        this.nodestatus = nodestatus == null ? null : nodestatus.trim();
    }

    public String getNodeplanendtime() {
        return nodeplanendtime;
    }

    public void setNodeplanendtime(String nodeplanendtime) {
        this.nodeplanendtime = nodeplanendtime == null ? null : nodeplanendtime.trim();
    }

    public BigDecimal getCosttimes() {
        return costtimes;
    }

    public void setCosttimes(BigDecimal costtimes) {
        this.costtimes = costtimes;
    }

    public String getCurrentnodeusers() {
        return currentnodeusers;
    }

    public void setCurrentnodeusers(String currentnodeusers) {
        this.currentnodeusers = currentnodeusers == null ? null : currentnodeusers.trim();
    }

    public String getCurrentnodeuser() {
        return currentnodeuser;
    }

    public void setCurrentnodeuser(String currentnodeuser) {
        this.currentnodeuser = currentnodeuser == null ? null : currentnodeuser.trim();
    }

    public String getCurrentnodeprocessors() {
        return currentnodeprocessors;
    }

    public void setCurrentnodeprocessors(String currentnodeprocessors) {
        this.currentnodeprocessors = currentnodeprocessors == null ? null : currentnodeprocessors.trim();
    }

    public String getOriginalusers() {
        return originalusers;
    }

    public void setOriginalusers(String originalusers) {
        this.originalusers = originalusers == null ? null : originalusers.trim();
    }

    public String getNodemulteit() {
        return nodemulteit;
    }

    public void setNodemulteit(String nodemulteit) {
        this.nodemulteit = nodemulteit == null ? null : nodemulteit.trim();
    }

    public String getNodeusermodifytype() {
        return nodeusermodifytype;
    }

    public void setNodeusermodifytype(String nodeusermodifytype) {
        this.nodeusermodifytype = nodeusermodifytype == null ? null : nodeusermodifytype.trim();
    }

    public String getNodeweigh() {
        return nodeweigh;
    }

    public void setNodeweigh(String nodeweigh) {
        this.nodeweigh = nodeweigh == null ? null : nodeweigh.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }
}