package com.bea.olp;

public class S_RESC_ACT extends S_RESC_ACTKey {
    private String rescActDesc;

    private String rescActFlag;

    private String rescActConfirm;

    private String lastChgDt;

    private String lastChgUsr;

    public String getRescActDesc() {
        return rescActDesc;
    }

    public void setRescActDesc(String rescActDesc) {
        this.rescActDesc = rescActDesc == null ? null : rescActDesc.trim();
    }

    public String getRescActFlag() {
        return rescActFlag;
    }

    public void setRescActFlag(String rescActFlag) {
        this.rescActFlag = rescActFlag == null ? null : rescActFlag.trim();
    }

    public String getRescActConfirm() {
        return rescActConfirm;
    }

    public void setRescActConfirm(String rescActConfirm) {
        this.rescActConfirm = rescActConfirm == null ? null : rescActConfirm.trim();
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