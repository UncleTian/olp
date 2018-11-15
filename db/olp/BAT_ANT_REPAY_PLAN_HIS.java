package com.bea.olp;

public class BAT_ANT_REPAY_PLAN_HIS {
    private String contractNo;

    private Short termNo;

    private String startDate;

    private String endDate;

    private Short prinAmt;

    private Short intAmt;

    private String inputDate;

    private String inputTime;

    private String dataDate;

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    public Short getTermNo() {
        return termNo;
    }

    public void setTermNo(Short termNo) {
        this.termNo = termNo;
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