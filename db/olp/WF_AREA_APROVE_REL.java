package com.bea.olp;

public class WF_AREA_APROVE_REL {
    private String id;

    private String areaOrgId;

    private String areaOrgName;

    private String subOrgId;

    private String subOrgName;

    private String createTime;

    private String lastUpdOprId;

    private String lastUpdPgmId;

    private String lastUpdTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAreaOrgId() {
        return areaOrgId;
    }

    public void setAreaOrgId(String areaOrgId) {
        this.areaOrgId = areaOrgId == null ? null : areaOrgId.trim();
    }

    public String getAreaOrgName() {
        return areaOrgName;
    }

    public void setAreaOrgName(String areaOrgName) {
        this.areaOrgName = areaOrgName == null ? null : areaOrgName.trim();
    }

    public String getSubOrgId() {
        return subOrgId;
    }

    public void setSubOrgId(String subOrgId) {
        this.subOrgId = subOrgId == null ? null : subOrgId.trim();
    }

    public String getSubOrgName() {
        return subOrgName;
    }

    public void setSubOrgName(String subOrgName) {
        this.subOrgName = subOrgName == null ? null : subOrgName.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getLastUpdOprId() {
        return lastUpdOprId;
    }

    public void setLastUpdOprId(String lastUpdOprId) {
        this.lastUpdOprId = lastUpdOprId == null ? null : lastUpdOprId.trim();
    }

    public String getLastUpdPgmId() {
        return lastUpdPgmId;
    }

    public void setLastUpdPgmId(String lastUpdPgmId) {
        this.lastUpdPgmId = lastUpdPgmId == null ? null : lastUpdPgmId.trim();
    }

    public String getLastUpdTime() {
        return lastUpdTime;
    }

    public void setLastUpdTime(String lastUpdTime) {
        this.lastUpdTime = lastUpdTime == null ? null : lastUpdTime.trim();
    }
}