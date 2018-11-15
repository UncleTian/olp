package com.bea.olp;

public class WFI_SIGN_CONF {
    private String signId;

    private String signName;

    private String signDesc;

    private String signClass;

    private String signState;

    public String getSignId() {
        return signId;
    }

    public void setSignId(String signId) {
        this.signId = signId == null ? null : signId.trim();
    }

    public String getSignName() {
        return signName;
    }

    public void setSignName(String signName) {
        this.signName = signName == null ? null : signName.trim();
    }

    public String getSignDesc() {
        return signDesc;
    }

    public void setSignDesc(String signDesc) {
        this.signDesc = signDesc == null ? null : signDesc.trim();
    }

    public String getSignClass() {
        return signClass;
    }

    public void setSignClass(String signClass) {
        this.signClass = signClass == null ? null : signClass.trim();
    }

    public String getSignState() {
        return signState;
    }

    public void setSignState(String signState) {
        this.signState = signState == null ? null : signState.trim();
    }
}