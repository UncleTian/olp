package com.bea.olp;

import java.math.BigDecimal;

public class BAT_JD_QUOTAADJUST_HIS {
    private String busiDate;

    private String custNo;

    private String proNo;

    private String limitNo;

    private String quotaAdjustType;

    private String quotaAdjustMode;

    private BigDecimal quota;

    private BigDecimal quotaBef;

    private BigDecimal quotaAft;

    private String quotaBuildDate;

    private String quotaEffectDate;

    private String quotaSerialNo;

    private String inputDate;

    private String inputTime;

    private String dataDate;

    public String getBusiDate() {
        return busiDate;
    }

    public void setBusiDate(String busiDate) {
        this.busiDate = busiDate == null ? null : busiDate.trim();
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo == null ? null : custNo.trim();
    }

    public String getProNo() {
        return proNo;
    }

    public void setProNo(String proNo) {
        this.proNo = proNo == null ? null : proNo.trim();
    }

    public String getLimitNo() {
        return limitNo;
    }

    public void setLimitNo(String limitNo) {
        this.limitNo = limitNo == null ? null : limitNo.trim();
    }

    public String getQuotaAdjustType() {
        return quotaAdjustType;
    }

    public void setQuotaAdjustType(String quotaAdjustType) {
        this.quotaAdjustType = quotaAdjustType == null ? null : quotaAdjustType.trim();
    }

    public String getQuotaAdjustMode() {
        return quotaAdjustMode;
    }

    public void setQuotaAdjustMode(String quotaAdjustMode) {
        this.quotaAdjustMode = quotaAdjustMode == null ? null : quotaAdjustMode.trim();
    }

    public BigDecimal getQuota() {
        return quota;
    }

    public void setQuota(BigDecimal quota) {
        this.quota = quota;
    }

    public BigDecimal getQuotaBef() {
        return quotaBef;
    }

    public void setQuotaBef(BigDecimal quotaBef) {
        this.quotaBef = quotaBef;
    }

    public BigDecimal getQuotaAft() {
        return quotaAft;
    }

    public void setQuotaAft(BigDecimal quotaAft) {
        this.quotaAft = quotaAft;
    }

    public String getQuotaBuildDate() {
        return quotaBuildDate;
    }

    public void setQuotaBuildDate(String quotaBuildDate) {
        this.quotaBuildDate = quotaBuildDate == null ? null : quotaBuildDate.trim();
    }

    public String getQuotaEffectDate() {
        return quotaEffectDate;
    }

    public void setQuotaEffectDate(String quotaEffectDate) {
        this.quotaEffectDate = quotaEffectDate == null ? null : quotaEffectDate.trim();
    }

    public String getQuotaSerialNo() {
        return quotaSerialNo;
    }

    public void setQuotaSerialNo(String quotaSerialNo) {
        this.quotaSerialNo = quotaSerialNo == null ? null : quotaSerialNo.trim();
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