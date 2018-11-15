package bea.com.olp.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "xml")
public class AntRequest {
	private String request;
	private String signature;

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

}
