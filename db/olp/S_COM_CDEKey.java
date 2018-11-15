package com.bea.olp;

public class S_COM_CDEKey {
    private String comTyp;

    private String comCde;

    private String instuCde;

    public String getComTyp() {
        return comTyp;
    }

    public void setComTyp(String comTyp) {
        this.comTyp = comTyp == null ? null : comTyp.trim();
    }

    public String getComCde() {
        return comCde;
    }

    public void setComCde(String comCde) {
        this.comCde = comCde == null ? null : comCde.trim();
    }

    public String getInstuCde() {
        return instuCde;
    }

    public void setInstuCde(String instuCde) {
        this.instuCde = instuCde == null ? null : instuCde.trim();
    }
}