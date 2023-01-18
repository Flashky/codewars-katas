package com.codewars.katas.kyu6;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * <strong>Kata:</strong> <a href="https://www.codewars.com/kata/54b42f9314d9229fd6000d9c/train/java">Duplicate Encoder</a>
 * @author bruizv
 *
 */
public class DuplicateEncoder {
	public static String encode(String word){
		
		String lowerCaseWord = word.toLowerCase();
		Map<Integer, Long> charCount = lowerCaseWord.chars().boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		return lowerCaseWord.chars().boxed().map(t -> charCount.get(t) == 1 ? "(" : ")").collect(Collectors.joining());

	}
	
}
