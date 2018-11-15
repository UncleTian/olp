package com.bea.olp;

public class BIZ_FIRST_CREDIT_INFOWithBLOBs extends BIZ_FIRST_CREDIT_INFO {
    private String pbocInfo;

    private String zmInfo;

    private String extInfo;

    public String getPbocInfo() {
        return pbocInfo;
    }

    public void setPbocInfo(String pbocInfo) {
        this.pbocInfo = pbocInfo == null ? null : pbocInfo.trim();
    }

    public String getZmInfo() {
        return zmInfo;
    }

    public void setZmInfo(String zmInfo) {
        this.zmInfo = zmInfo == null ? null : zmInfo.trim();
    }

    public String getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo == null ? null : extInfo.trim();
    }
}