package com.codewars.katas.kyu6;

import java.util.HashMap;
import java.util.Map;

public class MorseCode {

	private static final Map<String, String> codes = new HashMap<>();
	
	static {
		codes.put(".-", "A");
		codes.put("-...", "B");
        codes.put("-.-.", "C");
        codes.put("-..", "D");
        codes.put(".", "E");
        codes.put("..-.", "F");
        codes.put("--.-", "G");
        codes.put("....", "H");
        codes.put("..", "I");
        codes.put(".---", "J");
        codes.put("-.-", "K");
        codes.put(".-..", "L");
        codes.put("--", "M");
        codes.put("-.", "N");
        codes.put("---", "O");
        codes.put(".--.", "P");
        codes.put("--.-", "Q");
        codes.put(".-.", "R");
        codes.put("...", "S");
        codes.put("-", "T");
        codes.put("..-", "U");
        codes.put("...-", "V");
        codes.put(".--", "W");
        codes.put("-..-", "X");
        codes.put("-.--", "Y");
        codes.put("--..", "Z");
	}
	
	public static String get(String morse) {
		return codes.get(morse);
	}
}
