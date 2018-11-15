package com.bea.olp;

import java.math.BigDecimal;

public class WF_COMMENT {
    private String commentid;

    private String nodeactionid;

    private String instanceid;

    private String nodeid;

    private String nodename;

    private String userid;

    private String username;

    private String appendrole;

    private String commenttime;

    private String commenttype;

    private BigDecimal commentlevel;

    private String commentsign;

    private String commentcontent;

    private String commentreaders;

    private String orgid;

    public String getCommentid() {
        return commentid;
    }

    public void setCommentid(String commentid) {
        this.commentid = commentid == null ? null : commentid.trim();
    }

    public String getNodeactionid() {
        return nodeactionid;
    }

    public void setNodeactionid(String nodeactionid) {
        this.nodeactionid = nodeactionid == null ? null : nodeactionid.trim();
    }

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

    public String getNodename() {
        return nodename;
    }

    public void setNodename(String nodename) {
        this.nodename = nodename == null ? null : nodename.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getAppendrole() {
        return appendrole;
    }

    public void setAppendrole(String appendrole) {
        this.appendrole = appendrole == null ? null : appendrole.trim();
    }

    public String getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(String commenttime) {
        this.commenttime = commenttime == null ? null : commenttime.trim();
    }

    public String getCommenttype() {
        return commenttype;
    }

    public void setCommenttype(String commenttype) {
        this.commenttype = commenttype == null ? null : commenttype.trim();
    }

    public BigDecimal getCommentlevel() {
        return commentlevel;
    }

    public void setCommentlevel(BigDecimal commentlevel) {
        this.commentlevel = commentlevel;
    }

    public String getCommentsign() {
        return commentsign;
    }

    public void setCommentsign(String commentsign) {
        this.commentsign = commentsign == null ? null : commentsign.trim();
    }

    public String getCommentcontent() {
        return commentcontent;
    }

    public void setCommentcontent(String commentcontent) {
        this.commentcontent = commentcontent == null ? null : commentcontent.trim();
    }

    public String getCommentreaders() {
        return commentreaders;
    }

    public void setCommentreaders(String commentreaders) {
        this.commentreaders = commentreaders == null ? null : commentreaders.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }
}