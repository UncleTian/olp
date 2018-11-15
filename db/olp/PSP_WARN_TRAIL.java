package com.bea.olp;

import java.math.BigDecimal;

public class PSP_WARN_TRAIL {
    private String dataDate;

    private String tpObjId;

    private String prdCode;

    private String intype;

    private String statisYm;

    private String custIdCore;

    private BigDecimal score;

    private String decIntrate;

    private String credit;

    private String decReason;

    private String genReason;

    private String inputTime;

    private String inputDate;

    public String getDataDate() {
        return dataDate;
    }

    public void setDataDate(String dataDate) {
        this.dataDate = dataDate == null ? null : dataDate.trim();
    }

    public String getTpObjId() {
        return tpObjId;
    }

    public void setTpObjId(String tpObjId) {
        this.tpObjId = tpObjId == null ? null : tpObjId.trim();
    }

    public String getPrdCode() {
        return prdCode;
    }

    public void setPrdCode(String prdCode) {
        this.prdCode = prdCode == null ? null : prdCode.trim();
    }

    public String getIntype() {
        return intype;
    }

    public void setIntype(String intype) {
        this.intype = intype == null ? null : intype.trim();
    }

    public String getStatisYm() {
        return statisYm;
    }

    public void setStatisYm(String statisYm) {
        this.statisYm = statisYm == null ? null : statisYm.trim();
    }

    public String getCustIdCore() {
        return custIdCore;
    }

    public void setCustIdCore(String custIdCore) {
        this.custIdCore = custIdCore == null ? null : custIdCore.trim();
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public String getDecIntrate() {
        return decIntrate;
    }

    public void setDecIntrate(String decIntrate) {
        this.decIntrate = decIntrate == null ? null : decIntrate.trim();
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit == null ? null : credit.trim();
    }

    public String getDecReason() {
        return decReason;
    }

    public void setDecReason(String decReason) {
        this.decReason = decReason == null ? null : decReason.trim();
    }

    public String getGenReason() {
        return genReason;
    }

    public void setGenReason(String genReason) {
        this.genReason = genReason == null ? null : genReason.trim();
    }

    public String getInputTime() {
        return inputTime;
    }

    public void setInputTime(String inputTime) {
        this.inputTime = inputTime == null ? null : inputTime.trim();
    }

    public String getInputDate() {
        return inputDate;
    }

    public void setInputDate(String inputDate) {
        this.inputDate = inputDate == null ? null : inputDate.trim();
    }
}