package com.bea.olp;

public class CFG_MATRIX_RULE {
    private String matrixId;

    private String colKey;

    private String lineKey;

    private String matrixValue;

    public String getMatrixId() {
        return matrixId;
    }

    public void setMatrixId(String matrixId) {
        this.matrixId = matrixId == null ? null : matrixId.trim();
    }

    public String getColKey() {
        return colKey;
    }

    public void setColKey(String colKey) {
        this.colKey = colKey == null ? null : colKey.trim();
    }

    public String getLineKey() {
        return lineKey;
    }

    public void setLineKey(String lineKey) {
        this.lineKey = lineKey == null ? null : lineKey.trim();
    }

    public String getMatrixValue() {
        return matrixValue;
    }

    public void setMatrixValue(String matrixValue) {
        this.matrixValue = matrixValue == null ? null : matrixValue.trim();
    }
}