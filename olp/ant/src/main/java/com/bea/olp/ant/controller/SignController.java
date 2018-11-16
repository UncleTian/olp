package com.bea.olp.ant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bea.olp.ant.internalservice.SignService;

@RestController
public class SignController {
	@Autowired
	private SignService signService;

	@RequestMapping("/sign")
	public String sign(String data) {
		return signService.sign(data);
	}
}
