package com.bea.olp.ant.feign;

import com.bea.olp.ant.model.AntRequest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * JibeiEncrypt
 * 
 * @param <AntRequest>
 */
@FeignClient(name = "encrypt")
public interface JibeiEncrypt {

	@RequestMapping(value= "/encrypt/verifySignForAnt")
	public boolean VerifySignForAnt(@RequestBody AntRequest antRequest) ;


}