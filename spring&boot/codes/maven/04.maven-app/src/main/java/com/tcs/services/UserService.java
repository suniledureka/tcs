package com.tcs.services;

import com.tcs.utils.EncoderDecoderUtils;

public class UserService {

	public static void main(String[] args) {
		EncoderDecoderUtils ecUtils = new EncoderDecoderUtils();
		
		String originalPassword = "11pa$$word22";
		String encodedPassword = ecUtils.encodePassword(originalPassword);
		String decodedPassword = ecUtils.decodePassword(encodedPassword);
		
		System.out.println("encoded pwd = " + encodedPassword);
		System.out.println("decoded pwd = " + decodedPassword);
	}

}
