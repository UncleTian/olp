package com.bea.olp.encrypt.controller;

import static org.junit.Assert.assertNotNull;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

import javax.annotation.PostConstruct;

import com.bea.olp.encrypt.domain.AntRequest;
import com.bea.olp.encrypt.utils.SignatureUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller used for JeiBei signature signing and verifying
 */
@RestController
@PropertySource(value = { "classpath:keys.properties" })
@RequestMapping("/")
public class SignatrueController {
	private static final Logger logger = LoggerFactory.getLogger(SignatrueController.class.getName());

	@Value("${ant.publicKey}")
	private String publicKey;
	@Value("${ant.privatekey}")
	private String privateKey;

	private static final String ALGORITHM = "Sha256WithRSA";

	@RequestMapping("/verifySignForAnt")
	public boolean VerifySignForAnt(@RequestParam AntRequest antRequest) {
		logger.info("Start verifying signature.");
		if (StringUtils.isEmpty(antRequest.getRequest())) {
			logger.error("request data can not be empty.");
		}

		return SignatureUtils.verifySiginature(publicKey, antRequest.getSignature(), antRequest.getRequest());

	}

	@RequestMapping("/signForAnt")
	public String SignForAnt(String data) {
		return SignatureUtils.generateSignature(privateKey, data);
	}

	/**
	 * This method is used only for private key and public key test
	 * 
	 * @return
	 */
	@RequestMapping("/signAndVerifySignForAnt")
	private boolean signAndVerifySignForAnt() {
		logger.info("start generating signatrue.");
		KeyFactory keyFactory = null;
		String data = "what the hell!";
		String data64 = null;
		try {
			keyFactory = KeyFactory.getInstance("RSA");
			byte[] bytesPrivate = Base64.getDecoder().decode(privateKey.getBytes());
			PKCS8EncodedKeySpec keySpecprivate = new PKCS8EncodedKeySpec(bytesPrivate);
			PrivateKey generatedPrivateKey = keyFactory.generatePrivate(keySpecprivate);

			Signature signature = Signature.getInstance(ALGORITHM);
			signature.initSign(generatedPrivateKey);
			signature.update(data.getBytes("UTF-8"));
			byte[] signed = signature.sign();
			data64 = Base64.getEncoder().encodeToString(signed);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(String.format("Error when generating signatrue. %s", e.getMessage()));
		}

		logger.info("start verifying signature.");
		try {
			byte[] newSigned = Base64.getDecoder().decode(data64);
			byte[] bytesPublic = Base64.getDecoder().decode(publicKey.getBytes());
			X509EncodedKeySpec keySpecPublic = new X509EncodedKeySpec(bytesPublic);
			PublicKey generatedPublicKey = keyFactory.generatePublic(keySpecPublic);
			Signature signature2 = Signature.getInstance(ALGORITHM);
			signature2.initVerify(generatedPublicKey);
			signature2.update(data.getBytes("UTF-8"));
			boolean verify = signature2.verify(newSigned);
			return verify;
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(String.format("Error when verifying signatrue. %s", e.getMessage()));
		}

		return false;
	}

	@PostConstruct
	public void propertiesCheck() {
		assertNotNull("public key can not be null", publicKey);
		assertNotNull("private key can not be null", privateKey);
	}
}