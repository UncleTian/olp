package com.bea.olp;

public class BIZ_ANT_INSTMNT_INIT extends BIZ_ANT_INSTMNT_INITKey {
    private String settleDate;

    private String startDate;

    private String endDate;

    private String status;

    private String clearDate;

    private String prinOvdDate;

    private String intOvdDate;

    private Short prinOvdDays;

    private Short intOvdDays;

    private Short prinBal;

    private Short intBal;

    private Short ovdPrinPnltBal;

    private Short ovdIntPnltBal;

    private String inputDate;

    private String inputTime;

    private String lastUpdateDate;

    private String lastUpdateTime;

    private String dataDate;

    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate == null ? null : settleDate.trim();
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate == null ? null : startDate.trim();
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate == null ? null : endDate.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getClearDate() {
        return clearDate;
    }

    public void setClearDate(String clearDate) {
        this.clearDate = clearDate == null ? null : clearDate.trim();
    }

    public String getPrinOvdDate() {
        return prinOvdDate;
    }

    public void setPrinOvdDate(String prinOvdDate) {
        this.prinOvdDate = prinOvdDate == null ? null : prinOvdDate.trim();
    }

    public String getIntOvdDate() {
        return intOvdDate;
    }

    public void setIntOvdDate(String intOvdDate) {
        this.intOvdDate = intOvdDate == null ? null : intOvdDate.trim();
    }

    public Short getPrinOvdDays() {
        return prinOvdDays;
    }

    public void setPrinOvdDays(Short prinOvdDays) {
        this.prinOvdDays = prinOvdDays;
    }

    public Short getIntOvdDays() {
        return intOvdDays;
    }

    public void setIntOvdDays(Short intOvdDays) {
        this.intOvdDays = intOvdDays;
    }

    public Short getPrinBal() {
        return prinBal;
    }

    public void setPrinBal(Short prinBal) {
        this.prinBal = prinBal;
    }

    public Short getIntBal() {
        return intBal;
    }

    public void setIntBal(Short intBal) {
        this.intBal = intBal;
    }

    public Short getOvdPrinPnltBal() {
        return ovdPrinPnltBal;
    }

    public void setOvdPrinPnltBal(Short ovdPrinPnltBal) {
        this.ovdPrinPnltBal = ovdPrinPnltBal;
    }

    public Short getOvdIntPnltBal() {
        return ovdIntPnltBal;
    }

    public void setOvdIntPnltBal(Short ovdIntPnltBal) {
        this.ovdIntPnltBal = ovdIntPnltBal;
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