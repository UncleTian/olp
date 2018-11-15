package com.bea.olp;

public class S_ERR_LOG {
    private String logSerno;

    private String logLevel;

    private String recordTime;

    private String logContent;

    public String getLogSerno() {
        return logSerno;
    }

    public void setLogSerno(String logSerno) {
        this.logSerno = logSerno == null ? null : logSerno.trim();
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel == null ? null : logLevel.trim();
    }

    public String getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(String recordTime) {
        this.recordTime = recordTime == null ? null : recordTime.trim();
    }

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent == null ? null : logContent.trim();
    }
}