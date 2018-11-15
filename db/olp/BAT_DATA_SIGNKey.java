package com.bea.olp;

public class BAT_DATA_SIGNKey {
    private String dtDate;

    private String tableName;

    private String sysName;

    public String getDtDate() {
        return dtDate;
    }

    public void setDtDate(String dtDate) {
        this.dtDate = dtDate == null ? null : dtDate.trim();
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName == null ? null : sysName.trim();
    }
}