package com.bea.olp;

public class S_LOG {
    private String logDt;

    private String logTime;

    private String logLevel;

    private String logCategory;

    private String logThread;

    public String getLogDt() {
        return logDt;
    }

    public void setLogDt(String logDt) {
        this.logDt = logDt == null ? null : logDt.trim();
    }

    public String getLogTime() {
        return logTime;
    }

    public void setLogTime(String logTime) {
        this.logTime = logTime == null ? null : logTime.trim();
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel == null ? null : logLevel.trim();
    }

    public String getLogCategory() {
        return logCategory;
    }

    public void setLogCategory(String logCategory) {
        this.logCategory = logCategory == null ? null : logCategory.trim();
    }

    public String getLogThread() {
        return logThread;
    }

    public void setLogThread(String logThread) {
        this.logThread = logThread == null ? null : logThread.trim();
    }
}