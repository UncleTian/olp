package com.bea.olp;

import java.math.BigDecimal;

public class LOAN_PRD_INFO {
    private String loanNo;

    private String prdCate;

    private String loanType;

    private String prdName;

    private String coPlatform;

    private String startDate;

    private String endDate;

    private String repayWay;

    private String crdMainType;

    private String crdSubType;

    private String coreTyp;

    private String shortTyp;

    private String metaTyp;

    private String longTyp;

    private String payWay;

    private BigDecimal loanAmtMax;

    private BigDecimal loanAmtMin;

    private BigDecimal creditAmtMax;

    private BigDecimal creditAmtMin;

    private BigDecimal overdueUpRate;

    private BigDecimal spdbAccRate;

    private BigDecimal onedayAppFailTimes;

    private BigDecimal crdFailDay;

    private BigDecimal loanFailDay;

    private BigDecimal crdTimeoutDay;

    private BigDecimal loanTimeoutDay;

    private BigDecimal pspWarnDay;

    private BigDecimal canInterposeRatio;

    private String interposeTopDay;

    private String canCancelLmt;

    private String cancelLmtLow;

    private String queryUserId;

    private String cycleFlag;

    private String loanProp;

    private String orgGetType;

    private String msgAllChannel;

    private String msgInChannel;

    private String applyFlag;

    private String loanTermMin;

    private String loanTermMax;

    private String loanInnerAcc;

    private BigDecimal prdRateBp;

    private String acceptBranchId;

    private BigDecimal basicRate;

    private String remark;

    private String status;

    private String inputTime;

    private String inputId;

    private String inputBrId;

    private String lastUpdateTime;

    private String lastUpdateId;

    private String queryUserPw;

    private String validPeriod;

    private BigDecimal minRate;

