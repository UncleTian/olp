package com.bea.olp;

public class CTR_LOAN_LOG {
    private String logSerno;

    private String billNo;

    private Short seq;

    private String logInfo;

    private String inputTime;

    public String getLogSerno() {
        return logSerno;
    }

    public void setLogSerno(String logSerno) {
        this.logSerno = logSerno == null ? null : logSerno.trim();
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
    }

    public Short getSeq() {
        return seq;
    }

    public void setSeq(Short seq) {
        this.seq = seq;
    }

    public String getLogInfo() {
        return logInfo;
    }

    public void setLogInfo(String logInfo) {
        this.logInfo = logInfo == null ? null : logInfo.trim();
    }

    public String getInputTime() {
        return inputTime;
    }

    public void setInputTime(String inputTime) {
        this.inputTime = inputTime == null ? null : inputTime.trim();
    }
}