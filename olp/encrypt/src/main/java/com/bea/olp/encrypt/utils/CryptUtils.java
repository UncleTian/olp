package com.bea.olp.encrypt.utils;

import java.io.UnsupportedEncodingException;
import java.util.ResourceBundle;

import com.bea.olp.encrypt.common.Base64Util;
import com.bea.olp.encrypt.common.LogUtils;

public class CryptUtils {

	private static String	privateKey;
	private static String	publicKey;
//	static {
//		ResourceBundle res = ResourceBundle.getBundle("cmis");
//		privateKey = res.getString("privateKey");
//		publicKey = res.getString("publicKey");
//	}

	/**
	 * 签名返回报文
	 * 
	 * @param retMsg
	 *            返回用整体报文
	 * @return String 签名后报文
	 * @throws UnsupportedEncodingException
	 * */
	public static String signResponse(String retMsg) throws UnsupportedEncodingException {
		String dataResp = retMsg.substring(retMsg.lastIndexOf("<response>") + 10, retMsg.lastIndexOf("</response>"));
		String data64 = Base64Util.encodeBase64FromStr(dataResp);
		// 对data使用私钥进行签名
		// 验证签名
		if (privateKey == null || privateKey.equals("")) {
			ResourceBundle res = ResourceBundle.getBundle("cmis");
			privateKey = res.getString("privateKey");
		}
		// 对data进行base64编码
//		data64 = Base64Util.encodeBase64(RSAUtil.sign(privateKey, data64));

		/********************* 测试环境时调用 **************************/
		 //data64 = RSAUtil.bytesToString(RSAUtil.sign(privateKey, data64));
		 // 对data进行base64编码
		 data64 = Base64Util.encodeBase64FromStr(data64);
		/********************************************************/

		// 拼装最终报文
		String xmlStr = "<?xml version='1.0' encoding='UTF-8' ?><document><response>" + dataResp + "</response><signature>" + data64 + "</signature></document>";
		return xmlStr;
	}

	/**
	 * 签名请求报文
	 * 
	 * @param xmlDate
	 *            请求用<request>节点
	 * @return String 签名后报文
	 * @throws UnsupportedEncodingException
	 * */
	public static String signRequest(String xmlDate, String privateKey) throws UnsupportedEncodingException {
		String data64 = Base64Util.encodeBase64FromStr(xmlDate);
		// ResourceBundle res = ResourceBundle.getBundle("cmis");
		// String privateKey = res.getString("privateKey");
//		if (privateKey == null || privateKey.equals("")) {
//			ResourceBundle res = ResourceBundle.getBundle("cmis");
//			privateKey = res.getString("privateKey");
//		}
		// 对data进行base64编码
		data64 = Base64Util.encodeBase64(RSAUtil.sign(privateKey, data64));

		/********************* 测试环境时调用 **************************/
		 //data64 = RSAUtil.bytesToString(RSAUtil.sign(privateKey, data64));
		 // 对data进行base64编码
//		 data64 = Base64Util.encodeBase64FromStr(data64);
		/********************************************************/

		// 拼装最终报文
		String xmlStr = "<?xml version='1.0' encoding='UTF-8' ?><document><request>" + xmlDate + "</request><signature>" + data64 + "</signature></document>";
		return xmlStr;
	}

	/**
	 * 验签请求报文
	 * 
	 * @param reqDate
	 *            请求报文
	 * @return String 结果，true通过，false不通过
	 * @throws UnsupportedEncodingException
	 * */
	public static String verifyRequest(String reqData, String publicKey) throws UnsupportedEncodingException {
		org.apache.log4j.Logger logger = LogUtils.getLogger();
		// 获取request包裹的报文头
		String requestData = getFieldValue("<request>", reqData);
		logger.info("request包裹的报文头：" + requestData);
		// 对报文头做base64编码
		requestData = Base64Util.encodeBase64FromStr(requestData);
		logger.info("报文做base64编码：" + requestData);
		// 获取签名字符串
		String signature = getFieldValue("<signature>", reqData);
		logger.info("签名串：" + signature);

		// 对签名字符串base64解码
		byte[] signdata = Base64Util.decodeBase64(signature);
		logger.info("base64解码后签名字符串：" + RSAUtil.bytesToString(signdata));
		// 验证签名
		if (publicKey == null || publicKey.equals("")) {
			ResourceBundle res = ResourceBundle.getBundle("cmis");
			publicKey = res.getString("publicKey");
		}
		if (RSAUtil.verifySign(publicKey, requestData, signdata)) {
			logger.info("验证签名通过");
			return "true";
		} else {// 不通过暂时抛出异常
			logger.info("验证签名不通过");
			return "false";
		}
	}

	/**
	 * 获取交易字段值
	 * 
	 * @param field
	 * @param msg
	 * @return
	 */
	public static String getFieldValue(String field, String msg) {
		int beginIndex = msg.indexOf(field);
		if (beginIndex == -1)
			return "";
		// System.out.println(field.substring(1, field.length()));
		int endIndex = msg.indexOf("</" + field.substring(1, field.length()));
		if (endIndex == -1)
			return "";
		String fieldStr = msg.substring(beginIndex + field.length(), endIndex);
		return fieldStr;
	}
}
