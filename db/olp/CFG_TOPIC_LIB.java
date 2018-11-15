package com.bea.olp;

public class CFG_TOPIC_LIB {
    private String questionNo;

    private String prdCode;

    private String questionDescribe;

    private String questionResult;

    private String status;

    private String bizOpId;

    private String bizOrgId;

    private String inputDate;

    private String inputTime;

    private String lastUpdateDate;

    private String lastUpdateTime;

    public String getQuestionNo() {
        return questionNo;
    }

    public void setQuestionNo(String questionNo) {
        this.questionNo = questionNo == null ? null : questionNo.trim();
    }

    public String getPrdCode() {
        return prdCode;
    }

    public void setPrdCode(String prdCode) {
        this.prdCode = prdCode == null ? null : prdCode.trim();
    }

    public String getQuestionDescribe() {
        return questionDescribe;
    }

    public void setQuestionDescribe(String questionDescribe) {
        this.questionDescribe = questionDescribe == null ? null : questionDescribe.trim();
    }

    public String getQuestionResult() {
        return questionResult;
    }

    public void setQuestionResult(String questionResult) {
        this.questionResult = questionResult == null ? null : questionResult.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getBizOpId() {
        return bizOpId;
    }

    public void setBizOpId(String bizOpId) {
        this.bizOpId = bizOpId == null ? null : bizOpId.trim();
    }

    public String getBizOrgId() {
        return bizOrgId;
    }

    public void setBizOrgId(String bizOrgId) {
        this.bizOrgId = bizOrgId == null ? null : bizOrgId.trim();
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