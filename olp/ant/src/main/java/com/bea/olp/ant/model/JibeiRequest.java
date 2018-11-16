package com.bea.olp.ant.model;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
/**
 * JibeiRequest
 */
@XmlRootElement(name="request")
@XmlAccessorType(XmlAccessType.FIELD)
public class JibeiRequest {

    private JibeiHead jibeiHead;

    private JibeiBody jibeiBody;

    public JibeiHead getJibeiHead() {
        return this.jibeiHead;
    }

    public void setJibeiHead(JibeiHead jibeiHead) {
        this.jibeiHead = jibeiHead;
    }

    public JibeiBody getJibeiBody() {
        return this.jibeiBody;
    }

    public void setJibeiBody(JibeiBody jibeiBody) {
        this.jibeiBody = jibeiBody;
    }
    
}