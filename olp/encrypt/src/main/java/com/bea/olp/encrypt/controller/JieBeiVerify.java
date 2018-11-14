package com.bea.olp.encrypt.controller;

import com.bea.olp.encrypt.common.Base64Util;
import com.bea.olp.encrypt.service.alipay.RSAUtil;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * JieBeiVerify
 */
@RestController
@RequestMapping("/")
public class JieBeiVerify {
    public boolean VerifySign(String param,String signStr){
        return false;
    } 
    
    public String Sign(String param){
        return null;
    }
}