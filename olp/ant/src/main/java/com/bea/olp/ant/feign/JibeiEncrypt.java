package com.bea.olp.ant.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import bea.com.olp.domain.AntRequest;

/**
 * JibeiEncrypt
 * 
 * @param <AntRequest>
 */
@FeignClient(name= "encrypt")
public interface JibeiEncrypt {

    @RequestMapping("/verifySignForAnt")
    public  boolean VerifySignForAnt(@RequestBody AntRequest antRequest);
    
}