    private BigDecimal maxRate;

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo == null ? null : loanNo.trim();
    }

    public String getPrdCate() {
        return prdCate;
    }

    public void setPrdCate(String prdCate) {
        this.prdCate = prdCate == null ? null : prdCate.trim();
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType == null ? null : loanType.trim();
    }

    public String getPrdName() {
        return prdName;
    }

    public void setPrdName(String prdName) {
        this.prdName = prdName == null ? null : prdName.trim();
    }

    public String getCoPlatform() {
        return coPlatform;
    }

    public void setCoPlatform(String coPlatform) {
        this.coPlatform = coPlatform == null ? null : coPlatform.trim();
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate == null ? null : startDate.trim();
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate == null ? null : endDate.trim();
    }

    public String getRepayWay() {
        return repayWay;
    }

    public void setRepayWay(String repayWay) {
        this.repayWay = repayWay == null ? null : repayWay.trim();
    }

    public String getCrdMainType() {
        return crdMainType;
    }

    public void setCrdMainType(String crdMainType) {
        this.crdMainType = crdMainType == null ? null : crdMainType.trim();
    }

    public String getCrdSubType() {
        return crdSubType;
    }

    public void setCrdSubType(String crdSubType) {
        this.crdSubType = crdSubType == null ? null : crdSubType.trim();
    }

    public String getCoreTyp() {
        return coreTyp;
    }

    public void setCoreTyp(String coreTyp) {
        this.coreTyp = coreTyp == null ? null : coreTyp.trim();
    }

    public String getShortTyp() {
        return shortTyp;
    }

    public void setShortTyp(String shortTyp) {
        this.shortTyp = shortTyp == null ? null : shortTyp.trim();
    }

    public String getMetaTyp() {
        return metaTyp;
    }

    public void setMetaTyp(String metaTyp) {
        this.metaTyp = metaTyp == null ? null : metaTyp.trim();
    }

    public String getLongTyp() {
        return longTyp;
    }

    public void setLongTyp(String longTyp) {
        this.longTyp = longTyp == null ? null : longTyp.trim();
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay == null ? null : payWay.trim();
    }

    public BigDecimal getLoanAmtMax() {
        return loanAmtMax;
    }

    public void setLoanAmtMax(BigDecimal loanAmtMax) {
        this.loanAmtMax = loanAmtMax;
    }

    public BigDecimal getLoanAmtMin() {
        return loanAmtMin;
    }

    public void setLoanAmtMin(BigDecimal loanAmtMin) {
        this.loanAmtMin = loanAmtMin;
    }

    public BigDecimal getCreditAmtMax() {
        return creditAmtMax;
    }

    public void setCreditAmtMax(BigDecimal creditAmtMax) {
        this.creditAmtMax = creditAmtMax;
    }

    public BigDecimal getCreditAmtMin() {
        return creditAmtMin;
    }

    public void setCreditAmtMin(BigDecimal creditAmtMin) {
        this.creditAmtMin = creditAmtMin;
    }

    public BigDecimal getOverdueUpRate() {
        return overdueUpRate;
    }

    public void setOverdueUpRate(BigDecimal overdueUpRate) {
        this.overdueUpRate = overdueUpRate;
    }

    public BigDecimal getSpdbAccRate() {
        return spdbAccRate;
    }

    public void setSpdbAccRate(BigDecimal spdbAccRate) {
        this.spdbAccRate = spdbAccRate;
    }

    public BigDecimal getOnedayAppFailTimes() {
        return onedayAppFailTimes;
    }

    public void setOnedayAppFailTimes(BigDecimal onedayAppFailTimes) {
        this.onedayAppFailTimes = onedayAppFailTimes;
    }

    public BigDecimal getCrdFailDay() {
        return crdFailDay;
    }

    public void setCrdFailDay(BigDecimal crdFailDay) {
        this.crdFailDay = crdFailDay;
    }

    public BigDecimal getLoanFailDay() {
        return loanFailDay;
    }

    public void setLoanFailDay(BigDecimal loanFailDay) {
        this.loanFailDay = loanFailDay;
    }

    public BigDecimal getCrdTimeoutDay() {
        return crdTimeoutDay;
    }

    public void setCrdTimeoutDay(BigDecimal crdTimeoutDay) {
        this.crdTimeoutDay = crdTimeoutDay;
    }

    public BigDecimal getLoanTimeoutDay() {
        return loanTimeoutDay;
    }

    public void setLoanTimeoutDay(BigDecimal loanTimeoutDay) {
        this.loanTimeoutDay = loanTimeoutDay;
    }

    public BigDecimal getPspWarnDay() {
        return pspWarnDay;
    }

    public void setPspWarnDay(BigDecimal pspWarnDay) {
        this.pspWarnDay = pspWarnDay;
    }

    public BigDecimal getCanInterposeRatio() {
        return canInterposeRatio;
    }

    public void setCanInterposeRatio(BigDecimal canInterposeRatio) {
        this.canInterposeRatio = canInterposeRatio;
    }

    public String getInterposeTopDay() {
        return interposeTopDay;
    }

    public void setInterposeTopDay(String interposeTopDay) {
        this.interposeTopDay = interposeTopDay == null ? null : interposeTopDay.trim();
    }

    public String getCanCancelLmt() {
        return canCancelLmt;
    }

    public void setCanCancelLmt(String canCancelLmt) {
        this.canCancelLmt = canCancelLmt == null ? null : canCancelLmt.trim();
    }

    public String getCancelLmtLow() {
        return cancelLmtLow;
    }

    public void setCancelLmtLow(String cancelLmtLow) {
        this.cancelLmtLow = cancelLmtLow == null ? null : cancelLmtLow.trim();
    }

    public String getQueryUserId() {
        return queryUserId;
    }

    public void setQueryUserId(String queryUserId) {
        this.queryUserId = queryUserId == null ? null : queryUserId.trim();
    }

    public String getCycleFlag() {
        return cycleFlag;
    }

    public void setCycleFlag(String cycleFlag) {
        this.cycleFlag = cycleFlag == null ? null : cycleFlag.trim();
    }

    public String getLoanProp() {
        return loanProp;
    }

    public void setLoanProp(String loanProp) {
        this.loanProp = loanProp == null ? null : loanProp.trim();
    }

    public String getOrgGetType() {
        return orgGetType;
    }

    public void setOrgGetType(String orgGetType) {
        this.orgGetType = orgGetType == null ? null : orgGetType.trim();
    }

    public String getMsgAllChannel() {
        return msgAllChannel;
    }

    public void setMsgAllChannel(String msgAllChannel) {
        this.msgAllChannel = msgAllChannel == null ? null : msgAllChannel.trim();
    }

    public String getMsgInChannel() {
        return msgInChannel;
    }

    public void setMsgInChannel(String msgInChannel) {
        this.msgInChannel = msgInChannel == null ? null : msgInChannel.trim();
    }

    public String getApplyFlag() {
        return applyFlag;
    }

    public void setApplyFlag(String applyFlag) {
        this.applyFlag = applyFlag == null ? null : applyFlag.trim();
    }

    public String getLoanTermMin() {
        return loanTermMin;
    }

    public void setLoanTermMin(String loanTermMin) {
        this.loanTermMin = loanTermMin == null ? null : loanTermMin.trim();
    }

    public String getLoanTermMax() {
        return loanTermMax;
    }

    public void setLoanTermMax(String loanTermMax) {
        this.loanTermMax = loanTermMax == null ? null : loanTermMax.trim();
    }

    public String getLoanInnerAcc() {
        return loanInnerAcc;
    }

    public void setLoanInnerAcc(String loanInnerAcc) {
        this.loanInnerAcc = loanInnerAcc == null ? null : loanInnerAcc.trim();
    }

    public BigDecimal getPrdRateBp() {
        return prdRateBp;
    }

    public void setPrdRateBp(BigDecimal prdRateBp) {
        this.prdRateBp = prdRateBp;
    }

    public String getAcceptBranchId() {
        return acceptBranchId;
    }

    public void setAcceptBranchId(String acceptBranchId) {
        this.acceptBranchId = acceptBranchId == null ? null : acceptBranchId.trim();
    }

    public BigDecimal getBasicRate() {
        return basicRate;
    }

    public void setBasicRate(BigDecimal basicRate) {
        this.basicRate = basicRate;
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

    public String getQueryUserPw() {
        return queryUserPw;
    }

    public void setQueryUserPw(String queryUserPw) {
        this.queryUserPw = queryUserPw == null ? null : queryUserPw.trim();
    }

    public String getValidPeriod() {
        return validPeriod;
    }

    public void setValidPeriod(String validPeriod) {
        this.validPeriod = validPeriod == null ? null : validPeriod.trim();
    }

    public BigDecimal getMinRate() {
        return minRate;
    }

    public void setMinRate(BigDecimal minRate) {
        this.minRate = minRate;
    }

    public BigDecimal getMaxRate() {
        return maxRate;
    }

    public void setMaxRate(BigDecimal maxRate) {
        this.maxRate = maxRate;
    }
}