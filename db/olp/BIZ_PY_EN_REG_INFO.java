package com.bea.olp;

public class BIZ_PY_EN_REG_INFO {
    private String appNo;

    private Short subreporttype;

    private Short subreporttypecost;

    private Short treatresult;

    private String treaterrorcode;

    private String errormessage;

    private String areacode;

    private String areadesc;

    private String address;

    private String tel;

    private String postcode;

    private String inputDate;

    private String inputTime;

    private String lastUpdateDate;

    private String lastUpdateTime;

    public String getAppNo() {
        return appNo;
    }

    public void setAppNo(String appNo) {
        this.appNo = appNo == null ? null : appNo.trim();
    }

    public Short getSubreporttype() {
        return subreporttype;
    }

    public void setSubreporttype(Short subreporttype) {
        this.subreporttype = subreporttype;
    }

    public Short getSubreporttypecost() {
        return subreporttypecost;
    }

    public void setSubreporttypecost(Short subreporttypecost) {
        this.subreporttypecost = subreporttypecost;
    }

    public Short getTreatresult() {
        return treatresult;
    }

    public void setTreatresult(Short treatresult) {
        this.treatresult = treatresult;
    }

    public String getTreaterrorcode() {
        return treaterrorcode;
    }

    public void setTreaterrorcode(String treaterrorcode) {
        this.treaterrorcode = treaterrorcode == null ? null : treaterrorcode.trim();
    }

    public String getErrormessage() {
        return errormessage;
    }

    public void setErrormessage(String errormessage) {
        this.errormessage = errormessage == null ? null : errormessage.trim();
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode == null ? null : areacode.trim();
    }

    public String getAreadesc() {
        return areadesc;
    }

    public void setAreadesc(String areadesc) {
        this.areadesc = areadesc == null ? null : areadesc.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
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
}