package com.codewars.katas.kyu6;

import java.util.List;

/**
 * <strong>Kata:</strong> <a href="https://www.codewars.com/kata/583203e6eb35d7980400002a/solutions/java">Count the smiley faces!"</a>
 * @author flash
 *
 */
public class SmileFaces {

	public static int countSmileys(List<String> arr) {
		return (int) arr.stream().filter(value -> value.matches("([:;][-~]?[)D])")).count();
	}
	
}
