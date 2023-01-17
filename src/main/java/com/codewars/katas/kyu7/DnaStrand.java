package com.codewars.katas.kyu7;

import java.util.stream.Collectors;

public class DnaStrand {
	
	public static String makeComplement(String dna) {	
		return dna.chars().mapToObj(DnaStrand::complementOf).collect(Collectors.joining());
	}
	
	public static String complementOf(int dnaInt) {
		
		char dnaChar = (char) dnaInt;
		
		String dnaComplement = null;
		
		switch(String.valueOf(dnaChar)) {
			case "A": dnaComplement = "T"; break;
			case "T": dnaComplement = "A"; break;
			case "C": dnaComplement = "G"; break;
			case "G": dnaComplement = "C"; break;
		}
		
		return dnaComplement;
		
	}
	
	// More solutions: https://www.codewars.com/kata/554e4a2f232cdd87d9000038/solutions/java
}
