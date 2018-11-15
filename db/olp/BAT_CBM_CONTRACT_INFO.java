package com.bea.olp;

import java.math.BigDecimal;

public class BAT_CBM_CONTRACT_INFO {
    private String contractno;

    private String customerid;

    private String ccy;

    private BigDecimal amt;

    private String productid;

    private String term;

    private BigDecimal rate;

    private String startsubbranch;

    private String startuserid;

    private String signdate;

    private String startdate;

    private String enddate;

    private String cbrcloanuse;

    private String pbocloanuse;

    private String hkasloanuse;

    private String termtype;

    private String inputDate;

    private String inputTime;

    private String dataDate;

    private String channelType;

    public String getContractno() {
        return contractno;
    }

    public void setContractno(String contractno) {
        this.contractno = contractno == null ? null : contractno.trim();
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy == null ? null : ccy.trim();
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid == null ? null : productid.trim();
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term == null ? null : term.trim();
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getStartsubbranch() {
        return startsubbranch;
    }

    public void setStartsubbranch(String startsubbranch) {
        this.startsubbranch = startsubbranch == null ? null : startsubbranch.trim();
    }

    public String getStartuserid() {
        return startuserid;
    }

    public void setStartuserid(String startuserid) {
        this.startuserid = startuserid == null ? null : startuserid.trim();
    }

    public String getSigndate() {
        return signdate;
    }

    public void setSigndate(String signdate) {
        this.signdate = signdate == null ? null : signdate.trim();
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate == null ? null : startdate.trim();
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate == null ? null : enddate.trim();
    }

    public String getCbrcloanuse() {
        return cbrcloanuse;
    }

    public void setCbrcloanuse(String cbrcloanuse) {
        this.cbrcloanuse = cbrcloanuse == null ? null : cbrcloanuse.trim();
    }

    public String getPbocloanuse() {
        return pbocloanuse;
    }

    public void setPbocloanuse(String pbocloanuse) {
        this.pbocloanuse = pbocloanuse == null ? null : pbocloanuse.trim();
    }

    public String getHkasloanuse() {
        return hkasloanuse;
    }

    public void setHkasloanuse(String hkasloanuse) {
        this.hkasloanuse = hkasloanuse == null ? null : hkasloanuse.trim();
    }

    public String getTermtype() {
        return termtype;
    }

    public void setTermtype(String termtype) {
        this.termtype = termtype == null ? null : termtype.trim();
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