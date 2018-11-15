package com.bea.olp;

import java.math.BigDecimal;

public class BAT_CBM_BFJ_BAL_DET {
    private String serialno;

    private String provisionsAccount;

    private String transDate;

    private BigDecimal amt;

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

    public String getProvisionsAccount() {
        return provisionsAccount;
    }

    public void setProvisionsAccount(String provisionsAccount) {
        this.provisionsAccount = provisionsAccount == null ? null : provisionsAccount.trim();
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate == null ? null : transDate.trim();
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
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