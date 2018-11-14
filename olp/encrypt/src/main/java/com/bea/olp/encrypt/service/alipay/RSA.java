package com.bea.olp.encrypt.service.alipay;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

public class RSA {

	// 密钥算法常量
	public static final String	KEY_ALGORITHM		= "RSA";
	// 加密算法常量
	public static final String	CIPHER_ALGORITHM	= "RSA/ECB/PKCS1Padding";
	public static final String	PUBLIC_KEY			= "publicKey";
	public static final String	PRIVATE_KEY			= "privateKey";
	// 密钥长度
	public static final int		KEY_SIZE			= 2048;

	/**
	 * 生成密钥对
	 * 
	 * @return
	 */
	public static Map<String, byte[]> generateKeyBytes() {

		try {
			KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(KEY_ALGORITHM);
			// 初始化密钥对生成器
			keyPairGenerator.initialize(KEY_SIZE);
			// 生成密钥对
			KeyPair keyPair = keyPairGenerator.generateKeyPair();
			// get RSA PulicKey
			RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
			// get RSA Private Key
			RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();
			Map<String, byte[]> keyMap = new HashMap<String, byte[]>();
			// 密钥编码
			keyMap.put(PUBLIC_KEY, publicKey.getEncoded());
			keyMap.put(PRIVATE_KEY, privateKey.getEncoded());
			return keyMap;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 还原公钥
	 * 
	 * @param keyBytes
	 * @return
	 */
	public static PublicKey restorePublicKey(byte[] keyBytes) {
		// 通过密钥字节流获得密钥空间
		X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(keyBytes);
		try {
			// 生成工厂
			KeyFactory factory = KeyFactory.getInstance(KEY_ALGORITHM);
			// 通过密钥空间重新生成密钥
			PublicKey publicKey = factory.generatePublic(x509EncodedKeySpec);
			return publicKey;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 还原私钥
	 * 
	 * @param keyBytes
	 * @return
	 */
	public static PrivateKey restorePrivateKey(byte[] keyBytes) {
		PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(keyBytes);
		try {
			KeyFactory factory = KeyFactory.getInstance(KEY_ALGORITHM);
			PrivateKey privateKey = factory.generatePrivate(pkcs8EncodedKeySpec);
			return privateKey;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args) {
		generateKeyBytes();
	}

}
