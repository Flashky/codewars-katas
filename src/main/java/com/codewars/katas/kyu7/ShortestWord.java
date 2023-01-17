package com.codewars.katas.kyu7;

import java.util.Arrays;

public class ShortestWord {
	
	// Kata: https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9/train/java
	
    public static int findShort(String s) {
    	return Arrays.stream(s.split(" ")).min((w1, w2) -> w1.length() - w2.length()).get().length();
    }
}
