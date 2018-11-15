package com.bea.olp;

public class BAT_CBM_TRAN_INFO {
    private String serialno;

    private String parenttransserialno;

    private String transcode;

    private String relativeobjecttype;

    private String relativeobjectno;

    private String documenttype;

    private String documentno;

    private String transdate;

    private String transstatus;

    private String autopayflag;

    private String inputDate;

    private String inputTime;

    private String dataDate;

    private String channelType;

    private String nettransaction;

    public String getSerialno() {
        return serialno;
    }

    public void setSerialno(String serialno) {
        this.serialno = serialno == null ? null : serialno.trim();
    }

    public String getParenttransserialno() {
        return parenttransserialno;
    }

    public void setParenttransserialno(String parenttransserialno) {
        this.parenttransserialno = parenttransserialno == null ? null : parenttransserialno.trim();
    }

    public String getTranscode() {
        return transcode;
    }

    public void setTranscode(String transcode) {
        this.transcode = transcode == null ? null : transcode.trim();
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

    public String getDocumenttype() {
        return documenttype;
    }

    public void setDocumenttype(String documenttype) {
        this.documenttype = documenttype == null ? null : documenttype.trim();
    }

    public String getDocumentno() {
        return documentno;
    }

    public void setDocumentno(String documentno) {
        this.documentno = documentno == null ? null : documentno.trim();
    }

    public String getTransdate() {
        return transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate == null ? null : transdate.trim();
    }

    public String getTransstatus() {
        return transstatus;
    }

    public void setTransstatus(String transstatus) {
        this.transstatus = transstatus == null ? null : transstatus.trim();
    }

    public String getAutopayflag() {
        return autopayflag;
    }

    public void setAutopayflag(String autopayflag) {
        this.autopayflag = autopayflag == null ? null : autopayflag.trim();
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

    public String getNettransaction() {
        return nettransaction;
    }

    public void setNettransaction(String nettransaction) {
        this.nettransaction = nettransaction == null ? null : nettransaction.trim();
    }
}