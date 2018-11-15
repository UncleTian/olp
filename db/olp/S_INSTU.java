package com.bea.olp;

public class S_INSTU {
    private String instuCde;

    private String instuName;

    private String joinDt;

    private String setlAcctNo;

    private String actvAcctNo;

    private String acctName;

    private String addr;

    private String zipCde;

    private String contTel;

    private String instuSts;

    private String lastChgUsr;

    private String lastChgDt;

    public String getInstuCde() {
        return instuCde;
    }

    public void setInstuCde(String instuCde) {
        this.instuCde = instuCde == null ? null : instuCde.trim();
    }

    public String getInstuName() {
        return instuName;
    }

    public void setInstuName(String instuName) {
        this.instuName = instuName == null ? null : instuName.trim();
    }

    public String getJoinDt() {
        return joinDt;
    }

    public void setJoinDt(String joinDt) {
        this.joinDt = joinDt == null ? null : joinDt.trim();
    }

    public String getSetlAcctNo() {
        return setlAcctNo;
    }

    public void setSetlAcctNo(String setlAcctNo) {
        this.setlAcctNo = setlAcctNo == null ? null : setlAcctNo.trim();
    }

    public String getActvAcctNo() {
        return actvAcctNo;
    }

    public void setActvAcctNo(String actvAcctNo) {
        this.actvAcctNo = actvAcctNo == null ? null : actvAcctNo.trim();
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName == null ? null : acctName.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getZipCde() {
        return zipCde;
    }

    public void setZipCde(String zipCde) {
        this.zipCde = zipCde == null ? null : zipCde.trim();
    }

    public String getContTel() {
        return contTel;
    }

    public void setContTel(String contTel) {
        this.contTel = contTel == null ? null : contTel.trim();
    }

    public String getInstuSts() {
        return instuSts;
    }

    public void setInstuSts(String instuSts) {
        this.instuSts = instuSts == null ? null : instuSts.trim();
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