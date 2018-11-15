package com.bea.olp;

public class WFI_TRANS extends WFI_TRANSKey {
    private String prdType;

    private String bizType;

    private String appState;

    private String opinion;

    private String state;

    public String getPrdType() {
        return prdType;
    }

    public void setPrdType(String prdType) {
        this.prdType = prdType == null ? null : prdType.trim();
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType == null ? null : bizType.trim();
    }

    public String getAppState() {
        return appState;
    }

    public void setAppState(String appState) {
        this.appState = appState == null ? null : appState.trim();
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion == null ? null : opinion.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}