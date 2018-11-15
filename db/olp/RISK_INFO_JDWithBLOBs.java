package com.bea.olp;

public class RISK_INFO_JDWithBLOBs extends RISK_INFO_JD {
    private String riskinfoFirst;

    private String riskinfoSecond;

    public String getRiskinfoFirst() {
        return riskinfoFirst;
    }

    public void setRiskinfoFirst(String riskinfoFirst) {
        this.riskinfoFirst = riskinfoFirst == null ? null : riskinfoFirst.trim();
    }

    public String getRiskinfoSecond() {
        return riskinfoSecond;
    }

    public void setRiskinfoSecond(String riskinfoSecond) {
        this.riskinfoSecond = riskinfoSecond == null ? null : riskinfoSecond.trim();
    }
}