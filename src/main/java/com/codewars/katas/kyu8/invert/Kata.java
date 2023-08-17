package com.codewars.katas.kyu8.invert;

import java.util.Arrays;

/**
 * <strong>Kata:</strong> <a href="https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad/train/java">Invert values</a>
 */
public class Kata {
	public static int[] invert(int[] array) {
		return Arrays.stream(array).map(v -> -v).toArray();
	}
}
