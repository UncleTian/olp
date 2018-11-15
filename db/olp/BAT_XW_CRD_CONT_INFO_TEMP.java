package com.bea.olp;

import java.math.BigDecimal;

public class BAT_XW_CRD_CONT_INFO_TEMP {
    private String custId;

    private String crdContNo;

    private String crdContType;

    private BigDecimal usableAmt;

    private BigDecimal usedAmt;

    private BigDecimal uncreditAmt;

    private BigDecimal uncountAmt;

    private String endDate;

    private String signDate;

    private String contNo;

    private String inputDate;

    private String inputTime;

    private String dataDate;

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId == null ? null : custId.trim();
    }

    public String getCrdContNo() {
        return crdContNo;
    }

    public void setCrdContNo(String crdContNo) {
        this.crdContNo = crdContNo == null ? null : crdContNo.trim();
    }

    public String getCrdContType() {
        return crdContType;
    }

    public void setCrdContType(String crdContType) {
        this.crdContType = crdContType == null ? null : crdContType.trim();
    }

    public BigDecimal getUsableAmt() {
        return usableAmt;
    }

    public void setUsableAmt(BigDecimal usableAmt) {
        this.usableAmt = usableAmt;
    }

    public BigDecimal getUsedAmt() {
        return usedAmt;
    }

    public void setUsedAmt(BigDecimal usedAmt) {
        this.usedAmt = usedAmt;
    }

    public BigDecimal getUncreditAmt() {
        return uncreditAmt;
    }

    public void setUncreditAmt(BigDecimal uncreditAmt) {
        this.uncreditAmt = uncreditAmt;
    }

    public BigDecimal getUncountAmt() {
        return uncountAmt;
    }

    public void setUncountAmt(BigDecimal uncountAmt) {
        this.uncountAmt = uncountAmt;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate == null ? null : endDate.trim();
    }

    public String getSignDate() {
        return signDate;
    }

    public void setSignDate(String signDate) {
        this.signDate = signDate == null ? null : signDate.trim();
    }

    public String getContNo() {
        return contNo;
    }

    public void setContNo(String contNo) {
        this.contNo = contNo == null ? null : contNo.trim();
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