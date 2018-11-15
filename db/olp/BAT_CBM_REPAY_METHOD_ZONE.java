package com.bea.olp;

import java.math.BigDecimal;

public class BAT_CBM_REPAY_METHOD_ZONE {
    private String serialno;

    private String objectno;

    private String termid;

    private String segfromdate;

    private String segtodate;

    private String status;

    private String firstduedate;

    private String defaultdueday;

    private String lastduedate;

    private String nextduedate;

    private String payfrequencytype;

    private BigDecimal seginstalmentamt;

    private String objecttype;

    private String pstype;

    private BigDecimal totalperiod;

    private BigDecimal currentperiod;

    private String inputDate;

    private String inputTime;

    private String dataDate;

    private String channelType;

    public String getSerialno() {
        return serialno;
    }

    public void setSerialno(String serialno) {
        this.serialno = serialno == null ? null : serialno.trim();
    }

    public String getObjectno() {
        return objectno;
    }

    public void setObjectno(String objectno) {
        this.objectno = objectno == null ? null : objectno.trim();
    }

    public String getTermid() {
        return termid;
    }

    public void setTermid(String termid) {
        this.termid = termid == null ? null : termid.trim();
    }

    public String getSegfromdate() {
        return segfromdate;
    }

    public void setSegfromdate(String segfromdate) {
        this.segfromdate = segfromdate == null ? null : segfromdate.trim();
    }

    public String getSegtodate() {
        return segtodate;
    }

    public void setSegtodate(String segtodate) {
        this.segtodate = segtodate == null ? null : segtodate.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getFirstduedate() {
        return firstduedate;
    }

    public void setFirstduedate(String firstduedate) {
        this.firstduedate = firstduedate == null ? null : firstduedate.trim();
    }

    public String getDefaultdueday() {
        return defaultdueday;
    }

    public void setDefaultdueday(String defaultdueday) {
        this.defaultdueday = defaultdueday == null ? null : defaultdueday.trim();
    }

    public String getLastduedate() {
        return lastduedate;
    }

    public void setLastduedate(String lastduedate) {
        this.lastduedate = lastduedate == null ? null : lastduedate.trim();
    }

    public String getNextduedate() {
        return nextduedate;
    }

    public void setNextduedate(String nextduedate) {
        this.nextduedate = nextduedate == null ? null : nextduedate.trim();
    }

    public String getPayfrequencytype() {
        return payfrequencytype;
    }

    public void setPayfrequencytype(String payfrequencytype) {
        this.payfrequencytype = payfrequencytype == null ? null : payfrequencytype.trim();
    }

    public BigDecimal getSeginstalmentamt() {
        return seginstalmentamt;
    }

    public void setSeginstalmentamt(BigDecimal seginstalmentamt) {
        this.seginstalmentamt = seginstalmentamt;
    }

    public String getObjecttype() {
        return objecttype;
    }

    public void setObjecttype(String objecttype) {
        this.objecttype = objecttype == null ? null : objecttype.trim();
    }

    public String getPstype() {
        return pstype;
    }

    public void setPstype(String pstype) {
        this.pstype = pstype == null ? null : pstype.trim();
    }

    public BigDecimal getTotalperiod() {
        return totalperiod;
    }

    public void setTotalperiod(BigDecimal totalperiod) {
        this.totalperiod = totalperiod;
    }

    public BigDecimal getCurrentperiod() {
        return currentperiod;
    }

    public void setCurrentperiod(BigDecimal currentperiod) {
        this.currentperiod = currentperiod;
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

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType == null ? null : channelType.trim();
    }
}