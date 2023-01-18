package com.codewars.katas.kyu7;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

public class Accumul {
	public static String accum(String s) {
		AtomicInteger count = new AtomicInteger(1);
		return s.toLowerCase().chars()
						.mapToObj(character -> accumulate(count, character))
						.collect(Collectors.joining("-"));
	}
	
	private static String accumulate(AtomicInteger count, int letter) {
		return StringUtils.capitalize(StringUtils.repeat((char) letter, count.getAndIncrement()));
	}
}
