package com.bea.olp.ant.model;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
/**
 * JibeiBody
 */
@XmlRootElement(name="body")
@XmlAccessorType(XmlAccessType.FIELD)
public class JibeiBody {
    private String applyNo;
    private String certType;
    private String certNo;
    private String certValidEndDate;
    private String name;
    private String mobileNo;
    private String zmAuthFlag;
    private String hasJBAdmit;
    private String pbocInfo;
    private String zmInfo;
    private String extInfo;

    public String getApplyNo() {
        return this.applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    public String getCertType() {
        return this.certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertNo() {
        return this.certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getCertValidEndDate() {
        return this.certValidEndDate;
    }

    public void setCertValidEndDate(String certValidEndDate) {
        this.certValidEndDate = certValidEndDate;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return this.mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getZmAuthFlag() {
        return this.zmAuthFlag;
    }

    public void setZmAuthFlag(String zmAuthFlag) {
        this.zmAuthFlag = zmAuthFlag;
    }

    public String getHasJBAdmit() {
        return this.hasJBAdmit;
    }

    public void setHasJBAdmit(String hasJBAdmit) {
        this.hasJBAdmit = hasJBAdmit;
    }

    public String getPbocInfo() {
        return this.pbocInfo;
    }

    public void setPbocInfo(String pbocInfo) {
        this.pbocInfo = pbocInfo;
    }

    public String getZmInfo() {
        return this.zmInfo;
    }

    public void setZmInfo(String zmInfo) {
        this.zmInfo = zmInfo;
    }

    public String getExtInfo() {
        return this.extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo;
    }
    
}