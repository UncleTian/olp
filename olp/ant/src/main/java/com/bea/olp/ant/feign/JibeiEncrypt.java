package com.bea.olp.ant.feign;

import com.bea.olp.ant.model.AntRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


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