package com.bea.olp;

public class CFG_CALLBACK_ADDR {
    private String prdCode;

    private String senceId;

    private String interfaceType;

    private String noticeAddr;

    private String noticePort;

    private String dealClass;

    private String fullAddr;

    private String inputDate;

    private String inputTime;

    private String lastUpdateTime;

    public String getPrdCode() {
        return prdCode;
    }

    public void setPrdCode(String prdCode) {
        this.prdCode = prdCode == null ? null : prdCode.trim();
    }

    public String getSenceId() {
        return senceId;
    }

    public void setSenceId(String senceId) {
        this.senceId = senceId == null ? null : senceId.trim();
    }

    public String getInterfaceType() {
        return interfaceType;
    }

    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType == null ? null : interfaceType.trim();
    }

    public String getNoticeAddr() {
        return noticeAddr;
    }

    public void setNoticeAddr(String noticeAddr) {
        this.noticeAddr = noticeAddr == null ? null : noticeAddr.trim();
    }

    public String getNoticePort() {
        return noticePort;
    }

    public void setNoticePort(String noticePort) {
        this.noticePort = noticePort == null ? null : noticePort.trim();
    }

    public String getDealClass() {
        return dealClass;
    }

    public void setDealClass(String dealClass) {
        this.dealClass = dealClass == null ? null : dealClass.trim();
    }

    public String getFullAddr() {
        return fullAddr;
    }

    public void setFullAddr(String fullAddr) {
        this.fullAddr = fullAddr == null ? null : fullAddr.trim();
    }

    public String getInputDate() {
        return inputDate;
    }

    public void setInputDate(String inputDate) {
        this.inputDate = inputDate == null ? null : inputDate.trim();
    }

    public String getInputTime() {
        return inputTime;
    }

    public void setInputTime(String inputTime) {
        this.inputTime = inputTime == null ? null : inputTime.trim();
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime == null ? null : lastUpdateTime.trim();
    }
}