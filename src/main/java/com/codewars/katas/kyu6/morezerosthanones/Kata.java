package com.codewars.katas.kyu6.morezerosthanones;

import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

/**
 * <strong>Kata:</strong> <a href="https://www.codewars.com/kata/5d41e16d8bad42002208fe1a/train/java">More Zeros than Ones</a>
 */
public class Kata {
	
	public static char[] moreZeros(String s) {

		return s.chars()
				.distinct()
				.mapToObj(Kata::intToBinary)
				.filter(Kata::hasMoreZeros)
				.map(Kata::binaryToString)
				.collect(Collectors.joining())
				.toCharArray();

	}
	
	public static String intToBinary(int charValue) {
		String value = String.valueOf((char) charValue);
		byte bytes = value.getBytes()[0];
		return Integer.toBinaryString(bytes);
	}
	
	public static String binaryToString(String binary) {
		return String.valueOf((char)Integer.parseInt(binary,2));
	}
	
	public static boolean hasMoreZeros(String binary) {
		int length = binary.length();
		int zeros = binary.replaceAll("1", StringUtils.EMPTY).length();
		int ones = length - zeros;
		return zeros > ones;
	}
}
