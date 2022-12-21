package com.tcs.utils;

import java.util.Base64;
import java.util.Base64.Decoder;
/**
 * 
 * @author SUNIL
 *
 */
public class EncoderDecoderUtils {
	//--method definition to encode password
	public String encodePassword(String pwd) {
		Base64.Encoder encoder = Base64.getEncoder();
		byte[] b = pwd.getBytes();
		String encodedPwd = encoder.encodeToString(b);
		return encodedPwd;
	}
	
	//--method definition to decode password
	public String decodePassword(String pwd) {
		Decoder decoder = Base64.getDecoder();
		byte[] b = decoder.decode(pwd);
		String decodedPwd = new String(b);
		return decodedPwd;
	}
}
