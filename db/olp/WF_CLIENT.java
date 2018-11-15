package com.bea.olp;

public class WF_CLIENT {
    private String pkey;

    private String clientsign;

    private String clientname;

    private String ip;

    private String type;

    private String invoketype;

    private String status;

    private String remark;

    public String getPkey() {
        return pkey;
    }

    public void setPkey(String pkey) {
        this.pkey = pkey == null ? null : pkey.trim();
    }

    public String getClientsign() {
        return clientsign;
    }

    public void setClientsign(String clientsign) {
        this.clientsign = clientsign == null ? null : clientsign.trim();
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname == null ? null : clientname.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getInvoketype() {
        return invoketype;
    }

    public void setInvoketype(String invoketype) {
        this.invoketype = invoketype == null ? null : invoketype.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}