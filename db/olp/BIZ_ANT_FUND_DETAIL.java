package com.bea.olp;

public class BIZ_ANT_FUND_DETAIL {
    private String bizNbr;

    private String bizTp;

    private Short tdAmt;

    private Short tdRefundAmount;

    private String tdGmtCreate;

    private String tdNm;

    private String opstOrgNm;

    private String tdSubDetail;

    private String inputDate;

    private String inputTime;

    private String lastUpdateDate;

    private String lastUpdateTime;

    private String dataDate;

    public String getBizNbr() {
        return bizNbr;
    }

    public void setBizNbr(String bizNbr) {
        this.bizNbr = bizNbr == null ? null : bizNbr.trim();
    }

    public String getBizTp() {
        return bizTp;
    }

    public void setBizTp(String bizTp) {
        this.bizTp = bizTp == null ? null : bizTp.trim();
    }

    public Short getTdAmt() {
        return tdAmt;
    }

    public void setTdAmt(Short tdAmt) {
        this.tdAmt = tdAmt;
    }

    public Short getTdRefundAmount() {
        return tdRefundAmount;
    }

    public void setTdRefundAmount(Short tdRefundAmount) {
        this.tdRefundAmount = tdRefundAmount;
    }

    public String getTdGmtCreate() {
        return tdGmtCreate;
    }

    public void setTdGmtCreate(String tdGmtCreate) {
        this.tdGmtCreate = tdGmtCreate == null ? null : tdGmtCreate.trim();
    }

    public String getTdNm() {
        return tdNm;
    }

    public void setTdNm(String tdNm) {
        this.tdNm = tdNm == null ? null : tdNm.trim();
    }

    public String getOpstOrgNm() {
        return opstOrgNm;
    }

    public void setOpstOrgNm(String opstOrgNm) {
        this.opstOrgNm = opstOrgNm == null ? null : opstOrgNm.trim();
    }

    public String getTdSubDetail() {
        return tdSubDetail;
    }

    public void setTdSubDetail(String tdSubDetail) {
        this.tdSubDetail = tdSubDetail == null ? null : tdSubDetail.trim();
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

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate == null ? null : lastUpdateDate.trim();
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime == null ? null : lastUpdateTime.trim();
    }

    public String getDataDate() {
        return dataDate;
    }

    public void setDataDate(String dataDate) {
        this.dataDate = dataDate == null ? null : dataDate.trim();
    }
}