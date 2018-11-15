package com.bea.olp;

public class S_MSG {
    private String msgCde;

    private String msgDesc;

    private String msgLevel;

    private String msgSts;

    private String lastChgDt;

    private String lastChgUsr;

    private String msgTyp;

    public String getMsgCde() {
        return msgCde;
    }

    public void setMsgCde(String msgCde) {
        this.msgCde = msgCde == null ? null : msgCde.trim();
    }

    public String getMsgDesc() {
        return msgDesc;
    }

    public void setMsgDesc(String msgDesc) {
        this.msgDesc = msgDesc == null ? null : msgDesc.trim();
    }

    public String getMsgLevel() {
        return msgLevel;
    }

    public void setMsgLevel(String msgLevel) {
        this.msgLevel = msgLevel == null ? null : msgLevel.trim();
    }

    public String getMsgSts() {
        return msgSts;
    }

    public void setMsgSts(String msgSts) {
        this.msgSts = msgSts == null ? null : msgSts.trim();
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

    public String getMsgTyp() {
        return msgTyp;
    }

    public void setMsgTyp(String msgTyp) {
        this.msgTyp = msgTyp == null ? null : msgTyp.trim();
    }
}