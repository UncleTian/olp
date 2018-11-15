package com.bea.olp.encrypt.utils;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class SignatureUtils {
	private static final String DEFAULT_CODEING = "UTF-8";
	private static final String ALGORITHM = "Sha1WithRSA";
	private static final String KEY_FACTORY_TYPE = "RSA";

	public static String generateSignature(String privateKey, String data) {
		System.out.println("开始加签");
		try {
			byte[] bytesPrivate = Base64.getDecoder().decode(privateKey.getBytes());
			PKCS8EncodedKeySpec keySpecprivate = new PKCS8EncodedKeySpec(bytesPrivate);
			KeyFactory keyFactory = KeyFactory.getInstance(KEY_FACTORY_TYPE);
			PrivateKey generatedPrivateKey = keyFactory.generatePrivate(keySpecprivate);

			Signature signature = Signature.getInstance(ALGORITHM);
			signature.initSign(generatedPrivateKey);
			if(null != data){
				signature.update(data.getBytes(DEFAULT_CODEING));
			}
			byte[] signed = signature.sign();
			return new String(signed, DEFAULT_CODEING);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static boolean verifySiginature(String publicKey, String signatureStr) {
		System.out.println("开始验签");
		try {
			byte[] bytesPublic = Base64.getDecoder().decode(publicKey.getBytes());
			X509EncodedKeySpec keySpecPublic = new X509EncodedKeySpec(bytesPublic);
			KeyFactory keyFactory = KeyFactory.getInstance(KEY_FACTORY_TYPE);
			PublicKey generatedPublicKey = keyFactory.generatePublic(keySpecPublic);

			Signature signature = Signature.getInstance(ALGORITHM);
			signature.initVerify(generatedPublicKey);
			signature.update(signatureStr.getBytes(DEFAULT_CODEING));
			byte[] signed = signature.sign();
			boolean verify = signature.verify(signed);
			System.out.println("验签结果:" + verify);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}
}
