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
public class JiebeiController {
	public static Logger logger;

	@Autowired
	JibeiService jiebeiService;

	@RequestMapping("/jiebeiFirstApply")
	public String jieBeiFirstApply(@RequestBody String param) {
		return jiebeiService.parseParam(param);
	}

	@RequestMapping("/signForAnt")
	public String signForAnt(@RequestBody String content) {
		return jiebeiService.signForAnt(content);
	}

}