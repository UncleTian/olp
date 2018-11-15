package com.bea.olp;

public class WFI_NODE2BIZ extends WFI_NODE2BIZKey {
    private String nodename;

    private String nodeAppUrl;

    private String nodeBizUrl;

    public String getNodename() {
        return nodename;
    }

    public void setNodename(String nodename) {
        this.nodename = nodename == null ? null : nodename.trim();
    }

    public String getNodeAppUrl() {
        return nodeAppUrl;
    }

    public void setNodeAppUrl(String nodeAppUrl) {
        this.nodeAppUrl = nodeAppUrl == null ? null : nodeAppUrl.trim();
    }

    public String getNodeBizUrl() {
        return nodeBizUrl;
    }

    public void setNodeBizUrl(String nodeBizUrl) {
        this.nodeBizUrl = nodeBizUrl == null ? null : nodeBizUrl.trim();
    }
}