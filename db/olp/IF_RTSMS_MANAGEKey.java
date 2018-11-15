package com.bea.olp;

public class IF_RTSMS_MANAGEKey {
    private String smsNo;

    private String smsDate;

    public String getSmsNo() {
        return smsNo;
    }

    public void setSmsNo(String smsNo) {
        this.smsNo = smsNo == null ? null : smsNo.trim();
    }

    public String getSmsDate() {
        return smsDate;
    }

    public void setSmsDate(String smsDate) {
        this.smsDate = smsDate == null ? null : smsDate.trim();
    }
}