package com.bea.olp;

public class BAT_ANT_LOAN_INIT_HIS {
    private String contractNo;

    private String settleDate;

    private String status;

    private String clearDate;

    private String assetClass;

    private String accruedStatus;

    private String nextRepayDate;

    private Short unclearTerms;

    private Short ovdTerms;

    private Short prinOvdDays;

    private Short intOvdDays;

    private Short prinBal;

    private Short ovdPrinBal;

    private Short intBal;

    private Short ovdIntBal;

    private Short ovdPrinPnltBal;

    private Short ovdIntPnltBal;

    private String inputDate;

    private String inputTime;

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

    public String getAssetClass() {
        return assetClass;
    }

    public void setAssetClass(String assetClass) {
        this.assetClass = assetClass == null ? null : assetClass.trim();
    }

    public String getAccruedStatus() {
        return accruedStatus;
    }

    public void setAccruedStatus(String accruedStatus) {
        this.accruedStatus = accruedStatus == null ? null : accruedStatus.trim();
    }

    public String getNextRepayDate() {
        return nextRepayDate;
    }

    public void setNextRepayDate(String nextRepayDate) {
        this.nextRepayDate = nextRepayDate == null ? null : nextRepayDate.trim();
    }

    public Short getUnclearTerms() {
        return unclearTerms;
    }

    public void setUnclearTerms(Short unclearTerms) {
        this.unclearTerms = unclearTerms;
    }

    public Short getOvdTerms() {
        return ovdTerms;
    }

    public void setOvdTerms(Short ovdTerms) {
        this.ovdTerms = ovdTerms;
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

    public Short getOvdPrinBal() {
        return ovdPrinBal;
    }

    public void setOvdPrinBal(Short ovdPrinBal) {
        this.ovdPrinBal = ovdPrinBal;
    }

    public Short getIntBal() {
        return intBal;
    }

    public void setIntBal(Short intBal) {
        this.intBal = intBal;
    }

    public Short getOvdIntBal() {
        return ovdIntBal;
    }

    public void setOvdIntBal(Short ovdIntBal) {
        this.ovdIntBal = ovdIntBal;
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

    public String getDataDate() {
        return dataDate;
    }

    public void setDataDate(String dataDate) {
        this.dataDate = dataDate == null ? null : dataDate.trim();
    }
}