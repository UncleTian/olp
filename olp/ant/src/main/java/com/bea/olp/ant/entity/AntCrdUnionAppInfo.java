package com.bea.olp.ant.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AntCrdUnionAppInfo {

    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String appNo;
    @Column
    private String applyNo;
    @Column
    private String crdNo;
    @Column
    private String tpNo;
    @Column
    private String channelType;
    @Column
    private String coPlatform;
    @Column
    private String loanProp;
    @Column
    private String prdType;
    @Column
    private String prdCode;
    @Column
    private String hasJbAdmit;
    @Column
    private String certType;
    @Column
    private String certCode;
    @Column
    private String custName;
    @Column
    private String phone;
    @Column
    private String crdMainType;
    @Column
    private String crdSubType;
    @Column
    private BigDecimal apprAmt;
    @Column
    private BigDecimal execRate;
    @Column
    private String firstAppDate;
    @Column
    private String secondAppDate;
    @Column
    private String firstAppStatus;
    @Column
    private String secondAppStatus;
    @Column
    private String firstApprPassDate;
    @Column
    private String firstApprPassTime;
    @Column
    private String secondApprPassDate;
    @Column
    private String secondApprPassTime;
    @Column
    private String firstGenReason;
    @Column
    private String firstSubReason;
    @Column
    private String secondGenReason;
    @Column
    private String secondSubReason;
    @Column
    private String inputDate;
    @Column
    private String inputTime;
    @Column
    private String lastUpdateDate;
    @Column
    private String lastUpdateTime;
    
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

    public String getCrdNo() {
        return crdNo;
    }

    public void setCrdNo(String crdNo) {
        this.crdNo = crdNo == null ? null : crdNo.trim();
    }

    public String getTpNo() {
        return tpNo;
    }

    public void setTpNo(String tpNo) {
        this.tpNo = tpNo == null ? null : tpNo.trim();
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType == null ? null : channelType.trim();
    }

    public String getCoPlatform() {
        return coPlatform;
    }

    public void setCoPlatform(String coPlatform) {
        this.coPlatform = coPlatform == null ? null : coPlatform.trim();
    }

    public String getLoanProp() {
        return loanProp;
    }

    public void setLoanProp(String loanProp) {
        this.loanProp = loanProp == null ? null : loanProp.trim();
    }

    public String getPrdType() {
        return prdType;
    }

    public void setPrdType(String prdType) {
        this.prdType = prdType == null ? null : prdType.trim();
    }

    public String getPrdCode() {
        return prdCode;
    }

    public void setPrdCode(String prdCode) {
        this.prdCode = prdCode == null ? null : prdCode.trim();
    }

    public String getHasJbAdmit() {
        return hasJbAdmit;
    }

    public void setHasJbAdmit(String hasJbAdmit) {
        this.hasJbAdmit = hasJbAdmit == null ? null : hasJbAdmit.trim();
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

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
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

    public BigDecimal getApprAmt() {
        return apprAmt;
    }

    public void setApprAmt(BigDecimal apprAmt) {
        this.apprAmt = apprAmt;
    }

    public BigDecimal getExecRate() {
        return execRate;
    }

    public void setExecRate(BigDecimal execRate) {
        this.execRate = execRate;
    }

    public String getFirstAppDate() {
        return firstAppDate;
    }

    public void setFirstAppDate(String firstAppDate) {
        this.firstAppDate = firstAppDate == null ? null : firstAppDate.trim();
    }

    public String getSecondAppDate() {
        return secondAppDate;
    }

    public void setSecondAppDate(String secondAppDate) {
        this.secondAppDate = secondAppDate == null ? null : secondAppDate.trim();
    }

    public String getFirstAppStatus() {
        return firstAppStatus;
    }

    public void setFirstAppStatus(String firstAppStatus) {
        this.firstAppStatus = firstAppStatus == null ? null : firstAppStatus.trim();
    }

    public String getSecondAppStatus() {
        return secondAppStatus;
    }

    public void setSecondAppStatus(String secondAppStatus) {
        this.secondAppStatus = secondAppStatus == null ? null : secondAppStatus.trim();
    }

    public String getFirstApprPassDate() {
        return firstApprPassDate;
    }

    public void setFirstApprPassDate(String firstApprPassDate) {
        this.firstApprPassDate = firstApprPassDate == null ? null : firstApprPassDate.trim();
    }

    public String getFirstApprPassTime() {
        return firstApprPassTime;
    }

    public void setFirstApprPassTime(String firstApprPassTime) {
        this.firstApprPassTime = firstApprPassTime == null ? null : firstApprPassTime.trim();
    }

    public String getSecondApprPassDate() {
        return secondApprPassDate;
    }

    public void setSecondApprPassDate(String secondApprPassDate) {
        this.secondApprPassDate = secondApprPassDate == null ? null : secondApprPassDate.trim();
    }

    public String getSecondApprPassTime() {
        return secondApprPassTime;
    }

    public void setSecondApprPassTime(String secondApprPassTime) {
        this.secondApprPassTime = secondApprPassTime == null ? null : secondApprPassTime.trim();
    }

    public String getFirstGenReason() {
        return firstGenReason;
    }

    public void setFirstGenReason(String firstGenReason) {
        this.firstGenReason = firstGenReason == null ? null : firstGenReason.trim();
    }

    public String getFirstSubReason() {
        return firstSubReason;
    }

    public void setFirstSubReason(String firstSubReason) {
        this.firstSubReason = firstSubReason == null ? null : firstSubReason.trim();
    }

    public String getSecondGenReason() {
        return secondGenReason;
    }

    public void setSecondGenReason(String secondGenReason) {
        this.secondGenReason = secondGenReason == null ? null : secondGenReason.trim();
    }

    public String getSecondSubReason() {
        return secondSubReason;
    }

    public void setSecondSubReason(String secondSubReason) {
        this.secondSubReason = secondSubReason == null ? null : secondSubReason.trim();
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

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate == null ? null : lastUpdateDate.trim();
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime == null ? null : lastUpdateTime.trim();
    }
}