package com.bea.olp;

public class ACPT_RULE_INFO {
    private String appNo;

    private String prdCode;

    private String prdName;

    private String applyType;

    private String certType;

    private String certCodeLength;

    private String age;

    private String professionType;

    private String overdueNum;

    private String refuseNum;

    private String applyFailedNum;

    private String inputDate;

    private String inputTime;

    public String getAppNo() {
        return appNo;
    }

    public void setAppNo(String appNo) {
        this.appNo = appNo == null ? null : appNo.trim();
    }

    public String getPrdCode() {
        return prdCode;
    }

    public void setPrdCode(String prdCode) {
        this.prdCode = prdCode == null ? null : prdCode.trim();
    }

    public String getPrdName() {
        return prdName;
    }

    public void setPrdName(String prdName) {
        this.prdName = prdName == null ? null : prdName.trim();
    }

    public String getApplyType() {
        return applyType;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType == null ? null : applyType.trim();
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType == null ? null : certType.trim();
    }

    public String getCertCodeLength() {
        return certCodeLength;
    }

    public void setCertCodeLength(String certCodeLength) {
        this.certCodeLength = certCodeLength == null ? null : certCodeLength.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getProfessionType() {
        return professionType;
    }

    public void setProfessionType(String professionType) {
        this.professionType = professionType == null ? null : professionType.trim();
    }

    public String getOverdueNum() {
        return overdueNum;
    }

    public void setOverdueNum(String overdueNum) {
        this.overdueNum = overdueNum == null ? null : overdueNum.trim();
    }

    public String getRefuseNum() {
        return refuseNum;
    }

    public void setRefuseNum(String refuseNum) {
        this.refuseNum = refuseNum == null ? null : refuseNum.trim();
    }

    public String getApplyFailedNum() {
        return applyFailedNum;
    }

    public void setApplyFailedNum(String applyFailedNum) {
        this.applyFailedNum = applyFailedNum == null ? null : applyFailedNum.trim();
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