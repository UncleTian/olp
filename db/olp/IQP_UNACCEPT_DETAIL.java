package com.bea.olp;

import java.math.BigDecimal;

public class IQP_UNACCEPT_DETAIL {
    private String detailSerno;

    private String serno;

    private String applDate;

    private String coPlatform;

    private String certType;

    private String certCode;

    private String unacceptNum;

    private String inputTime;

    private BigDecimal orderNum;

    private String custName;

    private String listStatus;

    public String getDetailSerno() {
        return detailSerno;
    }

    public void setDetailSerno(String detailSerno) {
        this.detailSerno = detailSerno == null ? null : detailSerno.trim();
    }

    public String getSerno() {
        return serno;
    }

    public void setSerno(String serno) {
        this.serno = serno == null ? null : serno.trim();
    }

    public String getApplDate() {
        return applDate;
    }

    public void setApplDate(String applDate) {
        this.applDate = applDate == null ? null : applDate.trim();
    }

    public String getCoPlatform() {
        return coPlatform;
    }

    public void setCoPlatform(String coPlatform) {
        this.coPlatform = coPlatform == null ? null : coPlatform.trim();
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType == null ? null : certType.trim();
    }

    public String getCertCode() {
        return certCode;
    }

    public void setCertCode(String certCode) {
        this.certCode = certCode == null ? null : certCode.trim();
    }

    public String getUnacceptNum() {
        return unacceptNum;
    }

    public void setUnacceptNum(String unacceptNum) {
        this.unacceptNum = unacceptNum == null ? null : unacceptNum.trim();
    }

    public String getInputTime() {
        return inputTime;
    }

    public void setInputTime(String inputTime) {
        this.inputTime = inputTime == null ? null : inputTime.trim();
    }

    public BigDecimal getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(BigDecimal orderNum) {
        this.orderNum = orderNum;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getListStatus() {
        return listStatus;
    }

    public void setListStatus(String listStatus) {
        this.listStatus = listStatus == null ? null : listStatus.trim();
    }
}