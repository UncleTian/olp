package com.bea.olp;

import java.math.BigDecimal;

public class BAT_XW_BAL_TOL_HIS {
    private String acctCheckDate;

    private BigDecimal lastDayPrinBal;

    private BigDecimal currDayGrantTotlamt;

    private BigDecimal currDayRecycleTotlamt;

    private BigDecimal currDayLoanPrinBal;

    private BigDecimal lastDayReceivableIntBal;

    private BigDecimal currDayWithdrawRcbInt;

    private BigDecimal currDayRecycleInt;

    private BigDecimal currDayReceivableIntBal;

    private BigDecimal lastDayReceivablePnltBal;

    private BigDecimal currDayWithdrawRcbPnlt;

    private BigDecimal currDayRecyclePnlt;

    private BigDecimal currDayReceivablePnltBal;

    private BigDecimal currDayWriteoffTotlamt;

    private BigDecimal currDayWriteoffInt;

    private BigDecimal currDayWriteoffPnlt;

    private BigDecimal lastDayPayableAmtBal;

    private BigDecimal currDayPayableAmt;

    private BigDecimal currDayDeductAmt;

    private BigDecimal currDayPayableAmtBal;

    private BigDecimal currDayWriteoffAmt;

    private BigDecimal lastDayPayableDelayAmtBal;

    private BigDecimal currDayPayableDelayAmt;

    private BigDecimal currDayDeductDelayAmt;

    private BigDecimal currDayPayableDelayAmtBal;

    private BigDecimal currDayWriteoffDelayAmt;

    private String inputDate;

    private String inputTime;

    private String dataDate;

    public String getAcctCheckDate() {
        return acctCheckDate;
    }

    public void setAcctCheckDate(String acctCheckDate) {
        this.acctCheckDate = acctCheckDate == null ? null : acctCheckDate.trim();
    }

    public BigDecimal getLastDayPrinBal() {
        return lastDayPrinBal;
    }

    public void setLastDayPrinBal(BigDecimal lastDayPrinBal) {
        this.lastDayPrinBal = lastDayPrinBal;
    }

    public BigDecimal getCurrDayGrantTotlamt() {
        return currDayGrantTotlamt;
    }

    public void setCurrDayGrantTotlamt(BigDecimal currDayGrantTotlamt) {
        this.currDayGrantTotlamt = currDayGrantTotlamt;
    }

    public BigDecimal getCurrDayRecycleTotlamt() {
        return currDayRecycleTotlamt;
    }

    public void setCurrDayRecycleTotlamt(BigDecimal currDayRecycleTotlamt) {
        this.currDayRecycleTotlamt = currDayRecycleTotlamt;
    }

    public BigDecimal getCurrDayLoanPrinBal() {
        return currDayLoanPrinBal;
    }

    public void setCurrDayLoanPrinBal(BigDecimal currDayLoanPrinBal) {
        this.currDayLoanPrinBal = currDayLoanPrinBal;
    }

    public BigDecimal getLastDayReceivableIntBal() {
        return lastDayReceivableIntBal;
    }

    public void setLastDayReceivableIntBal(BigDecimal lastDayReceivableIntBal) {
        this.lastDayReceivableIntBal = lastDayReceivableIntBal;
    }

    public BigDecimal getCurrDayWithdrawRcbInt() {
        return currDayWithdrawRcbInt;
    }

    public void setCurrDayWithdrawRcbInt(BigDecimal currDayWithdrawRcbInt) {
        this.currDayWithdrawRcbInt = currDayWithdrawRcbInt;
    }

    public BigDecimal getCurrDayRecycleInt() {
        return currDayRecycleInt;
    }

    public void setCurrDayRecycleInt(BigDecimal currDayRecycleInt) {
        this.currDayRecycleInt = currDayRecycleInt;
    }

    public BigDecimal getCurrDayReceivableIntBal() {
        return currDayReceivableIntBal;
    }

    public void setCurrDayReceivableIntBal(BigDecimal currDayReceivableIntBal) {
        this.currDayReceivableIntBal = currDayReceivableIntBal;
    }

    public BigDecimal getLastDayReceivablePnltBal() {
        return lastDayReceivablePnltBal;
    }

    public void setLastDayReceivablePnltBal(BigDecimal lastDayReceivablePnltBal) {
        this.lastDayReceivablePnltBal = lastDayReceivablePnltBal;
    }

    public BigDecimal getCurrDayWithdrawRcbPnlt() {
        return currDayWithdrawRcbPnlt;
    }

