package com.bea.olp;

import java.math.BigDecimal;

public class BAT_CBM_RECON_DET {
    private String serialno;

    private String objecttype;

    private String objectno;

    private String provisionsAccount;

    private String transDate;

    private String subjectAccount;

    private BigDecimal transAmt;

    private String transRemark;

    private String dcFlag;

    private String netobjectno;

    private String netserialno;

    private String correctTrans;

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

    public String getSubjectAccount() {
        return subjectAccount;
    }

    public void setSubjectAccount(String subjectAccount) {
        this.subjectAccount = subjectAccount == null ? null : subjectAccount.trim();
    }

    public BigDecimal getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(BigDecimal transAmt) {
        this.transAmt = transAmt;
    }

    public String getTransRemark() {
        return transRemark;
    }

    public void setTransRemark(String transRemark) {
        this.transRemark = transRemark == null ? null : transRemark.trim();
    }

    public String getDcFlag() {
        return dcFlag;
    }

    public void setDcFlag(String dcFlag) {
        this.dcFlag = dcFlag == null ? null : dcFlag.trim();
    }

    public String getNetobjectno() {
        return netobjectno;
    }

    public void setNetobjectno(String netobjectno) {
        this.netobjectno = netobjectno == null ? null : netobjectno.trim();
    }

    public String getNetserialno() {
        return netserialno;
    }

    public void setNetserialno(String netserialno) {
        this.netserialno = netserialno == null ? null : netserialno.trim();
    }

    public String getCorrectTrans() {
        return correctTrans;
    }

    public void setCorrectTrans(String correctTrans) {
        this.correctTrans = correctTrans == null ? null : correctTrans.trim();
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