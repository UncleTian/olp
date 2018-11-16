package com.bea.olp.ant.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bea.olp.ant.service.*;
import ch.qos.logback.classic.Logger;

/**
 * JibeiController
 */
@RestController
public class JibeiController {
    public static Logger logger;

    @Autowired
    JibeiService JibeiService;

    @RequestMapping("")
    public String JiBeiFirstApply(@RequestBody String param){

        return JibeiService.parseParam(param);
    }
    
}