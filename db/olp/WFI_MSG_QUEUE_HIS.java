package com.bea.olp;

public class WFI_MSG_QUEUE_HIS {
    private String msgid;

    private String applType;

    private String instanceid;

    private String wfsign;

    private String nodeid;

    private String scene;

    private String bizTableName;

    private String pkCol;

    private String pkValue;

    private String userId;

    private String orgId;

    private String wfiResult;

    private String wfiStatus;

    private String opstatus;

    private String optime;

    public String getMsgid() {
        return msgid;
    }

    public void setMsgid(String msgid) {
        this.msgid = msgid == null ? null : msgid.trim();
    }

    public String getApplType() {
        return applType;
    }

    public void setApplType(String applType) {
        this.applType = applType == null ? null : applType.trim();
    }

    public String getInstanceid() {
        return instanceid;
    }

    public void setInstanceid(String instanceid) {
        this.instanceid = instanceid == null ? null : instanceid.trim();
    }

    public String getWfsign() {
        return wfsign;
    }

    public void setWfsign(String wfsign) {
        this.wfsign = wfsign == null ? null : wfsign.trim();
    }

    public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid == null ? null : nodeid.trim();
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene == null ? null : scene.trim();
    }

    public String getBizTableName() {
        return bizTableName;
    }

    public void setBizTableName(String bizTableName) {
        this.bizTableName = bizTableName == null ? null : bizTableName.trim();
    }

    public String getPkCol() {
        return pkCol;
    }

    public void setPkCol(String pkCol) {
        this.pkCol = pkCol == null ? null : pkCol.trim();
    }

    public String getPkValue() {
        return pkValue;
    }

    public void setPkValue(String pkValue) {
        this.pkValue = pkValue == null ? null : pkValue.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getWfiResult() {
        return wfiResult;
    }

    public void setWfiResult(String wfiResult) {
        this.wfiResult = wfiResult == null ? null : wfiResult.trim();
    }

    public String getWfiStatus() {
        return wfiStatus;
    }

    public void setWfiStatus(String wfiStatus) {
        this.wfiStatus = wfiStatus == null ? null : wfiStatus.trim();
    }

    public String getOpstatus() {
        return opstatus;
    }

    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus == null ? null : opstatus.trim();
    }

    public String getOptime() {
        return optime;
    }

    public void setOptime(String optime) {
        this.optime = optime == null ? null : optime.trim();
    }
}