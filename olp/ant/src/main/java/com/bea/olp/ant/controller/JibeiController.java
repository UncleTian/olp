package com.bea.olp.ant.controller;

import com.bea.olp.ant.common.ObjectFieldsOperation;
import com.bea.olp.ant.entity.AntRatFirstAppInfo;
import com.bea.olp.ant.model.JibeiDocument;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * JibeiController
 */
@RestController
public class JibeiController {

    @RequestMapping("")
    public String JiBeiFirstApply(@RequestBody String param){

        try {
            JibeiDocument document = (JibeiDocument)ObjectFieldsOperation.StringToObject(param, JibeiDocument.class);

            AntRatFirstAppInfo antRatFirstAppInfo = new AntRatFirstAppInfo();
            antRatFirstAppInfo.setApplyNo(document.getJibeiRequest().getJibeiBody().getApplyNo());
            antRatFirstAppInfo.setCertCode(document.getJibeiRequest().getJibeiBody().getCertNo());
            antRatFirstAppInfo.setCertType(document.getJibeiRequest().getJibeiBody().getCertType());
            antRatFirstAppInfo.setCertValidDate(document.getJibeiRequest().getJibeiBody().getCertValidEndDate());
            antRatFirstAppInfo.setChannelType("channelType");
            antRatFirstAppInfo.setCoPlatform("coPlatform");
            antRatFirstAppInfo.setCustName("custName");
            antRatFirstAppInfo.setFunctionId("functionId");
            antRatFirstAppInfo.setHasJbAdmit("hasJbAdmit");
            antRatFirstAppInfo.setInputDate("inputDate");
            antRatFirstAppInfo.setInputTime("inputTime");
            antRatFirstAppInfo.setLoanProp("loanProp");
            antRatFirstAppInfo.setPhone("phone");
            antRatFirstAppInfo.setPrdCode("prdCode");
            antRatFirstAppInfo.setPrdType("prdType");
            antRatFirstAppInfo.setReqTime("reqTime");
            antRatFirstAppInfo.setTpNo("tpNo");
            antRatFirstAppInfo.setTranDate("tranDate");
            antRatFirstAppInfo.setZmAuthFlag("zmAuthFlag");

        } catch (Exception e) {
            //TODO: handle exception
        }

        return null;
    }
    
}