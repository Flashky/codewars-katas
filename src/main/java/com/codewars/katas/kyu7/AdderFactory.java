package com.codewars.katas.kyu7;

import java.util.function.IntUnaryOperator;

/**
 * <strong>Kata:</strong> <a href="https://www.codewars.com/kata/54a6d39a478d8e07e4000b69/train/java">Java Functional Programming (Part 3: Closured for Business)</a>
 */
public class AdderFactory {
	  /*
	   * Make the "create" method (public, static). It accepts one parameter (int addTo) and returns
	   * a function (make sure to use the appropriate type). This function accepts an integer,
	   * adds "addTo" to that integer, and returns the result as an integer (integer-to-integer function).
	   */
	public static IntUnaryOperator create(int addTo) {
		return i -> i + addTo;
	}
}
