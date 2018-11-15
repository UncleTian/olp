package com.bea.olp;

public class SF_CONSTANT {
    private String constantId;

    private String constantName;

    private String constantType;

    private String constantValue;

    private String constantDesc;

    public String getConstantId() {
        return constantId;
    }

    public void setConstantId(String constantId) {
        this.constantId = constantId == null ? null : constantId.trim();
    }

    public String getConstantName() {
        return constantName;
    }

    public void setConstantName(String constantName) {
        this.constantName = constantName == null ? null : constantName.trim();
    }

    public String getConstantType() {
        return constantType;
    }

    public void setConstantType(String constantType) {
        this.constantType = constantType == null ? null : constantType.trim();
    }

    public String getConstantValue() {
        return constantValue;
    }

    public void setConstantValue(String constantValue) {
        this.constantValue = constantValue == null ? null : constantValue.trim();
    }

    public String getConstantDesc() {
        return constantDesc;
    }

    public void setConstantDesc(String constantDesc) {
        this.constantDesc = constantDesc == null ? null : constantDesc.trim();
    }
}