package com.bea.olp;

import java.math.BigDecimal;

public class CFG_MCC_ACCESS {
    private String mccCode;

    private String mccName;

    private String accessFlag;

    private String field1;

    private String field2;

    private String field3;

    private String field4;

    private String field5;

    private BigDecimal field6;

    private BigDecimal field7;

    private BigDecimal field8;

    private BigDecimal field9;

    private BigDecimal field10;

    private String bizOpId;

    private String bizOrgId;

    private String inputDate;

    private String inputTime;

    private String lastUpdateDate;

    private String lastUpdateTime;

    private BigDecimal perinMoney;

    public String getMccCode() {
        return mccCode;
    }

    public void setMccCode(String mccCode) {
        this.mccCode = mccCode == null ? null : mccCode.trim();
    }

    public String getMccName() {
        return mccName;
    }

    public void setMccName(String mccName) {
        this.mccName = mccName == null ? null : mccName.trim();
    }

    public String getAccessFlag() {
        return accessFlag;
    }

    public void setAccessFlag(String accessFlag) {
        this.accessFlag = accessFlag == null ? null : accessFlag.trim();
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1 == null ? null : field1.trim();
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2 == null ? null : field2.trim();
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3 == null ? null : field3.trim();
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4 == null ? null : field4.trim();
    }

    public String getField5() {
        return field5;
    }

    public void setField5(String field5) {
        this.field5 = field5 == null ? null : field5.trim();
    }

    public BigDecimal getField6() {
        return field6;
    }

    public void setField6(BigDecimal field6) {
        this.field6 = field6;
    }

    public BigDecimal getField7() {
        return field7;
    }

    public void setField7(BigDecimal field7) {
        this.field7 = field7;
    }

    public BigDecimal getField8() {
        return field8;
    }

    public void setField8(BigDecimal field8) {
        this.field8 = field8;
    }

    public BigDecimal getField9() {
        return field9;
    }

    public void setField9(BigDecimal field9) {
        this.field9 = field9;
    }

    public BigDecimal getField10() {
        return field10;
    }

    public void setField10(BigDecimal field10) {
        this.field10 = field10;
    }

    public String getBizOpId() {
        return bizOpId;
    }

    public void setBizOpId(String bizOpId) {
        this.bizOpId = bizOpId == null ? null : bizOpId.trim();
    }

    public String getBizOrgId() {
        return bizOrgId;
    }

    public void setBizOrgId(String bizOrgId) {
        this.bizOrgId = bizOrgId == null ? null : bizOrgId.trim();
    }

    public String getInputDate() {
        return inputDate;
    }

    public void setInputDate(String inputDate) {
        this.inputDate = inputDate == null ? null : inputDate.trim();
    }

    public String getInputTime() {
        return inputTime;
    }

    public void setInputTime(String inputTime) {
        this.inputTime = inputTime == null ? null : inputTime.trim();
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate == null ? null : lastUpdateDate.trim();
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime == null ? null : lastUpdateTime.trim();
    }

    public BigDecimal getPerinMoney() {
        return perinMoney;
    }

    public void setPerinMoney(BigDecimal perinMoney) {
        this.perinMoney = perinMoney;
    }
}