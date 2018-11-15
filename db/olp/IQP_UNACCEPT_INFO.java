package com.bea.olp;

import java.math.BigDecimal;

public class IQP_UNACCEPT_INFO {
    private String serno;

    private String applDate;

    private String certType;

    private String certCode;

    private String coPlatform;

    private BigDecimal unacceptNum;

    private String inputTime;

    private String updateTime;

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

    public String getCoPlatform() {
        return coPlatform;
    }

    public void setCoPlatform(String coPlatform) {
        this.coPlatform = coPlatform == null ? null : coPlatform.trim();
    }

    public BigDecimal getUnacceptNum() {
        return unacceptNum;
    }

    public void setUnacceptNum(BigDecimal unacceptNum) {
        this.unacceptNum = unacceptNum;
    }

    public String getInputTime() {
        return inputTime;
    }

    public void setInputTime(String inputTime) {
        this.inputTime = inputTime == null ? null : inputTime.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }
}