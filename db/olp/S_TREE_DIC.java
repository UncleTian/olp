package com.bea.olp;

import java.math.BigDecimal;

public class S_TREE_DIC {
    private String enName;

    private String cnName;

    private String abvenName;

    private String locate;

    private String optType;

    private String memo;

    private String flag;

    private String levels;

    private BigDecimal orderId;

    private String lastChgDt;

    private String lastChgUsr;

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName == null ? null : cnName.trim();
    }

    public String getAbvenName() {
        return abvenName;
    }

    public void setAbvenName(String abvenName) {
        this.abvenName = abvenName == null ? null : abvenName.trim();
    }

    public String getLocate() {
        return locate;
    }

    public void setLocate(String locate) {
        this.locate = locate == null ? null : locate.trim();
    }

    public String getOptType() {
        return optType;
    }

    public void setOptType(String optType) {
        this.optType = optType == null ? null : optType.trim();
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

    public BigDecimal getOrderId() {
        return orderId;
    }

    public void setOrderId(BigDecimal orderId) {
        this.orderId = orderId;
    }

    public String getLastChgDt() {
        return lastChgDt;
    }

    public void setLastChgDt(String lastChgDt) {
        this.lastChgDt = lastChgDt == null ? null : lastChgDt.trim();
    }

    public String getLastChgUsr() {
        return lastChgUsr;
    }

    public void setLastChgUsr(String lastChgUsr) {
        this.lastChgUsr = lastChgUsr == null ? null : lastChgUsr.trim();
    }
}