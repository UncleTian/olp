package com.bea.olp;

public class BAT_QUARZ_HEHE_INFO {
    private String loanNo;

    private String idFrontPath;

    private String idBackPath;

    private String status;

    private String dataDate;

    private String lastUpdateDate;

    private String lastUpdateTime;

    public String getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(String loanNo) {
        this.loanNo = loanNo == null ? null : loanNo.trim();
    }

    public String getIdFrontPath() {
        return idFrontPath;
    }

    public void setIdFrontPath(String idFrontPath) {
        this.idFrontPath = idFrontPath == null ? null : idFrontPath.trim();
    }

    public String getIdBackPath() {
        return idBackPath;
    }

    public void setIdBackPath(String idBackPath) {
        this.idBackPath = idBackPath == null ? null : idBackPath.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getDataDate() {
        return dataDate;
    }

    public void setDataDate(String dataDate) {
        this.dataDate = dataDate == null ? null : dataDate.trim();
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