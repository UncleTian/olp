package com.bea.olp;

public class IF_BATSMS_MANAGE {
    private String serno;

    private String smsProp;

    private String conCode;

    private String planSendDate;

    private String planSendStrTime;

    private String planSendEndTime;

    private String smsInfo;

    private String fileName;

    private Long phoneTotalNum;

    private String deptNo;

    private Long dtSn;

    private String state;

    private String lastUpdateTime;

    public String getSerno() {
        return serno;
    }

    public void setSerno(String serno) {
        this.serno = serno == null ? null : serno.trim();
    }

    public String getSmsProp() {
        return smsProp;
    }

    public void setSmsProp(String smsProp) {
        this.smsProp = smsProp == null ? null : smsProp.trim();
    }

    public String getConCode() {
        return conCode;
    }

    public void setConCode(String conCode) {
        this.conCode = conCode == null ? null : conCode.trim();
    }

    public String getPlanSendDate() {
        return planSendDate;
    }

    public void setPlanSendDate(String planSendDate) {
        this.planSendDate = planSendDate == null ? null : planSendDate.trim();
    }

    public String getPlanSendStrTime() {
        return planSendStrTime;
    }

    public void setPlanSendStrTime(String planSendStrTime) {
        this.planSendStrTime = planSendStrTime == null ? null : planSendStrTime.trim();
    }

    public String getPlanSendEndTime() {
        return planSendEndTime;
    }

    public void setPlanSendEndTime(String planSendEndTime) {
        this.planSendEndTime = planSendEndTime == null ? null : planSendEndTime.trim();
    }

    public String getSmsInfo() {
        return smsInfo;
    }

    public void setSmsInfo(String smsInfo) {
        this.smsInfo = smsInfo == null ? null : smsInfo.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public Long getPhoneTotalNum() {
        return phoneTotalNum;
    }

    public void setPhoneTotalNum(Long phoneTotalNum) {
        this.phoneTotalNum = phoneTotalNum;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo == null ? null : deptNo.trim();
    }

    public Long getDtSn() {
        return dtSn;
    }

    public void setDtSn(Long dtSn) {
        this.dtSn = dtSn;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime == null ? null : lastUpdateTime.trim();
    }
}