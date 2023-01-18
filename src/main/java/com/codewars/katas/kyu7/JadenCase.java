package com.codewars.katas.kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

/**
 * <strong>Kata:</strong> <a href="https://www.codewars.com/kata/5390bac347d09b7da40006f6/train/java">Jaden Casing Strings</a>
 */
public class JadenCase {
	
	public String toJadenCase(String phrase) {
		
		if(StringUtils.isBlank(phrase)) {
			return null;
		}
		
		return Arrays.stream(phrase.split(StringUtils.SPACE)).map(StringUtils::capitalize).collect(Collectors.joining(StringUtils.SPACE));
	}
	
	// Soluciones interesantes:
	// - Usar WordUtils.capitalize(phrase) de Apache Commons Lang 3:
	// https://www.codewars.com/kata/reviews/54a603b28e5c31717100003e/groups/5b730e49d96c59837f00560d
	// 
	// Básicamente el código se podría reducir a esto otro
	// https://www.codewars.com/kumite/5c93f5e437f830000ef48401?sel=63c8086d2c5f28151043a1e4
	
}
