package com.bea.olp;

import java.math.BigDecimal;

public class CFG_DECISION {
    private String coPlatform;

    private String loanNo;

    private String decisionId;

    private String decisionDefValue;

    private String inputTime;

    private String inputId;

    private String inputBrId;

    private String lastUpdateTime;

    private String lastUpdateId;

    private String decisionType;

    private BigDecimal decisionNum;

    private String sceneId;

    public String getCoPlatform() {
        return coPlatform;
    }

    public void setCoPlatform(String coPlatform) {
        this.coPlatform = coPlatform == null ? null : coPlatform.trim();
    }

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo == null ? null : loanNo.trim();
    }

    public String getDecisionId() {
        return decisionId;
    }

    public void setDecisionId(String decisionId) {
        this.decisionId = decisionId == null ? null : decisionId.trim();
    }

    public String getDecisionDefValue() {
        return decisionDefValue;
    }

    public void setDecisionDefValue(String decisionDefValue) {
        this.decisionDefValue = decisionDefValue == null ? null : decisionDefValue.trim();
    }

    public String getInputTime() {
        return inputTime;
    }

    public void setInputTime(String inputTime) {
        this.inputTime = inputTime == null ? null : inputTime.trim();
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

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime == null ? null : lastUpdateTime.trim();
    }

    public String getLastUpdateId() {
        return lastUpdateId;
    }

    public void setLastUpdateId(String lastUpdateId) {
        this.lastUpdateId = lastUpdateId == null ? null : lastUpdateId.trim();
    }

    public String getDecisionType() {
        return decisionType;
    }

    public void setDecisionType(String decisionType) {
        this.decisionType = decisionType == null ? null : decisionType.trim();
    }

    public BigDecimal getDecisionNum() {
        return decisionNum;
    }

    public void setDecisionNum(BigDecimal decisionNum) {
        this.decisionNum = decisionNum;
    }

    public String getSceneId() {
        return sceneId;
    }

    public void setSceneId(String sceneId) {
        this.sceneId = sceneId == null ? null : sceneId.trim();
    }
}