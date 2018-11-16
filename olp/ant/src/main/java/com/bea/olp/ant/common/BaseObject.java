package com.bea.olp.ant.common;

/**
 * 只是对应核心数据操作，的responsCode数据对象
 * */
public class BaseObject {
	
	public BaseObject()
	{
		this.responseCode = (long)0;
	}
	private Long responseCode;
	public Long getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(Long responseCode) {
		this.responseCode = responseCode;
	}
}
