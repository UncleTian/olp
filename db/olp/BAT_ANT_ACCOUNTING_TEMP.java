package com.bea.olp;

public class BAT_ANT_ACCOUNTING_TEMP {
    private String accountingType;

    private Long accountingAmt;

    private String inputDate;

    private String inputTime;

    private String dataDate;

    public String getAccountingType() {
        return accountingType;
    }

    public void setAccountingType(String accountingType) {
        this.accountingType = accountingType == null ? null : accountingType.trim();
    }

    public Long getAccountingAmt() {
        return accountingAmt;
    }

    public void setAccountingAmt(Long accountingAmt) {
        this.accountingAmt = accountingAmt;
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