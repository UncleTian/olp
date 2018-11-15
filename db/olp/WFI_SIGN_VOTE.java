package com.bea.olp;

public class WFI_SIGN_VOTE {
    private String svVoteId;

    private String stTaskId;

    private String svExeUser;

    private String svResult;

    private String svAdvice;

    private String svStatus;

    private String svStartTime;

    private String svEndTime;

    private String svRequestTime;

    public String getSvVoteId() {
        return svVoteId;
    }

    public void setSvVoteId(String svVoteId) {
        this.svVoteId = svVoteId == null ? null : svVoteId.trim();
    }

    public String getStTaskId() {
        return stTaskId;
    }

    public void setStTaskId(String stTaskId) {
        this.stTaskId = stTaskId == null ? null : stTaskId.trim();
    }

    public String getSvExeUser() {
        return svExeUser;
    }

    public void setSvExeUser(String svExeUser) {
        this.svExeUser = svExeUser == null ? null : svExeUser.trim();
    }

    public String getSvResult() {
        return svResult;
    }

    public void setSvResult(String svResult) {
        this.svResult = svResult == null ? null : svResult.trim();
    }

    public String getSvAdvice() {
        return svAdvice;
    }

    public void setSvAdvice(String svAdvice) {
        this.svAdvice = svAdvice == null ? null : svAdvice.trim();
    }

    public String getSvStatus() {
        return svStatus;
    }

    public void setSvStatus(String svStatus) {
        this.svStatus = svStatus == null ? null : svStatus.trim();
    }

    public String getSvStartTime() {
        return svStartTime;
    }

    public void setSvStartTime(String svStartTime) {
        this.svStartTime = svStartTime == null ? null : svStartTime.trim();
    }

    public String getSvEndTime() {
        return svEndTime;
    }

    public void setSvEndTime(String svEndTime) {
        this.svEndTime = svEndTime == null ? null : svEndTime.trim();
    }

    public String getSvRequestTime() {
        return svRequestTime;
    }

    public void setSvRequestTime(String svRequestTime) {
        this.svRequestTime = svRequestTime == null ? null : svRequestTime.trim();
    }
}