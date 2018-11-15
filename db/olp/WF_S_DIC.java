package com.bea.olp;

public class WF_S_DIC extends WF_S_DICKey {
    private String cnname;

    private String memo;

    private String createtime;

    private String lastupdoprid;

    private String lastupdpgmid;

    private String lastupdtime;

    public String getCnname() {
        return cnname;
    }

    public void setCnname(String cnname) {
        this.cnname = cnname == null ? null : cnname.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getLastupdoprid() {
        return lastupdoprid;
    }

    public void setLastupdoprid(String lastupdoprid) {
        this.lastupdoprid = lastupdoprid == null ? null : lastupdoprid.trim();
    }

    public String getLastupdpgmid() {
        return lastupdpgmid;
    }

    public void setLastupdpgmid(String lastupdpgmid) {
        this.lastupdpgmid = lastupdpgmid == null ? null : lastupdpgmid.trim();
    }

    public String getLastupdtime() {
        return lastupdtime;
    }

    public void setLastupdtime(String lastupdtime) {
        this.lastupdtime = lastupdtime == null ? null : lastupdtime.trim();
    }
}