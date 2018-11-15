package com.bea.olp;

public class BAT_DATA_SIGN extends BAT_DATA_SIGNKey {
    private String dtState;

    private String lastUpdateTime;

    public String getDtState() {
        return dtState;
    }

    public void setDtState(String dtState) {
        this.dtState = dtState == null ? null : dtState.trim();
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime == null ? null : lastUpdateTime.trim();
    }
}