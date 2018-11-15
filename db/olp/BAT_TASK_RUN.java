package com.bea.olp;

import java.math.BigDecimal;

public class BAT_TASK_RUN extends BAT_TASK_RUNKey {
    private String taskName;

    private String taskType;

    private String priFlag;

    private String runPeriod;

    private String periodRule;

    private String taskClass;

    private Long commitNum;

    private BigDecimal eventNum;

    private String runTimeFlag;

    private String firstRunTime;

    private String lastRunTime;

    private String runTime;

    private String mutexFlag;

    private String mutexNoList;

    private String relationFlag;

    private String taskNoList;

    private String fileExchangeType;

    private String fileSplit;

    private String fileEndType;

    private String fileCompressFlag;

    private String signalType;

    private String signalList;

    private String fileDateType;

    private String dataDateType;

    private String signDateType;

    private String ignoreSignalFlag;

    private String taskStatus;

    private String errorCode;

    private String errorInfo;

    private String inputTime;

    private String taskBeginTime;

    private String taskEndTime;

    private String lastUpdateTime;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType == null ? null : taskType.trim();
    }

    public String getPriFlag() {
        return priFlag;
    }

    public void setPriFlag(String priFlag) {
        this.priFlag = priFlag == null ? null : priFlag.trim();
    }

    public String getRunPeriod() {
        return runPeriod;
    }

    public void setRunPeriod(String runPeriod) {
        this.runPeriod = runPeriod == null ? null : runPeriod.trim();
    }

    public String getPeriodRule() {
        return periodRule;
    }

    public void setPeriodRule(String periodRule) {
        this.periodRule = periodRule == null ? null : periodRule.trim();
    }

    public String getTaskClass() {
        return taskClass;
    }

    public void setTaskClass(String taskClass) {
        this.taskClass = taskClass == null ? null : taskClass.trim();
    }

    public Long getCommitNum() {
        return commitNum;
    }

    public void setCommitNum(Long commitNum) {
        this.commitNum = commitNum;
    }

    public BigDecimal getEventNum() {
        return eventNum;
    }

    public void setEventNum(BigDecimal eventNum) {
        this.eventNum = eventNum;
    }

    public String getRunTimeFlag() {
        return runTimeFlag;
    }

    public void setRunTimeFlag(String runTimeFlag) {
        this.runTimeFlag = runTimeFlag == null ? null : runTimeFlag.trim();
    }

    public String getFirstRunTime() {
        return firstRunTime;
    }

    public void setFirstRunTime(String firstRunTime) {
        this.firstRunTime = firstRunTime == null ? null : firstRunTime.trim();
    }

    public String getLastRunTime() {
        return lastRunTime;
    }

    public void setLastRunTime(String lastRunTime) {
        this.lastRunTime = lastRunTime == null ? null : lastRunTime.trim();
    }

    public String getRunTime() {
        return runTime;
    }

    public void setRunTime(String runTime) {
        this.runTime = runTime == null ? null : runTime.trim();
    }

    public String getMutexFlag() {
        return mutexFlag;
    }

    public void setMutexFlag(String mutexFlag) {
        this.mutexFlag = mutexFlag == null ? null : mutexFlag.trim();
    }

    public String getMutexNoList() {
        return mutexNoList;
    }

    public void setMutexNoList(String mutexNoList) {
        this.mutexNoList = mutexNoList == null ? null : mutexNoList.trim();
    }

    public String getRelationFlag() {
        return relationFlag;
    }

    public void setRelationFlag(String relationFlag) {
        this.relationFlag = relationFlag == null ? null : relationFlag.trim();
    }

    public String getTaskNoList() {
        return taskNoList;
    }

    public void setTaskNoList(String taskNoList) {
        this.taskNoList = taskNoList == null ? null : taskNoList.trim();
    }

    public String getFileExchangeType() {
        return fileExchangeType;
    }

    public void setFileExchangeType(String fileExchangeType) {
        this.fileExchangeType = fileExchangeType == null ? null : fileExchangeType.trim();
    }

    public String getFileSplit() {
        return fileSplit;
    }

    public void setFileSplit(String fileSplit) {
        this.fileSplit = fileSplit == null ? null : fileSplit.trim();
    }

    public String getFileEndType() {
        return fileEndType;
    }

    public void setFileEndType(String fileEndType) {
        this.fileEndType = fileEndType == null ? null : fileEndType.trim();
    }

    public String getFileCompressFlag() {
        return fileCompressFlag;
    }

    public void setFileCompressFlag(String fileCompressFlag) {
        this.fileCompressFlag = fileCompressFlag == null ? null : fileCompressFlag.trim();
    }

    public String getSignalType() {
        return signalType;
    }

    public void setSignalType(String signalType) {
        this.signalType = signalType == null ? null : signalType.trim();
    }

    public String getSignalList() {
        return signalList;
    }

    public void setSignalList(String signalList) {
        this.signalList = signalList == null ? null : signalList.trim();
    }

    public String getFileDateType() {
        return fileDateType;
    }

    public void setFileDateType(String fileDateType) {
        this.fileDateType = fileDateType == null ? null : fileDateType.trim();
    }

    public String getDataDateType() {
        return dataDateType;
    }

    public void setDataDateType(String dataDateType) {
        this.dataDateType = dataDateType == null ? null : dataDateType.trim();
    }

    public String getSignDateType() {
        return signDateType;
    }

    public void setSignDateType(String signDateType) {
        this.signDateType = signDateType == null ? null : signDateType.trim();
    }

    public String getIgnoreSignalFlag() {
        return ignoreSignalFlag;
    }

    public void setIgnoreSignalFlag(String ignoreSignalFlag) {
        this.ignoreSignalFlag = ignoreSignalFlag == null ? null : ignoreSignalFlag.trim();
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus == null ? null : taskStatus.trim();
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode == null ? null : errorCode.trim();
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo == null ? null : errorInfo.trim();
    }

    public String getInputTime() {
        return inputTime;
    }

    public void setInputTime(String inputTime) {
        this.inputTime = inputTime == null ? null : inputTime.trim();
    }

    public String getTaskBeginTime() {
        return taskBeginTime;
    }

    public void setTaskBeginTime(String taskBeginTime) {
        this.taskBeginTime = taskBeginTime == null ? null : taskBeginTime.trim();
    }

    public String getTaskEndTime() {
        return taskEndTime;
    }

    public void setTaskEndTime(String taskEndTime) {
        this.taskEndTime = taskEndTime == null ? null : taskEndTime.trim();
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime == null ? null : lastUpdateTime.trim();
    }
}