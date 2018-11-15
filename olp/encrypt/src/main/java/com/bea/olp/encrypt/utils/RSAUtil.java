package com.bea.olp.encrypt.utils;

import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;

import com.bea.olp.encrypt.common.Base64Util;

public class RSAUtil {

	public static final String	SIGNATURE_ALGORITHM	= "SHA256withRSA";
	public static final String	ENCODE_ALGORITHM	= "SHA-256";
	public static final String	DEFAULT_ENCODING	= "UTF-8";

	/**
	 * 签名
	 * 
	 * @param privateKey
	 *            私钥
	 * @param text
	 *            明文
	 * @return
	 */
	public static byte[] sign(String privateKey, String text) {
		MessageDigest messageDigest;
		byte[] signed = null;
		try {
			PrivateKey privateKeyT = RSA.restorePrivateKey(Base64Util.decodeBase64(privateKey));
//			messageDigest = MessageDigest.getInstance(ENCODE_ALGORITHM);
//			messageDigest.update(text.getBytes());
//			byte[] outputDigest_sign = messageDigest.digest();
			Signature Sign = Signature.getInstance(SIGNATURE_ALGORITHM);
			Sign.initSign(privateKeyT);
			Sign.update(text.getBytes(DEFAULT_ENCODING));
			signed = Sign.sign();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return signed;
	}

	/**
	 * 验签
	 * 
	 * @param publicKey
	 *            公钥
	 * @param plain_text
	 *            明文
	 * @param signed
	 *            签名
	 */
	public static boolean verifySign(String publicKey, String plain_text, byte[] signed) {

		MessageDigest messageDigest;
		boolean SignedSuccess = false;
		try {
			PublicKey publicKeyT = RSA.restorePublicKey(Base64Util.decodeBase64(publicKey));
//			messageDigest = MessageDigest.getInstance(ENCODE_ALGORITHM);
//			messageDigest.update(plain_text.getBytes());
//			byte[] outputDigest_verify = messageDigest.digest();
			//初始化签名
			Signature verifySign = Signature.getInstance(SIGNATURE_ALGORITHM);
			verifySign.initVerify(publicKeyT);
			verifySign.update(plain_text.getBytes(DEFAULT_ENCODING));
			SignedSuccess = verifySign.verify(signed);
			// System.out.println("验证成功?---" + SignedSuccess);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return SignedSuccess;
	}

	/**
	 * bytes[]换成16进制字符串
	 * 
	 * @param src
	 * @return
	 */
	public static String bytesToString(byte[] src) {
		StringBuilder stringBuilder = new StringBuilder("");
		if (src == null || src.length <= 0) {
			return null;
		}
		for (int i = 0; i < src.length; i++) {
			int v = src[i] & 0xFF;
			String hv = Integer.toHexString(v);
			if (hv.length() < 2) {
				stringBuilder.append(0);
			}
			stringBuilder.append(hv);
		}
		return stringBuilder.toString();
	}

	public static byte[] string2Bytes(String str) {
		byte[] result = new byte[str.length() / 2];
		int index = 0;
		for (int i = 0; i < str.length(); i += 2) {
			result[index++] = (byte) Integer.parseInt(str.substring(i, i + 2), 16);
		}
		return result;
	}

}
