package com.bea.olp;

import java.math.BigDecimal;

public class WFI_JOIN_HIS {
    private String instanceid;

    private String mainInstanceid;

    private String bizTableName;

    private String pkCol;

    private String pkValue;

    private String cusId;

    private String cusName;

    private String cusType;

    private String applType;

    private String wfsign;

    private String prdPk;

    private String prdName;

    private String certType;

    private String certCode;

    private BigDecimal amt;

    private BigDecimal term;

    private BigDecimal rulingIr;

    private BigDecimal realityIrY;

    private String inputId;

    private String inputBrId;

    private String applyDate;

    private String preventList;

    private String statusName;

    private String wfiEndOrg;

    private String wfiStatus;

    public String getInstanceid() {
        return instanceid;
    }

    public void setInstanceid(String instanceid) {
        this.instanceid = instanceid == null ? null : instanceid.trim();
    }

    public String getMainInstanceid() {
        return mainInstanceid;
    }

    public void setMainInstanceid(String mainInstanceid) {
        this.mainInstanceid = mainInstanceid == null ? null : mainInstanceid.trim();
    }

    public String getBizTableName() {
        return bizTableName;
    }

    public void setBizTableName(String bizTableName) {
        this.bizTableName = bizTableName == null ? null : bizTableName.trim();
    }

    public String getPkCol() {
        return pkCol;
    }

    public void setPkCol(String pkCol) {
        this.pkCol = pkCol == null ? null : pkCol.trim();
    }

    public String getPkValue() {
        return pkValue;
    }

    public void setPkValue(String pkValue) {
        this.pkValue = pkValue == null ? null : pkValue.trim();
    }

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId == null ? null : cusId.trim();
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName == null ? null : cusName.trim();
    }

    public String getCusType() {
        return cusType;
    }

    public void setCusType(String cusType) {
        this.cusType = cusType == null ? null : cusType.trim();
    }

    public String getApplType() {
        return applType;
    }

    public void setApplType(String applType) {
        this.applType = applType == null ? null : applType.trim();
    }

    public String getWfsign() {
        return wfsign;
    }

    public void setWfsign(String wfsign) {
        this.wfsign = wfsign == null ? null : wfsign.trim();
    }

    public String getPrdPk() {
        return prdPk;
    }

    public void setPrdPk(String prdPk) {
        this.prdPk = prdPk == null ? null : prdPk.trim();
    }

    public String getPrdName() {
        return prdName;
    }

    public void setPrdName(String prdName) {
        this.prdName = prdName == null ? null : prdName.trim();
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

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public BigDecimal getTerm() {
        return term;
    }

    public void setTerm(BigDecimal term) {
        this.term = term;
    }

    public BigDecimal getRulingIr() {
        return rulingIr;
    }

    public void setRulingIr(BigDecimal rulingIr) {
        this.rulingIr = rulingIr;
    }

    public BigDecimal getRealityIrY() {
        return realityIrY;
    }

    public void setRealityIrY(BigDecimal realityIrY) {
        this.realityIrY = realityIrY;
    }

    public String getInputId() {
        return inputId;
    }

    public void setInputId(String inputId) {
        this.inputId = inputId == null ? null : inputId.trim();
    }

    public String getInputBrId() {
        return inputBrId;
    }

    public void setInputBrId(String inputBrId) {
        this.inputBrId = inputBrId == null ? null : inputBrId.trim();
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate == null ? null : applyDate.trim();
    }

    public String getPreventList() {
        return preventList;
    }

    public void setPreventList(String preventList) {
        this.preventList = preventList == null ? null : preventList.trim();
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName == null ? null : statusName.trim();
    }

    public String getWfiEndOrg() {
        return wfiEndOrg;
    }

    public void setWfiEndOrg(String wfiEndOrg) {
        this.wfiEndOrg = wfiEndOrg == null ? null : wfiEndOrg.trim();
    }

    public String getWfiStatus() {
        return wfiStatus;
    }

    public void setWfiStatus(String wfiStatus) {
        this.wfiStatus = wfiStatus == null ? null : wfiStatus.trim();
    }
}