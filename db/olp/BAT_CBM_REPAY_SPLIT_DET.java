package com.bea.olp;

import java.math.BigDecimal;

public class BAT_CBM_REPAY_SPLIT_DET {
    private String serialno;

    private String transserialno;

    private String objecttype;

    private String objectno;

    private String relativeobjecttype;

    private String relativeobjectno;

    private String paydate;

    private String actualpaydate;

    private String currency;

    private BigDecimal payprincipalamt;

    private BigDecimal actualpayprincipalamt;

    private BigDecimal waiveprincipalamt;

    private BigDecimal principalbalance;

    private BigDecimal payinterestamt;

    private BigDecimal actualpayinterestamt;

    private BigDecimal waiveinterestamt;

    private BigDecimal payprincipalpenaltyamt;

    private BigDecimal actualpayprincipalpenaltyamt;

    private BigDecimal waiveprincipalpenaltyamt;

    private BigDecimal payinterestpenaltyamt;

    private BigDecimal actualpayinterestpenaltyamt;

    private BigDecimal waiveinterestpenaltyamt;

    private String status;

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

    public String getTransserialno() {
        return transserialno;
    }

    public void setTransserialno(String transserialno) {
        this.transserialno = transserialno == null ? null : transserialno.trim();
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

    public String getRelativeobjecttype() {
        return relativeobjecttype;
    }

    public void setRelativeobjecttype(String relativeobjecttype) {
        this.relativeobjecttype = relativeobjecttype == null ? null : relativeobjecttype.trim();
    }

    public String getRelativeobjectno() {
        return relativeobjectno;
    }

    public void setRelativeobjectno(String relativeobjectno) {
        this.relativeobjectno = relativeobjectno == null ? null : relativeobjectno.trim();
    }

    public String getPaydate() {
        return paydate;
    }

    public void setPaydate(String paydate) {
        this.paydate = paydate == null ? null : paydate.trim();
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

    public BigDecimal getWaiveprincipalamt() {
        return waiveprincipalamt;
    }

    public void setWaiveprincipalamt(BigDecimal waiveprincipalamt) {
        this.waiveprincipalamt = waiveprincipalamt;
    }

    public BigDecimal getPrincipalbalance() {
        return principalbalance;
    }

    public void setPrincipalbalance(BigDecimal principalbalance) {
        this.principalbalance = principalbalance;
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

    public BigDecimal getWaiveinterestamt() {
        return waiveinterestamt;
    }

    public void setWaiveinterestamt(BigDecimal waiveinterestamt) {
        this.waiveinterestamt = waiveinterestamt;
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

    public BigDecimal getWaiveprincipalpenaltyamt() {
        return waiveprincipalpenaltyamt;
    }

    public void setWaiveprincipalpenaltyamt(BigDecimal waiveprincipalpenaltyamt) {
        this.waiveprincipalpenaltyamt = waiveprincipalpenaltyamt;
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

    public BigDecimal getWaiveinterestpenaltyamt() {
        return waiveinterestpenaltyamt;
    }

    public void setWaiveinterestpenaltyamt(BigDecimal waiveinterestpenaltyamt) {
        this.waiveinterestpenaltyamt = waiveinterestpenaltyamt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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