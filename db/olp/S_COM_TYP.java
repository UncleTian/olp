package com.bea.olp;

public class S_COM_TYP {
    private String comTyp;

    private String comTypDesc;

    private String modelId;

    private String comSts;

    private String lastChgUsr;

    private String lastChgDt;

    public String getComTyp() {
        return comTyp;
    }

    public void setComTyp(String comTyp) {
        this.comTyp = comTyp == null ? null : comTyp.trim();
    }

    public String getComTypDesc() {
        return comTypDesc;
    }

    public void setComTypDesc(String comTypDesc) {
        this.comTypDesc = comTypDesc == null ? null : comTypDesc.trim();
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId == null ? null : modelId.trim();
    }

    public String getComSts() {
        return comSts;
    }

    public void setComSts(String comSts) {
        this.comSts = comSts == null ? null : comSts.trim();
    }

    public String getLastChgUsr() {
        return lastChgUsr;
    }

    public void setLastChgUsr(String lastChgUsr) {
        this.lastChgUsr = lastChgUsr == null ? null : lastChgUsr.trim();
    }

    public String getLastChgDt() {
        return lastChgDt;
    }

    public void setLastChgDt(String lastChgDt) {
        this.lastChgDt = lastChgDt == null ? null : lastChgDt.trim();
    }
}