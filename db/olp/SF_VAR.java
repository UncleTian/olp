package com.bea.olp;

public class SF_VAR {
    private String varId;

    private String varName;

    private String varType;

    private String varValue;

    private String varDesc;

    public String getVarId() {
        return varId;
    }

    public void setVarId(String varId) {
        this.varId = varId == null ? null : varId.trim();
    }

    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName = varName == null ? null : varName.trim();
    }

    public String getVarType() {
        return varType;
    }

    public void setVarType(String varType) {
        this.varType = varType == null ? null : varType.trim();
    }

    public String getVarValue() {
        return varValue;
    }

    public void setVarValue(String varValue) {
        this.varValue = varValue == null ? null : varValue.trim();
    }

    public String getVarDesc() {
        return varDesc;
    }

    public void setVarDesc(String varDesc) {
        this.varDesc = varDesc == null ? null : varDesc.trim();
    }
}