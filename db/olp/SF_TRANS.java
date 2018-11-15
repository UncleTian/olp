package com.bea.olp;

public class SF_TRANS {
    private String transId;

    private String transName;

    private String transPermission;

    private String transExt;

    private String transDesc;

    private String sysid;

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId == null ? null : transId.trim();
    }

    public String getTransName() {
        return transName;
    }

    public void setTransName(String transName) {
        this.transName = transName == null ? null : transName.trim();
    }

    public String getTransPermission() {
        return transPermission;
    }

    public void setTransPermission(String transPermission) {
        this.transPermission = transPermission == null ? null : transPermission.trim();
    }

    public String getTransExt() {
        return transExt;
    }

    public void setTransExt(String transExt) {
        this.transExt = transExt == null ? null : transExt.trim();
    }

    public String getTransDesc() {
        return transDesc;
    }

    public void setTransDesc(String transDesc) {
        this.transDesc = transDesc == null ? null : transDesc.trim();
    }

    public String getSysid() {
        return sysid;
    }

    public void setSysid(String sysid) {
        this.sysid = sysid == null ? null : sysid.trim();
    }
}