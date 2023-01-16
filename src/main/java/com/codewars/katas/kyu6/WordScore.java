package com.codewars.katas.kyu6;

import java.util.Arrays;

public class WordScore {

	public static String high(String s) {
		String[] words = s.split(" ");
		return Arrays.stream(words).max((w1, w2) -> calculateScore(w1) - calculateScore(w2)).get();
	}
	
	private static int calculateScore(String word) {
		return word.chars().map(charValue -> Character.getNumericValue(charValue)-9).reduce(0, Integer::sum);
	}

	// More solutions
}
