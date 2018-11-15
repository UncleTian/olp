package com.bea.olp;

import java.math.BigDecimal;

public class BAT_SOP_HKJH {
    private String loanNo;

    private Short psPerdNo;

    private String psDueDt;

    private String psBillDt;

    private BigDecimal sbsyRate;

    private BigDecimal psInstmAmt;

    private BigDecimal psPrcpAmt;

    private BigDecimal psNormIntAmt;

    private BigDecimal psOdIntAmt;

    private BigDecimal psCommOdInt;

    private BigDecimal sbsyIntAmt;

    private BigDecimal psFeeAmt;

    private BigDecimal prodPrcpAmt;

    private BigDecimal prodIntAmt;

    private BigDecimal prodCommIntAmt;

    private BigDecimal prodFeeAmt;

    private BigDecimal psRemPrcp;

    private BigDecimal psIncTaken;

    private BigDecimal setlPrcp;

    private BigDecimal setlNormInt;

    private BigDecimal setlOdIntAmt;

    private BigDecimal setlCommOdInt;

    private BigDecimal setlFeeAmt;

    private BigDecimal setlOdIncTaken;

    private BigDecimal setlIncTaken;

    private BigDecimal psIntRate;

    private BigDecimal psOdIntRate;

    private String psOdInd;

    private String lastSetlDt;

    private BigDecimal psOdIncTaken;

    private BigDecimal psWvPrcpAmt;

    private BigDecimal psWvNmInt;

    private BigDecimal psWvOdInt;

    private BigDecimal psWvCommInt;

    private BigDecimal prcpState;

    private String intState;

    private String setlInd;

    private String commOdGenDt;

    private String ppErInd;

    private String psGenProdDt;

    private BigDecimal psCurOdIncTaken;

    private BigDecimal grcProdPrcp;

    private BigDecimal grcProdInt;

