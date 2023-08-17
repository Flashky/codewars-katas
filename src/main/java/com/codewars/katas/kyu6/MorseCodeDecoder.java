package com.codewars.katas.kyu6;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

/**
 * <strong>Kata:</strong> <a href="https://www.codewars.com/kata/54b724efac3d5402db00065e/solutions/java">Decode the Morse code</a>
 */
public class MorseCodeDecoder {
	
	private static final String MORSE_WHITESPACE = "   ";
	
    public static String decode(String morseCode) {
        return Arrays.stream(morseCode.trim().split(MORSE_WHITESPACE))
        		.map(MorseCodeDecoder::decodeWord)
        		.collect(Collectors.joining(StringUtils.SPACE));
    }
    
    private static String decodeWord(String morseWord) {
    	return Arrays.stream(morseWord.split(StringUtils.SPACE))
    			.map(MorseCode::get)
    			.collect(Collectors.joining());
    }
}
