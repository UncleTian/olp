package com.bea.olp;

import java.math.BigDecimal;

public class BIZ_FEEDBACK_RESULT {
    private String appNo;

    private String applyNo;

    private String certCode;

    private String certType;

    private String stockCustFlag;

    private BigDecimal cardBal;

    private BigDecimal last3mDayAvgBal;

    private BigDecimal last6mDayAvgBal;

    private BigDecimal last3mBankInAmt;

    private BigDecimal last3mBankOutAmt;

    private BigDecimal last6mBankInAmt;

    private BigDecimal last6mBankOutAmt;

    private String stockFinanceCustFlag;

    private String stockInsurCustFlag;

    private String stockLoanCustFlag;

    private String bondCustFlag;

    private String tpCustFlag;

    private String payingWagesCustFlag;

    private String coalCustFlag;

    private String operatorFlag;

    private String operatorFrom;

    private String stockCreditCustFlag;

    private BigDecimal creditCrdAmt;

    private BigDecimal creditUsedAmt;

    private String workUnit;

    private String workUnitFrom;

    private String position;

    private String positionFrom;

    private String industry;

    private String industryFrom;

    private Integer workYears;

    private String workYearsFrom;

    private BigDecimal monthIncome;

    private String monthIncomeFrom;

    private String marrStatus;

    private String marrStatusFrom;

    private String blackList;

    private String queryEduFlag;

    private String schoolName;

    private String eduLevel;

    private String eduType;

    private String schoolYear;

    private String hitBlackListFlag;

    private String inputDate;

    private String inputTime;

    public String getAppNo() {
        return appNo;
    }