    private BigDecimal grcProdComm;

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo == null ? null : loanNo.trim();
    }

    public Short getPsPerdNo() {
        return psPerdNo;
    }

    public void setPsPerdNo(Short psPerdNo) {
        this.psPerdNo = psPerdNo;
    }

    public String getPsDueDt() {
        return psDueDt;
    }

    public void setPsDueDt(String psDueDt) {
        this.psDueDt = psDueDt == null ? null : psDueDt.trim();
    }

    public String getPsBillDt() {
        return psBillDt;
    }

    public void setPsBillDt(String psBillDt) {
        this.psBillDt = psBillDt == null ? null : psBillDt.trim();
    }

    public BigDecimal getSbsyRate() {
        return sbsyRate;
    }

    public void setSbsyRate(BigDecimal sbsyRate) {
        this.sbsyRate = sbsyRate;
    }

    public BigDecimal getPsInstmAmt() {
        return psInstmAmt;
    }

    public void setPsInstmAmt(BigDecimal psInstmAmt) {
        this.psInstmAmt = psInstmAmt;
    }

    public BigDecimal getPsPrcpAmt() {
        return psPrcpAmt;
    }

    public void setPsPrcpAmt(BigDecimal psPrcpAmt) {
        this.psPrcpAmt = psPrcpAmt;
    }

    public BigDecimal getPsNormIntAmt() {
        return psNormIntAmt;
    }

    public void setPsNormIntAmt(BigDecimal psNormIntAmt) {
        this.psNormIntAmt = psNormIntAmt;
    }

    public BigDecimal getPsOdIntAmt() {
        return psOdIntAmt;
    }

    public void setPsOdIntAmt(BigDecimal psOdIntAmt) {
        this.psOdIntAmt = psOdIntAmt;
    }

    public BigDecimal getPsCommOdInt() {
        return psCommOdInt;
    }

    public void setPsCommOdInt(BigDecimal psCommOdInt) {
        this.psCommOdInt = psCommOdInt;
    }

    public BigDecimal getSbsyIntAmt() {
        return sbsyIntAmt;
    }

    public void setSbsyIntAmt(BigDecimal sbsyIntAmt) {
        this.sbsyIntAmt = sbsyIntAmt;
    }

    public BigDecimal getPsFeeAmt() {
        return psFeeAmt;
    }

    public void setPsFeeAmt(BigDecimal psFeeAmt) {
        this.psFeeAmt = psFeeAmt;
    }

    public BigDecimal getProdPrcpAmt() {
        return prodPrcpAmt;
    }

    public void setProdPrcpAmt(BigDecimal prodPrcpAmt) {
        this.prodPrcpAmt = prodPrcpAmt;
    }

    public BigDecimal getProdIntAmt() {
        return prodIntAmt;
    }

    public void setProdIntAmt(BigDecimal prodIntAmt) {
        this.prodIntAmt = prodIntAmt;
    }

    public BigDecimal getProdCommIntAmt() {
        return prodCommIntAmt;
    }

    public void setProdCommIntAmt(BigDecimal prodCommIntAmt) {
        this.prodCommIntAmt = prodCommIntAmt;
    }

    public BigDecimal getProdFeeAmt() {
        return prodFeeAmt;
    }

    public void setProdFeeAmt(BigDecimal prodFeeAmt) {
        this.prodFeeAmt = prodFeeAmt;
    }

    public BigDecimal getPsRemPrcp() {
        return psRemPrcp;
    }

    public void setPsRemPrcp(BigDecimal psRemPrcp) {
        this.psRemPrcp = psRemPrcp;
    }

    public BigDecimal getPsIncTaken() {
        return psIncTaken;
    }

    public void setPsIncTaken(BigDecimal psIncTaken) {
        this.psIncTaken = psIncTaken;
    }

    public BigDecimal getSetlPrcp() {
        return setlPrcp;
    }

    public void setSetlPrcp(BigDecimal setlPrcp) {
        this.setlPrcp = setlPrcp;
    }

    public BigDecimal getSetlNormInt() {
        return setlNormInt;
    }

    public void setSetlNormInt(BigDecimal setlNormInt) {
        this.setlNormInt = setlNormInt;
    }

    public BigDecimal getSetlOdIntAmt() {
        return setlOdIntAmt;
    }

    public void setSetlOdIntAmt(BigDecimal setlOdIntAmt) {
        this.setlOdIntAmt = setlOdIntAmt;
    }

    public BigDecimal getSetlCommOdInt() {
        return setlCommOdInt;
    }

    public void setSetlCommOdInt(BigDecimal setlCommOdInt) {
        this.setlCommOdInt = setlCommOdInt;
    }

    public BigDecimal getSetlFeeAmt() {
        return setlFeeAmt;
    }

    public void setSetlFeeAmt(BigDecimal setlFeeAmt) {
        this.setlFeeAmt = setlFeeAmt;
    }

    public BigDecimal getSetlOdIncTaken() {
        return setlOdIncTaken;
    }

    public void setSetlOdIncTaken(BigDecimal setlOdIncTaken) {
        this.setlOdIncTaken = setlOdIncTaken;
    }

    public BigDecimal getSetlIncTaken() {
        return setlIncTaken;
    }

    public void setSetlIncTaken(BigDecimal setlIncTaken) {
        this.setlIncTaken = setlIncTaken;
    }

    public BigDecimal getPsIntRate() {
        return psIntRate;
    }

    public void setPsIntRate(BigDecimal psIntRate) {
        this.psIntRate = psIntRate;
    }

    public BigDecimal getPsOdIntRate() {
        return psOdIntRate;
    }

    public void setPsOdIntRate(BigDecimal psOdIntRate) {
        this.psOdIntRate = psOdIntRate;
    }

    public String getPsOdInd() {
        return psOdInd;
    }

    public void setPsOdInd(String psOdInd) {
        this.psOdInd = psOdInd == null ? null : psOdInd.trim();
    }

    public String getLastSetlDt() {
        return lastSetlDt;
    }

    public void setLastSetlDt(String lastSetlDt) {
        this.lastSetlDt = lastSetlDt == null ? null : lastSetlDt.trim();
    }

    public BigDecimal getPsOdIncTaken() {
        return psOdIncTaken;
    }

    public void setPsOdIncTaken(BigDecimal psOdIncTaken) {
        this.psOdIncTaken = psOdIncTaken;
    }

    public BigDecimal getPsWvPrcpAmt() {
        return psWvPrcpAmt;
    }

    public void setPsWvPrcpAmt(BigDecimal psWvPrcpAmt) {
        this.psWvPrcpAmt = psWvPrcpAmt;
    }

    public BigDecimal getPsWvNmInt() {
        return psWvNmInt;
    }

    public void setPsWvNmInt(BigDecimal psWvNmInt) {
        this.psWvNmInt = psWvNmInt;
    }

    public BigDecimal getPsWvOdInt() {
        return psWvOdInt;
    }

    public void setPsWvOdInt(BigDecimal psWvOdInt) {
        this.psWvOdInt = psWvOdInt;
    }

    public BigDecimal getPsWvCommInt() {
        return psWvCommInt;
    }

    public void setPsWvCommInt(BigDecimal psWvCommInt) {
        this.psWvCommInt = psWvCommInt;
    }

    public BigDecimal getPrcpState() {
        return prcpState;
    }

    public void setPrcpState(BigDecimal prcpState) {
        this.prcpState = prcpState;
    }

    public String getIntState() {
        return intState;
    }

    public void setIntState(String intState) {
        this.intState = intState == null ? null : intState.trim();
    }

    public String getSetlInd() {
        return setlInd;
    }

    public void setSetlInd(String setlInd) {
        this.setlInd = setlInd == null ? null : setlInd.trim();
    }

    public String getCommOdGenDt() {
        return commOdGenDt;
    }

    public void setCommOdGenDt(String commOdGenDt) {
        this.commOdGenDt = commOdGenDt == null ? null : commOdGenDt.trim();
    }

    public String getPpErInd() {
        return ppErInd;
    }

    public void setPpErInd(String ppErInd) {
        this.ppErInd = ppErInd == null ? null : ppErInd.trim();
    }

    public String getPsGenProdDt() {
        return psGenProdDt;
    }

    public void setPsGenProdDt(String psGenProdDt) {
        this.psGenProdDt = psGenProdDt == null ? null : psGenProdDt.trim();
    }

    public BigDecimal getPsCurOdIncTaken() {
        return psCurOdIncTaken;
    }

    public void setPsCurOdIncTaken(BigDecimal psCurOdIncTaken) {
        this.psCurOdIncTaken = psCurOdIncTaken;
    }

    public BigDecimal getGrcProdPrcp() {
        return grcProdPrcp;
    }

    public void setGrcProdPrcp(BigDecimal grcProdPrcp) {
        this.grcProdPrcp = grcProdPrcp;
    }

    public BigDecimal getGrcProdInt() {
        return grcProdInt;
    }

    public void setGrcProdInt(BigDecimal grcProdInt) {
        this.grcProdInt = grcProdInt;
    }

    public BigDecimal getGrcProdComm() {
        return grcProdComm;
    }

    public void setGrcProdComm(BigDecimal grcProdComm) {
        this.grcProdComm = grcProdComm;
    }
}