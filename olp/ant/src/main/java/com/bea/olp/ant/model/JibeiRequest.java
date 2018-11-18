package com.bea.olp.ant.model;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
/**
 * JibeiRequest
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class JibeiRequest {
	
	@XmlElement(name="head")
    private JibeiHead jibeiHead;

	@XmlElement(name="body")
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