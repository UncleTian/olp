package com.bea.olp;

public class WF_BLOB {
    private String pkey;

    private byte[] content;

    public String getPkey() {
        return pkey;
    }

    public void setPkey(String pkey) {
        this.pkey = pkey == null ? null : pkey.trim();
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}