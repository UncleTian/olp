package com.bea.olp;

public class CFG_ECIF_AREA_INFO {
    private String cityCode;

    private String cityDesc;

    private String version;

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getCityDesc() {
        return cityDesc;
    }

    public void setCityDesc(String cityDesc) {
        this.cityDesc = cityDesc == null ? null : cityDesc.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }
}