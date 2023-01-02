package com.tcs.irctc;

import java.util.UUID;

public class Test {

	public static void main(String[] args) {
		UUID uuid = UUID.randomUUID();
		String str = uuid.toString().replace("-", "").substring(0, 7).toUpperCase();
		System.out.println(str);
	}

}
