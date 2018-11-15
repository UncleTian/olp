package com.bea.olp;

public class BIZ_TD_PLATFORM_DETAIL extends BIZ_TD_PLATFORM_DETAILKey {
    private String description;

    private String platformCount;

    private String platformDetailDimension;

    private String platformDetail;

    private String inputDate;

    private String inputTime;

    private String lastUpdateDate;

    private String lastUpdateTime;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getPlatformCount() {
        return platformCount;
    }

    public void setPlatformCount(String platformCount) {
        this.platformCount = platformCount == null ? null : platformCount.trim();
    }

    public String getPlatformDetailDimension() {
        return platformDetailDimension;
    }

    public void setPlatformDetailDimension(String platformDetailDimension) {
        this.platformDetailDimension = platformDetailDimension == null ? null : platformDetailDimension.trim();
    }

    public String getPlatformDetail() {
        return platformDetail;
    }

    public void setPlatformDetail(String platformDetail) {
        this.platformDetail = platformDetail == null ? null : platformDetail.trim();
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