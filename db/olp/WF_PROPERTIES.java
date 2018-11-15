package com.bea.olp;

public class WF_PROPERTIES {
    private String propkey;

    private String propvalue;

    private String memo;

    private String createtime;

    private String lastupdoprid;

    private String lastupdtime;

    public String getPropkey() {
        return propkey;
    }

    public void setPropkey(String propkey) {
        this.propkey = propkey == null ? null : propkey.trim();
    }

    public String getPropvalue() {
        return propvalue;
    }

    public void setPropvalue(String propvalue) {
        this.propvalue = propvalue == null ? null : propvalue.trim();
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

    public String getLastupdtime() {
        return lastupdtime;
    }

    public void setLastupdtime(String lastupdtime) {
        this.lastupdtime = lastupdtime == null ? null : lastupdtime.trim();
    }
}