package com.bea.olp.ant.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * JibeiDocument
 */
@XmlRootElement(name="document")
@XmlAccessorType(XmlAccessType.FIELD)
public class JibeiDocument {

    private JibeiRequest jibeiRequest;

    private String signature;

    public String getSignature() {
        return this.signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public JibeiRequest getJibeiRequest() {
        return this.jibeiRequest;
    }

    public void setJibeiRequest(JibeiRequest jibeiRequest) {
        this.jibeiRequest = jibeiRequest;
    }


    
}