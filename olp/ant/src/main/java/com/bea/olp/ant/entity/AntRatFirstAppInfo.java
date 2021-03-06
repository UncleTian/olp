package com.bea.olp.ant.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AntRatFirstAppInfo {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = true)
    private String tpNo;
    @Column(nullable = true)
    private String applyNo;
    @Column(nullable = true)
    private String functionId;
    @Column(nullable = true)
    private String reqTime;
    @Column(nullable = true)
    private String tranDate;
    @Column(nullable = true)
    private String channelType;
    @Column(nullable = true)
    private String coPlatform;
    @Column(nullable = true)
    private String loanProp;
    @Column(nullable = true)
    private String prdType;
    @Column(nullable = true)
    private String prdCode;
    @Column(nullable = true)
    private String certType;
    @Column(nullable = true)
    private String certCode;
    @Column(nullable = true)
    private String certValidDate;
    @Column(nullable = true)
    private String custName;
    @Column(nullable = true)
    private String phone;
    @Column(nullable = true)
    private String zmAuthFlag;
    @Column(nullable = true)
    private String hasJbAdmit;
    @Column(nullable = true)
    private String field1;
    @Column(nullable = true)
    private String field2;
    @Column(nullable = true)
    private String field3;
 
    @Column(nullable = true)
    private String inputDate;
    @Column(nullable = true)
    private String inputTime;

    public String getTpNo() {
        return tpNo;
    }

    public void setTpNo(String tpNo) {
        this.tpNo = tpNo == null ? null : tpNo.trim();
    }

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo == null ? null : applyNo.trim();
    }

    public String getFunctionId() {
        return functionId;
    }

    public void setFunctionId(String functionId) {
        this.functionId = functionId == null ? null : functionId.trim();
    }

    public String getReqTime() {
        return reqTime;
    }

    public void setReqTime(String reqTime) {
        this.reqTime = reqTime == null ? null : reqTime.trim();
    }

    public String getTranDate() {
        return tranDate;
    }

    public void setTranDate(String tranDate) {
        this.tranDate = tranDate == null ? null : tranDate.trim();
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

    public String getCertValidDate() {
        return certValidDate;
    }

    public void setCertValidDate(String certValidDate) {
        this.certValidDate = certValidDate == null ? null : certValidDate.trim();
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

    public String getZmAuthFlag() {
        return zmAuthFlag;
    }

    public void setZmAuthFlag(String zmAuthFlag) {
        this.zmAuthFlag = zmAuthFlag == null ? null : zmAuthFlag.trim();
    }

    public String getHasJbAdmit() {
        return hasJbAdmit;
    }

    public void setHasJbAdmit(String hasJbAdmit) {
        this.hasJbAdmit = hasJbAdmit == null ? null : hasJbAdmit.trim();
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1 == null ? null : field1.trim();
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2 == null ? null : field2.trim();
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3 == null ? null : field3.trim();
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