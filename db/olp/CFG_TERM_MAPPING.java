package com.bea.olp;

public class CFG_TERM_MAPPING {
    private String olsterm;

    private String coreterm;

    private String inputTime;

    private String olsStdTerm;

    public String getOlsterm() {
        return olsterm;
    }

    public void setOlsterm(String olsterm) {
        this.olsterm = olsterm == null ? null : olsterm.trim();
    }

    public String getCoreterm() {
        return coreterm;
    }

    public void setCoreterm(String coreterm) {
        this.coreterm = coreterm == null ? null : coreterm.trim();
    }

    public String getInputTime() {
        return inputTime;
    }

    public void setInputTime(String inputTime) {
        this.inputTime = inputTime == null ? null : inputTime.trim();
    }

    public String getOlsStdTerm() {
        return olsStdTerm;
    }

    public void setOlsStdTerm(String olsStdTerm) {
        this.olsStdTerm = olsStdTerm == null ? null : olsStdTerm.trim();
    }
}