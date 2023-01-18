package com.codewars.katas.kyu7.reversewords;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

/**
 * <strong>Kata:</strong> <a href="https://www.codewars.com/kata/5259b20d6021e9e14c0010d4/solutions/java">Reverse words</a>
 */
public class Kata {

	public static String reverseWords(final String original) {		
		return (original.isBlank()) ? original : Arrays.stream(original.split(StringUtils.SPACE))
														.map(StringUtils::reverse)
														.collect(Collectors.joining(StringUtils.SPACE));
	}
}
