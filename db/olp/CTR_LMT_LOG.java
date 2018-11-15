package com.bea.olp;

public class CTR_LMT_LOG {
    private String serno;

    private String creditLimtCode;

    private String shopId;

    private String opPlatform;

    private String opOption;

    private String opReason;

    private String lastUpdateTime;

    public String getSerno() {
        return serno;
    }

    public void setSerno(String serno) {
        this.serno = serno == null ? null : serno.trim();
    }

    public String getCreditLimtCode() {
        return creditLimtCode;
    }

    public void setCreditLimtCode(String creditLimtCode) {
        this.creditLimtCode = creditLimtCode == null ? null : creditLimtCode.trim();
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }

    public String getOpPlatform() {
        return opPlatform;
    }

    public void setOpPlatform(String opPlatform) {
        this.opPlatform = opPlatform == null ? null : opPlatform.trim();
    }

    public String getOpOption() {
        return opOption;
    }

    public void setOpOption(String opOption) {
        this.opOption = opOption == null ? null : opOption.trim();
    }

    public String getOpReason() {
        return opReason;
    }

    public void setOpReason(String opReason) {
        this.opReason = opReason == null ? null : opReason.trim();
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime == null ? null : lastUpdateTime.trim();
    }
}