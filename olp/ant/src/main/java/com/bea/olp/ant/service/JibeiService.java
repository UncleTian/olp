package com.bea.olp.ant.service;

import java.util.Date;

import com.bea.olp.ant.common.ObjectFieldsOperation;
import com.bea.olp.ant.entity.AntRatFirstAppInfo;
import com.bea.olp.ant.feign.JibeiEncrypt;
import com.bea.olp.ant.model.AntRequest;
import com.bea.olp.ant.model.JibeiDocument;
import com.bea.olp.ant.repository.AntRatFirstAppInfoRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * JibeiService
 */
@Service
public class JibeiService {

	@Autowired
	AntRatFirstAppInfoRepo repo;
	@Autowired
	JibeiEncrypt jibeiEncrypt;
	@Autowired
	private KafkaTemplate kafkaTemplate;

	public String parseParam(String param) {

		try {
			JibeiDocument document = ObjectFieldsOperation.StringToObject(param, JibeiDocument.class);

			AntRequest antRequest = new AntRequest();
			String requestStr = ObjectFieldsOperation.ConverObjectToString(document.getJibeiRequest());
			antRequest.setRequest(requestStr);
			antRequest.setSignature(document.getSignature());
			if (jibeiEncrypt.verifySignForAnt(antRequest)) {
				AntRatFirstAppInfo antRatFirstAppInfo = new AntRatFirstAppInfo();
				antRatFirstAppInfo.setApplyNo(document.getJibeiRequest().getJibeiBody().getApplyNo());
				antRatFirstAppInfo.setCertCode(document.getJibeiRequest().getJibeiBody().getCertNo());
				antRatFirstAppInfo.setCertType(document.getJibeiRequest().getJibeiBody().getCertType());
				antRatFirstAppInfo.setCertValidDate(document.getJibeiRequest().getJibeiBody().getCertValidEndDate());
				antRatFirstAppInfo.setChannelType("channelType");
				antRatFirstAppInfo.setCoPlatform("coPlatform");
				antRatFirstAppInfo.setCustName(document.getJibeiRequest().getJibeiBody().getName());
				antRatFirstAppInfo.setFunctionId(document.getJibeiRequest().getJibeiHead().getFunction());
				antRatFirstAppInfo.setHasJbAdmit(document.getJibeiRequest().getJibeiBody().getHasJBAdmit());
				String gmtString = new Date().toGMTString();
				antRatFirstAppInfo.setInputDate(gmtString);

				antRatFirstAppInfo.setInputTime(gmtString);
				antRatFirstAppInfo.setLoanProp("loanProp");
				antRatFirstAppInfo.setPhone(document.getJibeiRequest().getJibeiBody().getMobileNo());
				antRatFirstAppInfo.setPrdCode("prdCode");
				antRatFirstAppInfo.setPrdType("prdType");
				antRatFirstAppInfo.setReqTime(document.getJibeiRequest().getJibeiHead().getReqTime());
				antRatFirstAppInfo.setTpNo(document.getJibeiRequest().getJibeiHead().getReqMsgId());
				antRatFirstAppInfo.setTranDate("tranDate");
				antRatFirstAppInfo.setZmAuthFlag("zmAuthFlag");

				repo.save(antRatFirstAppInfo);
				// kafkaTemplate.send("ant", "antRatFirstAppInfo", antRatFirstAppInfo);
				return "success";
			} else {
				return "fail";
			}

		} catch (Exception e) {
			e.printStackTrace();
			return "fail";
		}

	}

	public String signForAnt(String content) {
		JibeiDocument document = (JibeiDocument) ObjectFieldsOperation.StringToObject(content, JibeiDocument.class);
		try {
			String requestStr = ObjectFieldsOperation.ConverObjectToString(document.getJibeiRequest());
			return jibeiEncrypt.signForAnt(requestStr);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}