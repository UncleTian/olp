package com.bea.olp;

public class WF_GATHER_ACTION_RECORDEND {
    private String actionid;

    private String instanceid;

    private String maininstanceid;

    private String mainnodeid;

    private String mainnodename;

    private String transactor;

    private String transactorname;

    private String acttime;

    private String actionname;

    private String virtualdeptno;

    private String commentlevel;

    private String commenttype;

    private String suggest;

    private String memo;

    private String nextactorid;

    public String getActionid() {
        return actionid;
    }

    public void setActionid(String actionid) {
        this.actionid = actionid == null ? null : actionid.trim();
    }

    public String getInstanceid() {
        return instanceid;
    }

    public void setInstanceid(String instanceid) {
        this.instanceid = instanceid == null ? null : instanceid.trim();
    }

    public String getMaininstanceid() {
        return maininstanceid;
    }

    public void setMaininstanceid(String maininstanceid) {
        this.maininstanceid = maininstanceid == null ? null : maininstanceid.trim();
    }

    public String getMainnodeid() {
        return mainnodeid;
    }

    public void setMainnodeid(String mainnodeid) {
        this.mainnodeid = mainnodeid == null ? null : mainnodeid.trim();
    }

    public String getMainnodename() {
        return mainnodename;
    }

    public void setMainnodename(String mainnodename) {
        this.mainnodename = mainnodename == null ? null : mainnodename.trim();
    }

    public String getTransactor() {
        return transactor;
    }

    public void setTransactor(String transactor) {
        this.transactor = transactor == null ? null : transactor.trim();
    }

    public String getTransactorname() {
        return transactorname;
    }

    public void setTransactorname(String transactorname) {
        this.transactorname = transactorname == null ? null : transactorname.trim();
    }

    public String getActtime() {
        return acttime;
    }

    public void setActtime(String acttime) {
        this.acttime = acttime == null ? null : acttime.trim();
    }

    public String getActionname() {
        return actionname;
    }

    public void setActionname(String actionname) {
        this.actionname = actionname == null ? null : actionname.trim();
    }

    public String getVirtualdeptno() {
        return virtualdeptno;
    }

    public void setVirtualdeptno(String virtualdeptno) {
        this.virtualdeptno = virtualdeptno == null ? null : virtualdeptno.trim();
    }

    public String getCommentlevel() {
        return commentlevel;
    }

    public void setCommentlevel(String commentlevel) {
        this.commentlevel = commentlevel == null ? null : commentlevel.trim();
    }

    public String getCommenttype() {
        return commenttype;
    }

    public void setCommenttype(String commenttype) {
        this.commenttype = commenttype == null ? null : commenttype.trim();
    }

    public String getSuggest() {
        return suggest;
    }

    public void setSuggest(String suggest) {
        this.suggest = suggest == null ? null : suggest.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getNextactorid() {
        return nextactorid;
    }

    public void setNextactorid(String nextactorid) {
        this.nextactorid = nextactorid == null ? null : nextactorid.trim();
    }
}