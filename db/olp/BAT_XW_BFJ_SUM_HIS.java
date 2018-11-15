package com.bea.olp;

import java.math.BigDecimal;

public class BAT_XW_BFJ_SUM_HIS {
    private String provisionsAcct;

    private String tdDate;

    private BigDecimal acctAmt;

    private String inputDate;

    private String inputTime;

    private String dataDate;

    public String getProvisionsAcct() {
        return provisionsAcct;
    }

    public void setProvisionsAcct(String provisionsAcct) {
        this.provisionsAcct = provisionsAcct == null ? null : provisionsAcct.trim();
    }

    public String getTdDate() {
        return tdDate;
    }

    public void setTdDate(String tdDate) {
        this.tdDate = tdDate == null ? null : tdDate.trim();
    }

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
}