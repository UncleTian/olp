package com.bea.olp.ant.model;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
/**
 * JibeiHead
 */
@XmlRootElement(name="head")
@XmlAccessorType(XmlAccessType.FIELD)
public class JibeiHead {
    private String version;
    private String appId;
    private String function;
    private String reqTime;
    private String reqTimeZone;
    private String reqMsgId;
    private String reserve;
    private String signType;
    private String inputCharset;

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getFunction() {
        return this.function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getReqTime() {
        return this.reqTime;
    }

    public void setReqTime(String reqTime) {
        this.reqTime = reqTime;
    }

    public String getReqTimeZone() {
        return this.reqTimeZone;
    }

    public void setReqTimeZone(String reqTimeZone) {
        this.reqTimeZone = reqTimeZone;
    }

    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public void setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
    }

    public String getReserve() {
        return this.reserve;
    }

    public void setReserve(String reserve) {
        this.reserve = reserve;
    }

    public String getSignType() {
        return this.signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getInputCharset() {
        return this.inputCharset;
    }

    public void setInputCharset(String inputCharset) {
        this.inputCharset = inputCharset;
    }


    
}