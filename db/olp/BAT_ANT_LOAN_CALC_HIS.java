package com.bea.olp;

import java.math.BigDecimal;

public class BAT_ANT_LOAN_CALC_HIS {
    private String contractNo;

    private String calcDate;

    private String accruedStatus;

    private Short prinBal;

    private Short ovdPrinBal;

    private Short ovdIntBal;

    private BigDecimal realRate;

    private BigDecimal pnltRate;

    private Short intAmt;

    private Short ovdPrinPnltAmt;

    private Short ovdIntPnltAmt;

    private String inputDate;

    private String inputTime;

    private String dataDate;

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    public String getCalcDate() {
        return calcDate;
    }

    public void setCalcDate(String calcDate) {
        this.calcDate = calcDate == null ? null : calcDate.trim();
    }

    public String getAccruedStatus() {
        return accruedStatus;
    }

    public void setAccruedStatus(String accruedStatus) {
        this.accruedStatus = accruedStatus == null ? null : accruedStatus.trim();
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

    public Short getOvdIntBal() {
        return ovdIntBal;
    }

    public void setOvdIntBal(Short ovdIntBal) {
        this.ovdIntBal = ovdIntBal;
    }

    public BigDecimal getRealRate() {
        return realRate;
    }

    public void setRealRate(BigDecimal realRate) {
        this.realRate = realRate;
    }

    public BigDecimal getPnltRate() {
        return pnltRate;
    }

    public void setPnltRate(BigDecimal pnltRate) {
        this.pnltRate = pnltRate;
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

    public String getDataDate() {
        return dataDate;
    }

    public void setDataDate(String dataDate) {
        this.dataDate = dataDate == null ? null : dataDate.trim();
    }
}