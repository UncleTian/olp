package com.bea.olp;

public class REQUEST_DATA_REMARK_JDWithBLOBs extends REQUEST_DATA_REMARK_JD {
    private String requestDataEncrypt;

    private String requestDataDecode;

    public String getRequestDataEncrypt() {
        return requestDataEncrypt;
    }

    public void setRequestDataEncrypt(String requestDataEncrypt) {
        this.requestDataEncrypt = requestDataEncrypt == null ? null : requestDataEncrypt.trim();
    }

    public String getRequestDataDecode() {
        return requestDataDecode;
    }

    public void setRequestDataDecode(String requestDataDecode) {
        this.requestDataDecode = requestDataDecode == null ? null : requestDataDecode.trim();
    }
}