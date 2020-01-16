package com.codewardev;

import java.util.Arrays;

public class RevRot {

	public static String revRot(String string, int sz) {
		String a = string.substring(0, sz);
		int aNum = Arrays.stream(a.split("")).mapToInt(x->{
			int i = Integer.parseInt(x);
			return i*i*i;
		}).sum();
		System.out.println("aNum is "+(aNum%2));
		return null;
	}

}
