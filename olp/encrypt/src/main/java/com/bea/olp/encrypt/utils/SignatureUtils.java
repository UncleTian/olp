package com.bea.olp.encrypt.utils;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SignatureUtils {
	private static final String DEFAULT_CODEING = "UTF-8";
	private static final String ALGORITHM = "SHA256withRSA";
	private static final String KEY_FACTORY_TYPE = "RSA";

	private static final Logger logger = LoggerFactory.getLogger(SignatureUtils.class.getName());

	public static String generateSignature(String privateKey, String data) {
		logger.info("start generating signature.");
		try {
			byte[] bytesPrivate = Base64.getDecoder().decode(privateKey.getBytes());
			PKCS8EncodedKeySpec keySpecprivate = new PKCS8EncodedKeySpec(bytesPrivate);
			KeyFactory keyFactory = KeyFactory.getInstance(KEY_FACTORY_TYPE);
			PrivateKey generatedPrivateKey = keyFactory.generatePrivate(keySpecprivate);

			Signature signature = Signature.getInstance(ALGORITHM);
			signature.initSign(generatedPrivateKey);
			if (null != data) {
				signature.update(data.getBytes(DEFAULT_CODEING));
			}
			byte[] signed = signature.sign();
			return new String(Base64.getEncoder().encode(signed));
		} catch (Exception e) {
			logger.error(String.format("Generating signature with error : ", e.getMessage()));
			e.printStackTrace();
			return null;
		}

	}

	public static boolean verifySiginature(String publicKey, String signatureStr, String data) {
		logger.info("start verifying signature.");
		try {
			byte[] bytesPublic = Base64.getDecoder().decode(publicKey.getBytes());
			X509EncodedKeySpec keySpecPublic = new X509EncodedKeySpec(bytesPublic);
			KeyFactory keyFactory = KeyFactory.getInstance(KEY_FACTORY_TYPE);
			PublicKey generatedPublicKey = keyFactory.generatePublic(keySpecPublic);
			Signature signature = Signature.getInstance(ALGORITHM);
			signature.initVerify(generatedPublicKey);
			signature.update(data.getBytes(DEFAULT_CODEING));
			byte[] signed = Base64.getDecoder().decode(signatureStr.getBytes());
			boolean verify = signature.verify(signed);
			return verify;
		} catch (Exception e) {
			logger.error(String.format("Verify signature with error : ", e.getMessage()));
			e.printStackTrace();
			return false;
		}
	}
}
