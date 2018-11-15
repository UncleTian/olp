package com.bea.olp;

import java.math.BigDecimal;

public class CFG_BASE_RATE {
    private String rptPk;

    private String intBasis;

    private String intBasisDesc;

    private BigDecimal intBasisRate;

    private String ccy;

    private String effectDate;

    private String remark;

    private String status;

    public String getRptPk() {
        return rptPk;
    }

    public void setRptPk(String rptPk) {
        this.rptPk = rptPk == null ? null : rptPk.trim();
    }

    public String getIntBasis() {
        return intBasis;
    }

    public void setIntBasis(String intBasis) {
        this.intBasis = intBasis == null ? null : intBasis.trim();
    }

    public String getIntBasisDesc() {
        return intBasisDesc;
    }

    public void setIntBasisDesc(String intBasisDesc) {
        this.intBasisDesc = intBasisDesc == null ? null : intBasisDesc.trim();
    }

    public BigDecimal getIntBasisRate() {
        return intBasisRate;
    }

    public void setIntBasisRate(BigDecimal intBasisRate) {
        this.intBasisRate = intBasisRate;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy == null ? null : ccy.trim();
    }

    public String getEffectDate() {
        return effectDate;
    }

    public void setEffectDate(String effectDate) {
        this.effectDate = effectDate == null ? null : effectDate.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}