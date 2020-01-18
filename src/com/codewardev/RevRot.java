package com.codewardev;

// https://www.codewars.com/kata/56b5afb4ed1f6d5fb0000991/train/java

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RevRot {

	public static String revRot(String string, int sz) {
		if(sz <= 0 || string.isEmpty() || sz > string.length()) return "";
		
		StringBuilder result = new StringBuilder();
		for(int i=0; i<string.length(); i+=sz) {
			if(i+sz <= string.length()) {
				String a = string.substring(i, i+sz);
				int aNum = Arrays.stream(a.split("")).mapToInt(x->{
					int j = Integer.parseInt(x);
					return j*j*j;
				}).sum();
				
				List<String> list = Arrays.asList(a.split(""));
				if(aNum % 2 == 0) {
					Collections.reverse(list);
				} else {
					Collections.rotate(list, -1);
				}
				a = Arrays.stream(list.toArray()).map(String::valueOf).collect(Collectors.joining());
				result.append(a);
			}
		}
		
		return result.toString();
	}

}
