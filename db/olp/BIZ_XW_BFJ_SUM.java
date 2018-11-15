package com.bea.olp;

import java.math.BigDecimal;

public class BIZ_XW_BFJ_SUM extends BIZ_XW_BFJ_SUMKey {
    private BigDecimal acctAmt;

    private String inputDate;

    private String inputTime;

    private String dataDate;

    private String lastUpdateDate;

    private String lastUpdateTime;

    public BigDecimal getAcctAmt() {
        return acctAmt;
    }

    public void setAcctAmt(BigDecimal acctAmt) {
        this.acctAmt = acctAmt;
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
}