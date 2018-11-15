package com.bea.olp;

import java.math.BigDecimal;

public class CFG_DIC extends CFG_DICKey {
    private String cnname;

    private String memo;

    private BigDecimal orderid;

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

    public BigDecimal getOrderid() {
        return orderid;
    }

    public void setOrderid(BigDecimal orderid) {
        this.orderid = orderid;
    }
}