package com.bea.olp;

public class S_DUTY extends S_DUTYKey {
    private String dutyDesc;

    private String dutySts;

    private String dutyRmk;

    private String lastChgDt;

    private String lastChgUsr;

    public String getDutyDesc() {
        return dutyDesc;
    }

    public void setDutyDesc(String dutyDesc) {
        this.dutyDesc = dutyDesc == null ? null : dutyDesc.trim();
    }

    public String getDutySts() {
        return dutySts;
    }

    public void setDutySts(String dutySts) {
        this.dutySts = dutySts == null ? null : dutySts.trim();
    }

    public String getDutyRmk() {
        return dutyRmk;
    }

    public void setDutyRmk(String dutyRmk) {
        this.dutyRmk = dutyRmk == null ? null : dutyRmk.trim();
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