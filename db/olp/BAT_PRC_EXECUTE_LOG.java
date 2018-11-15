package com.bea.olp;

import java.util.Date;

public class BAT_PRC_EXECUTE_LOG {
    private String serno;

    private String prcName;

    private String targetTable;

    private String sourceTable;

    private String exeOrderId;

    private String exeDesc;

    private Date exeStartDt;

    private Date exeEndDt;

    private Short exeDt;

    private String exeRowcount;

    private String exeSql;

    private String exeCode;

    private String exeErrMsg;

    public String getSerno() {
        return serno;
    }

    public void setSerno(String serno) {
        this.serno = serno == null ? null : serno.trim();
    }

    public String getPrcName() {
        return prcName;
    }

    public void setPrcName(String prcName) {
        this.prcName = prcName == null ? null : prcName.trim();
    }

    public String getTargetTable() {
        return targetTable;
    }

    public void setTargetTable(String targetTable) {
        this.targetTable = targetTable == null ? null : targetTable.trim();
    }

    public String getSourceTable() {
        return sourceTable;
    }

    public void setSourceTable(String sourceTable) {
        this.sourceTable = sourceTable == null ? null : sourceTable.trim();
    }

    public String getExeOrderId() {
        return exeOrderId;
    }

    public void setExeOrderId(String exeOrderId) {
        this.exeOrderId = exeOrderId == null ? null : exeOrderId.trim();
    }

    public String getExeDesc() {
        return exeDesc;
    }

    public void setExeDesc(String exeDesc) {
        this.exeDesc = exeDesc == null ? null : exeDesc.trim();
    }

    public Date getExeStartDt() {
        return exeStartDt;
    }

    public void setExeStartDt(Date exeStartDt) {
        this.exeStartDt = exeStartDt;
    }

    public Date getExeEndDt() {
        return exeEndDt;
    }

    public void setExeEndDt(Date exeEndDt) {
        this.exeEndDt = exeEndDt;
    }

    public Short getExeDt() {
        return exeDt;
    }

    public void setExeDt(Short exeDt) {
        this.exeDt = exeDt;
    }

    public String getExeRowcount() {
        return exeRowcount;
    }

    public void setExeRowcount(String exeRowcount) {
        this.exeRowcount = exeRowcount == null ? null : exeRowcount.trim();
    }

    public String getExeSql() {
        return exeSql;
    }

    public void setExeSql(String exeSql) {
        this.exeSql = exeSql == null ? null : exeSql.trim();
    }

    public String getExeCode() {
        return exeCode;
    }

    public void setExeCode(String exeCode) {
        this.exeCode = exeCode == null ? null : exeCode.trim();
    }

    public String getExeErrMsg() {
        return exeErrMsg;
    }

    public void setExeErrMsg(String exeErrMsg) {
        this.exeErrMsg = exeErrMsg == null ? null : exeErrMsg.trim();
    }
}