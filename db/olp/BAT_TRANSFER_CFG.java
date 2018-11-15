package com.bea.olp;

public class BAT_TRANSFER_CFG {
    private String taskNo;

    private String ip;

    private String port;

    private String username;

    private String userpsw;

    private String hostno;

    private String routeno;

    private String workDir;

    private String localDir;

    private String remoteDir;

    private String remarks;

    private String opUserId;

    private String opOrgId;

    private String inputDate;

    private String inputTime;

    private String lastUpdateDate;

    private String lastUpdateTime;

    public String getTaskNo() {
        return taskNo;
    }

    public void setTaskNo(String taskNo) {
        this.taskNo = taskNo == null ? null : taskNo.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port == null ? null : port.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpsw() {
        return userpsw;
    }

    public void setUserpsw(String userpsw) {
        this.userpsw = userpsw == null ? null : userpsw.trim();
    }

    public String getHostno() {
        return hostno;
    }

    public void setHostno(String hostno) {
        this.hostno = hostno == null ? null : hostno.trim();
    }

    public String getRouteno() {
        return routeno;
    }

    public void setRouteno(String routeno) {
        this.routeno = routeno == null ? null : routeno.trim();
    }

    public String getWorkDir() {
        return workDir;
    }

    public void setWorkDir(String workDir) {
        this.workDir = workDir == null ? null : workDir.trim();
    }

    public String getLocalDir() {
        return localDir;
    }

    public void setLocalDir(String localDir) {
        this.localDir = localDir == null ? null : localDir.trim();
    }

    public String getRemoteDir() {
        return remoteDir;
    }

    public void setRemoteDir(String remoteDir) {
        this.remoteDir = remoteDir == null ? null : remoteDir.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getOpUserId() {
        return opUserId;
    }

    public void setOpUserId(String opUserId) {
        this.opUserId = opUserId == null ? null : opUserId.trim();
    }

    public String getOpOrgId() {
        return opOrgId;
    }

    public void setOpOrgId(String opOrgId) {
        this.opOrgId = opOrgId == null ? null : opOrgId.trim();
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