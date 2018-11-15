package com.bea.olp;

public class BIZ_CII_INFO {
    private String appNo;

    private String serverprovider;

    private String pbccheckresult;

    private String pbcissueoffice;

    private String pbcname;

    private String pbcid;

    private String resultflow;

    private String result;

    private String msg;

    private String inputDate;

    private String inputTime;

    private String lastUpdateDate;

    private String lastUpdateTime;

    private String status;

    public String getAppNo() {
        return appNo;
    }

    public void setAppNo(String appNo) {
        this.appNo = appNo == null ? null : appNo.trim();
    }

    public String getServerprovider() {
        return serverprovider;
    }

    public void setServerprovider(String serverprovider) {
        this.serverprovider = serverprovider == null ? null : serverprovider.trim();
    }

    public String getPbccheckresult() {
        return pbccheckresult;
    }

    public void setPbccheckresult(String pbccheckresult) {
        this.pbccheckresult = pbccheckresult == null ? null : pbccheckresult.trim();
    }

    public String getPbcissueoffice() {
        return pbcissueoffice;
    }

    public void setPbcissueoffice(String pbcissueoffice) {
        this.pbcissueoffice = pbcissueoffice == null ? null : pbcissueoffice.trim();
    }

    public String getPbcname() {
        return pbcname;
    }

    public void setPbcname(String pbcname) {
        this.pbcname = pbcname == null ? null : pbcname.trim();
    }

    public String getPbcid() {
        return pbcid;
    }

    public void setPbcid(String pbcid) {
        this.pbcid = pbcid == null ? null : pbcid.trim();
    }

    public String getResultflow() {
        return resultflow;
    }

    public void setResultflow(String resultflow) {
        this.resultflow = resultflow == null ? null : resultflow.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}