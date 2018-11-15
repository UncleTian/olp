package com.bea.olp;

import java.math.BigDecimal;

public class BAT_CBM_REPAY_TRAN_BILL_INFO {
    private String serialno;

    private String objecttype;

    private String objectno;

    private String actualpaydate;

    private String currency;

    private BigDecimal payamt;

    private BigDecimal actualpayamt;

    private String prepaytype;

    private BigDecimal prepayamt;

    private BigDecimal prepayprincipalamt;

    private BigDecimal prepayinterestamt;

    private BigDecimal payprincipalamt;

    private BigDecimal actualpayprincipalamt;

    private BigDecimal payinterestamt;

    private BigDecimal actualpayinterestamt;

    private BigDecimal payprincipalpenaltyamt;

    private BigDecimal actualpayprincipalpenaltyamt;

    private BigDecimal payinterestpenaltyamt;

    private BigDecimal actualpayinterestpenaltyamt;

    private String accountingorgid;

    private String prepayamtflag;

    private String autopayflag;

    private String payrule;

    private String paysort;

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

    public String getObjecttype() {
        return objecttype;
    }

    public void setObjecttype(String objecttype) {
        this.objecttype = objecttype == null ? null : objecttype.trim();
    }

    public String getObjectno() {
        return objectno;
    }

    public void setObjectno(String objectno) {
        this.objectno = objectno == null ? null : objectno.trim();
    }

    public String getActualpaydate() {
        return actualpaydate;
    }

    public void setActualpaydate(String actualpaydate) {
        this.actualpaydate = actualpaydate == null ? null : actualpaydate.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public BigDecimal getPayamt() {
        return payamt;
    }

    public void setPayamt(BigDecimal payamt) {
        this.payamt = payamt;
    }

    public BigDecimal getActualpayamt() {
        return actualpayamt;
    }

    public void setActualpayamt(BigDecimal actualpayamt) {
        this.actualpayamt = actualpayamt;
    }

    public String getPrepaytype() {
        return prepaytype;
    }

    public void setPrepaytype(String prepaytype) {
        this.prepaytype = prepaytype == null ? null : prepaytype.trim();
    }

    public BigDecimal getPrepayamt() {
        return prepayamt;
    }

    public void setPrepayamt(BigDecimal prepayamt) {
        this.prepayamt = prepayamt;
    }

    public BigDecimal getPrepayprincipalamt() {
        return prepayprincipalamt;
    }

    public void setPrepayprincipalamt(BigDecimal prepayprincipalamt) {
        this.prepayprincipalamt = prepayprincipalamt;
    }

    public BigDecimal getPrepayinterestamt() {
        return prepayinterestamt;
    }

    public void setPrepayinterestamt(BigDecimal prepayinterestamt) {
        this.prepayinterestamt = prepayinterestamt;
    }

    public BigDecimal getPayprincipalamt() {
        return payprincipalamt;
    }

    public void setPayprincipalamt(BigDecimal payprincipalamt) {
        this.payprincipalamt = payprincipalamt;
    }

    public BigDecimal getActualpayprincipalamt() {
        return actualpayprincipalamt;
    }

    public void setActualpayprincipalamt(BigDecimal actualpayprincipalamt) {
        this.actualpayprincipalamt = actualpayprincipalamt;
    }

    public BigDecimal getPayinterestamt() {
        return payinterestamt;
    }

    public void setPayinterestamt(BigDecimal payinterestamt) {
        this.payinterestamt = payinterestamt;
    }

    public BigDecimal getActualpayinterestamt() {
        return actualpayinterestamt;
    }

    public void setActualpayinterestamt(BigDecimal actualpayinterestamt) {
        this.actualpayinterestamt = actualpayinterestamt;
    }

    public BigDecimal getPayprincipalpenaltyamt() {
        return payprincipalpenaltyamt;
    }

    public void setPayprincipalpenaltyamt(BigDecimal payprincipalpenaltyamt) {
        this.payprincipalpenaltyamt = payprincipalpenaltyamt;
    }

    public BigDecimal getActualpayprincipalpenaltyamt() {
        return actualpayprincipalpenaltyamt;
    }

    public void setActualpayprincipalpenaltyamt(BigDecimal actualpayprincipalpenaltyamt) {
        this.actualpayprincipalpenaltyamt = actualpayprincipalpenaltyamt;
    }

    public BigDecimal getPayinterestpenaltyamt() {
        return payinterestpenaltyamt;
    }

    public void setPayinterestpenaltyamt(BigDecimal payinterestpenaltyamt) {
        this.payinterestpenaltyamt = payinterestpenaltyamt;
    }

    public BigDecimal getActualpayinterestpenaltyamt() {
        return actualpayinterestpenaltyamt;
    }

    public void setActualpayinterestpenaltyamt(BigDecimal actualpayinterestpenaltyamt) {
        this.actualpayinterestpenaltyamt = actualpayinterestpenaltyamt;
    }

    public String getAccountingorgid() {
        return accountingorgid;
    }

    public void setAccountingorgid(String accountingorgid) {
        this.accountingorgid = accountingorgid == null ? null : accountingorgid.trim();
    }

    public String getPrepayamtflag() {
        return prepayamtflag;
    }

    public void setPrepayamtflag(String prepayamtflag) {
        this.prepayamtflag = prepayamtflag == null ? null : prepayamtflag.trim();
    }

    public String getAutopayflag() {
        return autopayflag;
    }

    public void setAutopayflag(String autopayflag) {
        this.autopayflag = autopayflag == null ? null : autopayflag.trim();
    }

    public String getPayrule() {
        return payrule;
    }

    public void setPayrule(String payrule) {
        this.payrule = payrule == null ? null : payrule.trim();
    }

    public String getPaysort() {
        return paysort;
    }

    public void setPaysort(String paysort) {
        this.paysort = paysort == null ? null : paysort.trim();
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