    public void setAppNo(String appNo) {
        this.appNo = appNo == null ? null : appNo.trim();
    }

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo == null ? null : applyNo.trim();
    }

    public String getCertCode() {
        return certCode;
    }

    public void setCertCode(String certCode) {
        this.certCode = certCode == null ? null : certCode.trim();
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType == null ? null : certType.trim();
    }

    public String getStockCustFlag() {
        return stockCustFlag;
    }

    public void setStockCustFlag(String stockCustFlag) {
        this.stockCustFlag = stockCustFlag == null ? null : stockCustFlag.trim();
    }

    public BigDecimal getCardBal() {
        return cardBal;
    }

    public void setCardBal(BigDecimal cardBal) {
        this.cardBal = cardBal;
    }

    public BigDecimal getLast3mDayAvgBal() {
        return last3mDayAvgBal;
    }

    public void setLast3mDayAvgBal(BigDecimal last3mDayAvgBal) {
        this.last3mDayAvgBal = last3mDayAvgBal;
    }

    public BigDecimal getLast6mDayAvgBal() {
        return last6mDayAvgBal;
    }

    public void setLast6mDayAvgBal(BigDecimal last6mDayAvgBal) {
        this.last6mDayAvgBal = last6mDayAvgBal;
    }

    public BigDecimal getLast3mBankInAmt() {
        return last3mBankInAmt;
    }

    public void setLast3mBankInAmt(BigDecimal last3mBankInAmt) {
        this.last3mBankInAmt = last3mBankInAmt;
    }

    public BigDecimal getLast3mBankOutAmt() {
        return last3mBankOutAmt;
    }

    public void setLast3mBankOutAmt(BigDecimal last3mBankOutAmt) {
        this.last3mBankOutAmt = last3mBankOutAmt;
    }

    public BigDecimal getLast6mBankInAmt() {
        return last6mBankInAmt;
    }

    public void setLast6mBankInAmt(BigDecimal last6mBankInAmt) {
        this.last6mBankInAmt = last6mBankInAmt;
    }

    public BigDecimal getLast6mBankOutAmt() {
        return last6mBankOutAmt;
    }

    public void setLast6mBankOutAmt(BigDecimal last6mBankOutAmt) {
        this.last6mBankOutAmt = last6mBankOutAmt;
    }

    public String getStockFinanceCustFlag() {
        return stockFinanceCustFlag;
    }

    public void setStockFinanceCustFlag(String stockFinanceCustFlag) {
        this.stockFinanceCustFlag = stockFinanceCustFlag == null ? null : stockFinanceCustFlag.trim();
    }

    public String getStockInsurCustFlag() {
        return stockInsurCustFlag;
    }

    public void setStockInsurCustFlag(String stockInsurCustFlag) {
        this.stockInsurCustFlag = stockInsurCustFlag == null ? null : stockInsurCustFlag.trim();
    }

    public String getStockLoanCustFlag() {
        return stockLoanCustFlag;
    }

    public void setStockLoanCustFlag(String stockLoanCustFlag) {
        this.stockLoanCustFlag = stockLoanCustFlag == null ? null : stockLoanCustFlag.trim();
    }

    public String getBondCustFlag() {
        return bondCustFlag;
    }

    public void setBondCustFlag(String bondCustFlag) {
        this.bondCustFlag = bondCustFlag == null ? null : bondCustFlag.trim();
    }

    public String getTpCustFlag() {
        return tpCustFlag;
    }

    public void setTpCustFlag(String tpCustFlag) {
        this.tpCustFlag = tpCustFlag == null ? null : tpCustFlag.trim();
    }

    public String getPayingWagesCustFlag() {
        return payingWagesCustFlag;
    }

    public void setPayingWagesCustFlag(String payingWagesCustFlag) {
        this.payingWagesCustFlag = payingWagesCustFlag == null ? null : payingWagesCustFlag.trim();
    }

    public String getCoalCustFlag() {
        return coalCustFlag;
    }

    public void setCoalCustFlag(String coalCustFlag) {
        this.coalCustFlag = coalCustFlag == null ? null : coalCustFlag.trim();
    }

    public String getOperatorFlag() {
        return operatorFlag;
    }

    public void setOperatorFlag(String operatorFlag) {
        this.operatorFlag = operatorFlag == null ? null : operatorFlag.trim();
    }

    public String getOperatorFrom() {
        return operatorFrom;
    }

    public void setOperatorFrom(String operatorFrom) {
        this.operatorFrom = operatorFrom == null ? null : operatorFrom.trim();
    }

    public String getStockCreditCustFlag() {
        return stockCreditCustFlag;
    }

    public void setStockCreditCustFlag(String stockCreditCustFlag) {
        this.stockCreditCustFlag = stockCreditCustFlag == null ? null : stockCreditCustFlag.trim();
    }

    public BigDecimal getCreditCrdAmt() {
        return creditCrdAmt;
    }

    public void setCreditCrdAmt(BigDecimal creditCrdAmt) {
        this.creditCrdAmt = creditCrdAmt;
    }

    public BigDecimal getCreditUsedAmt() {
        return creditUsedAmt;
    }

    public void setCreditUsedAmt(BigDecimal creditUsedAmt) {
        this.creditUsedAmt = creditUsedAmt;
    }

    public String getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit == null ? null : workUnit.trim();
    }

    public String getWorkUnitFrom() {
        return workUnitFrom;
    }

    public void setWorkUnitFrom(String workUnitFrom) {
        this.workUnitFrom = workUnitFrom == null ? null : workUnitFrom.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getPositionFrom() {
        return positionFrom;
    }

    public void setPositionFrom(String positionFrom) {
        this.positionFrom = positionFrom == null ? null : positionFrom.trim();
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getIndustryFrom() {
        return industryFrom;
    }

    public void setIndustryFrom(String industryFrom) {
        this.industryFrom = industryFrom == null ? null : industryFrom.trim();
    }

    public Integer getWorkYears() {
        return workYears;
    }

    public void setWorkYears(Integer workYears) {
        this.workYears = workYears;
    }

    public String getWorkYearsFrom() {
        return workYearsFrom;
    }

    public void setWorkYearsFrom(String workYearsFrom) {
        this.workYearsFrom = workYearsFrom == null ? null : workYearsFrom.trim();
    }

    public BigDecimal getMonthIncome() {
        return monthIncome;
    }

    public void setMonthIncome(BigDecimal monthIncome) {
        this.monthIncome = monthIncome;
    }

    public String getMonthIncomeFrom() {
        return monthIncomeFrom;
    }

    public void setMonthIncomeFrom(String monthIncomeFrom) {
        this.monthIncomeFrom = monthIncomeFrom == null ? null : monthIncomeFrom.trim();
    }

    public String getMarrStatus() {
        return marrStatus;
    }

    public void setMarrStatus(String marrStatus) {
        this.marrStatus = marrStatus == null ? null : marrStatus.trim();
    }

    public String getMarrStatusFrom() {
        return marrStatusFrom;
    }

    public void setMarrStatusFrom(String marrStatusFrom) {
        this.marrStatusFrom = marrStatusFrom == null ? null : marrStatusFrom.trim();
    }

    public String getBlackList() {
        return blackList;
    }

    public void setBlackList(String blackList) {
        this.blackList = blackList == null ? null : blackList.trim();
    }

    public String getQueryEduFlag() {
        return queryEduFlag;
    }

    public void setQueryEduFlag(String queryEduFlag) {
        this.queryEduFlag = queryEduFlag == null ? null : queryEduFlag.trim();
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName == null ? null : schoolName.trim();
    }

    public String getEduLevel() {
        return eduLevel;
    }

    public void setEduLevel(String eduLevel) {
        this.eduLevel = eduLevel == null ? null : eduLevel.trim();
    }

    public String getEduType() {
        return eduType;
    }

    public void setEduType(String eduType) {
        this.eduType = eduType == null ? null : eduType.trim();
    }

    public String getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear == null ? null : schoolYear.trim();
    }

    public String getHitBlackListFlag() {
        return hitBlackListFlag;
    }

    public void setHitBlackListFlag(String hitBlackListFlag) {
        this.hitBlackListFlag = hitBlackListFlag == null ? null : hitBlackListFlag.trim();
    }

    public String getInputDate() {
        return inputDate;
    }

    public void setInputDate(String inputDate) {
        this.inputDate = inputDate == null ? null : inputDate.trim();
    }

    public String getInputTime() {
        return inputTime;
    }

    public void setInputTime(String inputTime) {
        this.inputTime = inputTime == null ? null : inputTime.trim();
    }
}