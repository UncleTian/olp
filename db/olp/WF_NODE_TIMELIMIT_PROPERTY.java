package com.bea.olp;

public class WF_NODE_TIMELIMIT_PROPERTY {
    private String nodeid;

    private String wfid;

    private String nodetimelimitnotification;

    private String nodedurationtime;

    private String nodetimelimitefficient;

    private String nodetimelimitrepeat;

    private String nodetimelimitrepeattimes;

    private String nodeafterduration;

    private String awoketype;

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

    public String getNodetimelimitnotification() {
        return nodetimelimitnotification;
    }

    public void setNodetimelimitnotification(String nodetimelimitnotification) {
        this.nodetimelimitnotification = nodetimelimitnotification == null ? null : nodetimelimitnotification.trim();
    }

    public String getNodedurationtime() {
        return nodedurationtime;
    }

    public void setNodedurationtime(String nodedurationtime) {
        this.nodedurationtime = nodedurationtime == null ? null : nodedurationtime.trim();
    }

    public String getNodetimelimitefficient() {
        return nodetimelimitefficient;
    }

    public void setNodetimelimitefficient(String nodetimelimitefficient) {
        this.nodetimelimitefficient = nodetimelimitefficient == null ? null : nodetimelimitefficient.trim();
    }

    public String getNodetimelimitrepeat() {
        return nodetimelimitrepeat;
    }

    public void setNodetimelimitrepeat(String nodetimelimitrepeat) {
        this.nodetimelimitrepeat = nodetimelimitrepeat == null ? null : nodetimelimitrepeat.trim();
    }

    public String getNodetimelimitrepeattimes() {
        return nodetimelimitrepeattimes;
    }

    public void setNodetimelimitrepeattimes(String nodetimelimitrepeattimes) {
        this.nodetimelimitrepeattimes = nodetimelimitrepeattimes == null ? null : nodetimelimitrepeattimes.trim();
    }

    public String getNodeafterduration() {
        return nodeafterduration;
    }

    public void setNodeafterduration(String nodeafterduration) {
        this.nodeafterduration = nodeafterduration == null ? null : nodeafterduration.trim();
    }

    public String getAwoketype() {
        return awoketype;
    }

    public void setAwoketype(String awoketype) {
        this.awoketype = awoketype == null ? null : awoketype.trim();
    }
}