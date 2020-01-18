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
		for(int i=0; i<=string.length()-sz; i+=sz) {
			List<String> list = Arrays.stream(string.substring(i, i+sz).split("")).collect(Collectors.toList());
			if(Arrays.stream(list.toArray()).mapToInt(x->Integer.valueOf((String)x)).map(x-> x*x*x).sum() % 2 == 0) {
				Collections.reverse(list);
			} else {
				Collections.rotate(list, -1);
			}
			result.append(Arrays.stream(list.toArray()).map(String::valueOf).collect(Collectors.joining()));
		}
		
		return result.toString();
	}

}