    public void setCurrDayWithdrawRcbPnlt(BigDecimal currDayWithdrawRcbPnlt) {
        this.currDayWithdrawRcbPnlt = currDayWithdrawRcbPnlt;
    }

    public BigDecimal getCurrDayRecyclePnlt() {
        return currDayRecyclePnlt;
    }

    public void setCurrDayRecyclePnlt(BigDecimal currDayRecyclePnlt) {
        this.currDayRecyclePnlt = currDayRecyclePnlt;
    }

    public BigDecimal getCurrDayReceivablePnltBal() {
        return currDayReceivablePnltBal;
    }

    public void setCurrDayReceivablePnltBal(BigDecimal currDayReceivablePnltBal) {
        this.currDayReceivablePnltBal = currDayReceivablePnltBal;
    }

    public BigDecimal getCurrDayWriteoffTotlamt() {
        return currDayWriteoffTotlamt;
    }

    public void setCurrDayWriteoffTotlamt(BigDecimal currDayWriteoffTotlamt) {
        this.currDayWriteoffTotlamt = currDayWriteoffTotlamt;
    }

    public BigDecimal getCurrDayWriteoffInt() {
        return currDayWriteoffInt;
    }

    public void setCurrDayWriteoffInt(BigDecimal currDayWriteoffInt) {
        this.currDayWriteoffInt = currDayWriteoffInt;
    }

    public BigDecimal getCurrDayWriteoffPnlt() {
        return currDayWriteoffPnlt;
    }

    public void setCurrDayWriteoffPnlt(BigDecimal currDayWriteoffPnlt) {
        this.currDayWriteoffPnlt = currDayWriteoffPnlt;
    }

    public BigDecimal getLastDayPayableAmtBal() {
        return lastDayPayableAmtBal;
    }

    public void setLastDayPayableAmtBal(BigDecimal lastDayPayableAmtBal) {
        this.lastDayPayableAmtBal = lastDayPayableAmtBal;
    }

    public BigDecimal getCurrDayPayableAmt() {
        return currDayPayableAmt;
    }

    public void setCurrDayPayableAmt(BigDecimal currDayPayableAmt) {
        this.currDayPayableAmt = currDayPayableAmt;
    }

    public BigDecimal getCurrDayDeductAmt() {
        return currDayDeductAmt;
    }

    public void setCurrDayDeductAmt(BigDecimal currDayDeductAmt) {
        this.currDayDeductAmt = currDayDeductAmt;
    }

    public BigDecimal getCurrDayPayableAmtBal() {
        return currDayPayableAmtBal;
    }

    public void setCurrDayPayableAmtBal(BigDecimal currDayPayableAmtBal) {
        this.currDayPayableAmtBal = currDayPayableAmtBal;
    }

    public BigDecimal getCurrDayWriteoffAmt() {
        return currDayWriteoffAmt;
    }

    public void setCurrDayWriteoffAmt(BigDecimal currDayWriteoffAmt) {
        this.currDayWriteoffAmt = currDayWriteoffAmt;
    }

    public BigDecimal getLastDayPayableDelayAmtBal() {
        return lastDayPayableDelayAmtBal;
    }

    public void setLastDayPayableDelayAmtBal(BigDecimal lastDayPayableDelayAmtBal) {
        this.lastDayPayableDelayAmtBal = lastDayPayableDelayAmtBal;
    }

    public BigDecimal getCurrDayPayableDelayAmt() {
        return currDayPayableDelayAmt;
    }

    public void setCurrDayPayableDelayAmt(BigDecimal currDayPayableDelayAmt) {
        this.currDayPayableDelayAmt = currDayPayableDelayAmt;
    }

    public BigDecimal getCurrDayDeductDelayAmt() {
        return currDayDeductDelayAmt;
    }

    public void setCurrDayDeductDelayAmt(BigDecimal currDayDeductDelayAmt) {
        this.currDayDeductDelayAmt = currDayDeductDelayAmt;
    }

    public BigDecimal getCurrDayPayableDelayAmtBal() {
        return currDayPayableDelayAmtBal;
    }

    public void setCurrDayPayableDelayAmtBal(BigDecimal currDayPayableDelayAmtBal) {
        this.currDayPayableDelayAmtBal = currDayPayableDelayAmtBal;
    }

    public BigDecimal getCurrDayWriteoffDelayAmt() {
        return currDayWriteoffDelayAmt;
    }

    public void setCurrDayWriteoffDelayAmt(BigDecimal currDayWriteoffDelayAmt) {
        this.currDayWriteoffDelayAmt = currDayWriteoffDelayAmt;
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