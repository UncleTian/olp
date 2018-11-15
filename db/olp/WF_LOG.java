package com.bea.olp;

public class WF_LOG {
    private String logid;

    private String logtime;

    private String logtitle;

    private String logcontent;

    private String invoketype;

    private String sysid;

    private String instanceid;

    private String userid;

    private String orgid;

    private String bizseqno;

    private String sysip;

    private String wfid;

    private String wfname;

    private String custid;

    private String custname;

    private String useroperation;

    public String getLogid() {
        return logid;
    }

    public void setLogid(String logid) {
        this.logid = logid == null ? null : logid.trim();
    }

    public String getLogtime() {
        return logtime;
    }

    public void setLogtime(String logtime) {
        this.logtime = logtime == null ? null : logtime.trim();
    }

    public String getLogtitle() {
        return logtitle;
    }

    public void setLogtitle(String logtitle) {
        this.logtitle = logtitle == null ? null : logtitle.trim();
    }

    public String getLogcontent() {
        return logcontent;
    }

    public void setLogcontent(String logcontent) {
        this.logcontent = logcontent == null ? null : logcontent.trim();
    }

    public String getInvoketype() {
        return invoketype;
    }

    public void setInvoketype(String invoketype) {
        this.invoketype = invoketype == null ? null : invoketype.trim();
    }

    public String getSysid() {
        return sysid;
    }

    public void setSysid(String sysid) {
        this.sysid = sysid == null ? null : sysid.trim();
    }

    public String getInstanceid() {
        return instanceid;
    }

    public void setInstanceid(String instanceid) {
        this.instanceid = instanceid == null ? null : instanceid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getBizseqno() {
        return bizseqno;
    }

    public void setBizseqno(String bizseqno) {
        this.bizseqno = bizseqno == null ? null : bizseqno.trim();
    }

    public String getSysip() {
        return sysip;
    }

    public void setSysip(String sysip) {
        this.sysip = sysip == null ? null : sysip.trim();
    }

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

    public String getCustid() {
        return custid;
    }

    public void setCustid(String custid) {
        this.custid = custid == null ? null : custid.trim();
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname == null ? null : custname.trim();
    }

    public String getUseroperation() {
        return useroperation;
    }

    public void setUseroperation(String useroperation) {
        this.useroperation = useroperation == null ? null : useroperation.trim();
    }
}