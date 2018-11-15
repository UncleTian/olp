package com.bea.olp;

import java.math.BigDecimal;

public class SF_STAT_CACHE extends SF_STAT_CACHEKey {
    private BigDecimal amt;

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }
}