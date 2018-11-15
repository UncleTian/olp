package com.bea.olp;

public class S_COM_CDE extends S_COM_CDEKey {
    private String comTypDesc;

    private String comDesc;

    private String superTyp;

    private String superCde;

    private String comSts;

    private String lastChgUsr;

    private String lastChgDt;

    private String odrCde;

    public String getComTypDesc() {
        return comTypDesc;
    }

    public void setComTypDesc(String comTypDesc) {
        this.comTypDesc = comTypDesc == null ? null : comTypDesc.trim();
    }

    public String getComDesc() {
        return comDesc;
    }

    public void setComDesc(String comDesc) {
        this.comDesc = comDesc == null ? null : comDesc.trim();
    }

    public String getSuperTyp() {
        return superTyp;
    }

    public void setSuperTyp(String superTyp) {
        this.superTyp = superTyp == null ? null : superTyp.trim();
    }

    public String getSuperCde() {
        return superCde;
    }

    public void setSuperCde(String superCde) {
        this.superCde = superCde == null ? null : superCde.trim();
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

    public String getOdrCde() {
        return odrCde;
    }

    public void setOdrCde(String odrCde) {
        this.odrCde = odrCde == null ? null : odrCde.trim();
    }
}