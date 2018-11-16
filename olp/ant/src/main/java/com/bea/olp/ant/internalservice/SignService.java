package com.bea.olp.ant.internalservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("encrypt")
public interface SignService {

	@RequestMapping(value = "/sign", method = RequestMethod.GET)
	public String sign(String data);
}
