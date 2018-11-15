package com.bea.olp;

import java.math.BigDecimal;

public class S_DIC {
    private String dicpk;

    private String enname;

    private String cnname;

    private String opttype;

    private String memo;

    private String flag;

    private String levels;

    private BigDecimal orderid;

    public String getDicpk() {
        return dicpk;
    }

    public void setDicpk(String dicpk) {
        this.dicpk = dicpk == null ? null : dicpk.trim();
    }

    public String getEnname() {
        return enname;
    }

    public void setEnname(String enname) {
        this.enname = enname == null ? null : enname.trim();
    }

    public String getCnname() {
        return cnname;
    }

    public void setCnname(String cnname) {
        this.cnname = cnname == null ? null : cnname.trim();
    }

    public String getOpttype() {
        return opttype;
    }

    public void setOpttype(String opttype) {
        this.opttype = opttype == null ? null : opttype.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getLevels() {
        return levels;
    }

    public void setLevels(String levels) {
        this.levels = levels == null ? null : levels.trim();
    }

    public BigDecimal getOrderid() {
        return orderid;
    }

    public void setOrderid(BigDecimal orderid) {
        this.orderid = orderid;
    }
}