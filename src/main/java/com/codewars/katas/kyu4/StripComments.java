package com.codewars.katas.kyu4;

import java.util.stream.Collectors;

public class StripComments {
	
	public static String stripComments(String text, String[] commentSymbols) {
		
		return text.lines()
				.map(line -> StripComments.strip(commentSymbols, line))
				.collect(Collectors.joining("\n"));

	}

	private static String strip(String[] commentSymbols, String line) {
		
		for(String commentSymbol : commentSymbols) {
			if(line.contains(commentSymbol)) {
				line = line.substring(0, line.indexOf(commentSymbol));
			}
		}
		
		return line.stripTrailing();
	}
	
}
