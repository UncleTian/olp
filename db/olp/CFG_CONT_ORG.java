package com.bea.olp;

public class CFG_CONT_ORG {
    private String contTextOrg;

    private String orgCnName;

    private String orgAddr;

    private String orgTel;

    private String inputTime;

    private String inputId;

    private String inputBrId;

    private String lastUpdateTime;

    private String lastUpdateId;

    public String getContTextOrg() {
        return contTextOrg;
    }

    public void setContTextOrg(String contTextOrg) {
        this.contTextOrg = contTextOrg == null ? null : contTextOrg.trim();
    }

    public String getOrgCnName() {
        return orgCnName;
    }

    public void setOrgCnName(String orgCnName) {
        this.orgCnName = orgCnName == null ? null : orgCnName.trim();
    }

    public String getOrgAddr() {
        return orgAddr;
    }

    public void setOrgAddr(String orgAddr) {
        this.orgAddr = orgAddr == null ? null : orgAddr.trim();
    }

    public String getOrgTel() {
        return orgTel;
    }

    public void setOrgTel(String orgTel) {
        this.orgTel = orgTel == null ? null : orgTel.trim();
    }

    public String getInputTime() {
        return inputTime;
    }

    public void setInputTime(String inputTime) {
        this.inputTime = inputTime == null ? null : inputTime.trim();
    }

    public String getInputId() {
        return inputId;
    }

    public void setInputId(String inputId) {
        this.inputId = inputId == null ? null : inputId.trim();
    }

    public String getInputBrId() {
        return inputBrId;
    }

    public void setInputBrId(String inputBrId) {
        this.inputBrId = inputBrId == null ? null : inputBrId.trim();
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime == null ? null : lastUpdateTime.trim();
    }

    public String getLastUpdateId() {
        return lastUpdateId;
    }

    public void setLastUpdateId(String lastUpdateId) {
        this.lastUpdateId = lastUpdateId == null ? null : lastUpdateId.trim();
    }
}