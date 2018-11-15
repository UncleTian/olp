package com.bea.olp;

public class BAT_OVERDUE_LIST {
    private String certCode;

    public String getCertCode() {
        return certCode;
    }

    public void setCertCode(String certCode) {
        this.certCode = certCode == null ? null : certCode.trim();
    }
}