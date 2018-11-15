package com.bea.olp;

public class SHORTCUT_CFG {
    private String sid;

    private String tip;

    private String url;

    private String rescId;

    private String rescIcon;

    private String sctype;

    private Long orderid;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip == null ? null : tip.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getRescId() {
        return rescId;
    }

    public void setRescId(String rescId) {
        this.rescId = rescId == null ? null : rescId.trim();
    }

    public String getRescIcon() {
        return rescIcon;
    }

    public void setRescIcon(String rescIcon) {
        this.rescIcon = rescIcon == null ? null : rescIcon.trim();
    }

    public String getSctype() {
        return sctype;
    }

    public void setSctype(String sctype) {
        this.sctype = sctype == null ? null : sctype.trim();
    }

    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }
}