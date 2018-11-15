package com.bea.olp;

public class BIZ_ANT_ARG_STATUS_CHANGE {
    private String contractNo;

    private String settleDate;

    private String seqNo;

    private String eventCode;

    private String beforeStatus;

    private String afterStatus;

    private Short prinAmt;

    private Short intAmt;

    private Short ovdPrinPnltAmt;

    private Short ovdIntPnltAmt;

    private String inputDate;

    private String inputTime;

    private String lastUpdateDate;

    private String lastUpdateTime;

    private String dataDate;

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate == null ? null : settleDate.trim();
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo == null ? null : seqNo.trim();
    }

    public String getEventCode() {
        return eventCode;
    }

    public void setEventCode(String eventCode) {
        this.eventCode = eventCode == null ? null : eventCode.trim();
    }

    public String getBeforeStatus() {
        return beforeStatus;
    }

    public void setBeforeStatus(String beforeStatus) {
        this.beforeStatus = beforeStatus == null ? null : beforeStatus.trim();
    }

    public String getAfterStatus() {
        return afterStatus;
    }

    public void setAfterStatus(String afterStatus) {
        this.afterStatus = afterStatus == null ? null : afterStatus.trim();
    }

    public Short getPrinAmt() {
        return prinAmt;
    }

    public void setPrinAmt(Short prinAmt) {
        this.prinAmt = prinAmt;
    }

    public Short getIntAmt() {
        return intAmt;
    }

    public void setIntAmt(Short intAmt) {
        this.intAmt = intAmt;
    }

    public Short getOvdPrinPnltAmt() {
        return ovdPrinPnltAmt;
    }

    public void setOvdPrinPnltAmt(Short ovdPrinPnltAmt) {
        this.ovdPrinPnltAmt = ovdPrinPnltAmt;
    }

    public Short getOvdIntPnltAmt() {
        return ovdIntPnltAmt;
    }

    public void setOvdIntPnltAmt(Short ovdIntPnltAmt) {
        this.ovdIntPnltAmt = ovdIntPnltAmt;
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

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate == null ? null : lastUpdateDate.trim();
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime == null ? null : lastUpdateTime.trim();
    }

    public String getDataDate() {
        return dataDate;
    }

    public void setDataDate(String dataDate) {
        this.dataDate = dataDate == null ? null : dataDate.trim();
    }
}