package com.bea.olp;

public class WF_FREEDATE {
    private String curdate;

    private String workdayflg;

    private String preworkdate;

    private String nextworkdate;

    public String getCurdate() {
        return curdate;
    }

    public void setCurdate(String curdate) {
        this.curdate = curdate == null ? null : curdate.trim();
    }

    public String getWorkdayflg() {
        return workdayflg;
    }

    public void setWorkdayflg(String workdayflg) {
        this.workdayflg = workdayflg == null ? null : workdayflg.trim();
    }

    public String getPreworkdate() {
        return preworkdate;
    }

    public void setPreworkdate(String preworkdate) {
        this.preworkdate = preworkdate == null ? null : preworkdate.trim();
    }

    public String getNextworkdate() {
        return nextworkdate;
    }

    public void setNextworkdate(String nextworkdate) {
        this.nextworkdate = nextworkdate == null ? null : nextworkdate.trim();
    }
}