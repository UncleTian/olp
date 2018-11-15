package com.bea.olp;

public class WF_TREE_DIC {
    private String itempk;

    private String itemid;

    private String itemname;

    private String treetype;

    private String supitempk;

    private String memo;

    private String createduserid;

    private String createdtime;

    private String lastupdoprid;

    private String lastupdpgmid;

    private String lastupdtime;

    public String getItempk() {
        return itempk;
    }

    public void setItempk(String itempk) {
        this.itempk = itempk == null ? null : itempk.trim();
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
    }

    public String getTreetype() {
        return treetype;
    }

    public void setTreetype(String treetype) {
        this.treetype = treetype == null ? null : treetype.trim();
    }

    public String getSupitempk() {
        return supitempk;
    }

    public void setSupitempk(String supitempk) {
        this.supitempk = supitempk == null ? null : supitempk.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getCreateduserid() {
        return createduserid;
    }

    public void setCreateduserid(String createduserid) {
        this.createduserid = createduserid == null ? null : createduserid.trim();
    }

    public String getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(String createdtime) {
        this.createdtime = createdtime == null ? null : createdtime.trim();
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