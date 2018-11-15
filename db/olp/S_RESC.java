package com.bea.olp;

public class S_RESC {
    private String rescCde;

    private String rescDesc;

    private String rescSystempk;

    private String rescUrl;

    private String rescParentid;

    private String rescTabNam;

    private String rescProcid;

    private String rescOrderid;

    private String rescIcon;

    private String rescRmk;

    private String lastChgDt;

    private String lastChgUsr;

    public String getRescCde() {
        return rescCde;
    }

    public void setRescCde(String rescCde) {
        this.rescCde = rescCde == null ? null : rescCde.trim();
    }

    public String getRescDesc() {
        return rescDesc;
    }

    public void setRescDesc(String rescDesc) {
        this.rescDesc = rescDesc == null ? null : rescDesc.trim();
    }

    public String getRescSystempk() {
        return rescSystempk;
    }

    public void setRescSystempk(String rescSystempk) {
        this.rescSystempk = rescSystempk == null ? null : rescSystempk.trim();
    }

    public String getRescUrl() {
        return rescUrl;
    }

    public void setRescUrl(String rescUrl) {
        this.rescUrl = rescUrl == null ? null : rescUrl.trim();
    }

    public String getRescParentid() {
        return rescParentid;
    }

    public void setRescParentid(String rescParentid) {
        this.rescParentid = rescParentid == null ? null : rescParentid.trim();
    }

    public String getRescTabNam() {
        return rescTabNam;
    }

    public void setRescTabNam(String rescTabNam) {
        this.rescTabNam = rescTabNam == null ? null : rescTabNam.trim();
    }

    public String getRescProcid() {
        return rescProcid;
    }

    public void setRescProcid(String rescProcid) {
        this.rescProcid = rescProcid == null ? null : rescProcid.trim();
    }

    public String getRescOrderid() {
        return rescOrderid;
    }

    public void setRescOrderid(String rescOrderid) {
        this.rescOrderid = rescOrderid == null ? null : rescOrderid.trim();
    }

    public String getRescIcon() {
        return rescIcon;
    }

    public void setRescIcon(String rescIcon) {
        this.rescIcon = rescIcon == null ? null : rescIcon.trim();
    }

    public String getRescRmk() {
        return rescRmk;
    }

    public void setRescRmk(String rescRmk) {
        this.rescRmk = rescRmk == null ? null : rescRmk.trim();
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