package com.codewars.katas.kyu6;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * <strong>Kata:</strong> <a href="https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/java">Your order, please</a>
 */
public class Order {
	
	private static final String WHITESPACE = " ";
	private static final Pattern DIGIT_PATTERN = Pattern.compile("(\\d)");
	
	public static String order(String phrase) {
		
		if(phrase.isBlank()) {
			return "";
		}
		
		String[] words = phrase.split(WHITESPACE);
		
		Map<String, String> wordMap = new HashMap<>();
	
		for(String word : words) {
			Matcher digitMatcher = DIGIT_PATTERN.matcher(word);
			digitMatcher.find();
			wordMap.put(digitMatcher.group(1), word);
		}
		
		return wordMap.values().stream().collect(Collectors.joining(WHITESPACE));
		
	}
}
