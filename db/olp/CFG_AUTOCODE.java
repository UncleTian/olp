package com.bea.olp;

import java.math.BigDecimal;

public class CFG_AUTOCODE extends CFG_AUTOCODEKey {
    private String initcycle;

    private String curSernum;

    private String seqStyle;

    private BigDecimal seqLength;

    private String seqStrategy;

    private String zeroFlag;

    private String memo;

    private String inputTime;

    private String inputId;

    private String inputBrId;

    private String lastUpdateTime;

    private String lastUpdateId;

    private String seqScene;

    private String ruleSource;

    public String getInitcycle() {
        return initcycle;
    }

    public void setInitcycle(String initcycle) {
        this.initcycle = initcycle == null ? null : initcycle.trim();
    }

    public String getCurSernum() {
        return curSernum;
    }

    public void setCurSernum(String curSernum) {
        this.curSernum = curSernum == null ? null : curSernum.trim();
    }

    public String getSeqStyle() {
        return seqStyle;
    }

    public void setSeqStyle(String seqStyle) {
        this.seqStyle = seqStyle == null ? null : seqStyle.trim();
    }

    public BigDecimal getSeqLength() {
        return seqLength;
    }

    public void setSeqLength(BigDecimal seqLength) {
        this.seqLength = seqLength;
    }

    public String getSeqStrategy() {
        return seqStrategy;
    }

    public void setSeqStrategy(String seqStrategy) {
        this.seqStrategy = seqStrategy == null ? null : seqStrategy.trim();
    }

    public String getZeroFlag() {
        return zeroFlag;
    }

    public void setZeroFlag(String zeroFlag) {
        this.zeroFlag = zeroFlag == null ? null : zeroFlag.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
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

    public String getSeqScene() {
        return seqScene;
    }

    public void setSeqScene(String seqScene) {
        this.seqScene = seqScene == null ? null : seqScene.trim();
    }

    public String getRuleSource() {
        return ruleSource;
    }

    public void setRuleSource(String ruleSource) {
        this.ruleSource = ruleSource == null ? null : ruleSource.trim();
    }
}