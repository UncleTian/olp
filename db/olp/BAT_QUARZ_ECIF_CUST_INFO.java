package com.bea.olp;

public class BAT_QUARZ_ECIF_CUST_INFO {
    private String cusId;

    private String chName;

    private String enName;

    private String goveIdenNum;

    private String status;

    private String errorCod;

    private String errorMsg;

    private String channelType;

    private String lastUpdateDate;

    private String lastUpdateTime;

    private String extClientNo;

    private String dataDate;

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId == null ? null : cusId.trim();
    }

    public String getChName() {
        return chName;
    }

    public void setChName(String chName) {
        this.chName = chName == null ? null : chName.trim();
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
    }

    public String getGoveIdenNum() {
        return goveIdenNum;
    }

    public void setGoveIdenNum(String goveIdenNum) {
        this.goveIdenNum = goveIdenNum == null ? null : goveIdenNum.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getErrorCod() {
        return errorCod;
    }

    public void setErrorCod(String errorCod) {
        this.errorCod = errorCod == null ? null : errorCod.trim();
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg == null ? null : errorMsg.trim();
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType == null ? null : channelType.trim();
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

    public String getExtClientNo() {
        return extClientNo;
    }

    public void setExtClientNo(String extClientNo) {
        this.extClientNo = extClientNo == null ? null : extClientNo.trim();
    }

    public String getDataDate() {
        return dataDate;
    }

    public void setDataDate(String dataDate) {
        this.dataDate = dataDate == null ? null : dataDate.trim();
    }
}