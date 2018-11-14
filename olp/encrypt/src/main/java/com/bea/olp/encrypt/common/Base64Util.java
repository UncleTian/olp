package com.bea.olp.encrypt.common;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;

public class Base64Util {
	public static final String DEFAULT_ENCODING_UTF = "UTF-8";
	
	/**
	 * 
	 * @Title: decodeBase64
	 * @Description: 此处增加对该方法的描述<br>
	 *               V0.x：变更时间：变更描述
	 * @Parmaters: @param str
	 * @Parmaters: @return   
	 * @Return: byte[]
	 * @Throws:
	 * @Author:lijun                                                                                 
	 * @CreateDate:2018年7月13日 上午10:57:22
	 * @Version:0.1
	 * @ModifyLog:2018年7月13日 上午10:57:22
	 */
	public static byte[] decodeBase64(String str){
		Base64 base64 = new Base64();
		return base64.decode(str.getBytes());
	}
	
	/**
	 * 
	 * @Title: encodeBase64
	 * @Description: 此处增加对该方法的描述<br>
	 *               V0.x：变更时间：变更描述
	 * @Parmaters: @param b
	 * @Parmaters: @return   
	 * @Return: String
	 * @Throws:
	 * @Author:lijun                                                                                 
	 * @CreateDate:2018年7月13日 上午10:57:18
	 * @Version:0.1
	 * @ModifyLog:2018年7月13日 上午10:57:18
	 */
	public static String encodeBase64(byte[] b){
		Base64 base64 = new Base64();
		return new String(base64.encode(b));
	}
	
	/**
	 * 
	 * @Title: decodeBase64ToStr
	 * @Description: 此处增加对该方法的描述<br>
	 *               V0.x：变更时间：变更描述
	 * @Parmaters: @param str
	 * @Parmaters: @return
	 * @Parmaters: @throws UnsupportedEncodingException   
	 * @Return: String
	 * @Throws:
	 * @Author:lijun                                                                                 
	 * @CreateDate:2018年7月13日 上午10:57:13
	 * @Version:0.1
	 * @ModifyLog:2018年7月13日 上午10:57:13
	 */
	public static String decodeBase64ToStr(String str) throws UnsupportedEncodingException{
		Base64 base64 = new Base64();
		return new String(base64.decode(str.getBytes()),DEFAULT_ENCODING_UTF);
	}
	
	/**
	 * 
	 * @Title: encodeBase64FromStr
	 * @Description: 此处增加对该方法的描述<br>
	 *               V0.x：变更时间：变更描述
	 * @Parmaters: @param str
	 * @Parmaters: @return
	 * @Parmaters: @throws UnsupportedEncodingException   
	 * @Return: String
	 * @Throws:
	 * @Author:lijun                                                                                 
	 * @CreateDate:2018年7月13日 上午10:57:10
	 * @Version:0.1
	 * @ModifyLog:2018年7月13日 上午10:57:10
	 */
	public static String encodeBase64FromStr(String str) throws UnsupportedEncodingException{
		Base64 base64 = new Base64();
		return new String(base64.encode(str.getBytes()),DEFAULT_ENCODING_UTF);
	}

}
