package com.codewars.katas.kyu4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * <strong>Kata:</strong> <a href="https://www.codewars.com/kata/5263c6999e0f40dee200059d/train/java">The observed PIN</a>
 */
public class ObservedPin {

	private static Map<Character, Set<Character>> alternativeDigits;
	
	static {
		alternativeDigits = new HashMap<>();
		alternativeDigits.put('0', Set.of('0','8'));
		alternativeDigits.put('1', Set.of('1','2','4'));
		alternativeDigits.put('2', Set.of('2','1','3','5'));
		alternativeDigits.put('3', Set.of('3','2','6'));
		alternativeDigits.put('4', Set.of('4','1','5','7'));
		alternativeDigits.put('5', Set.of('5','2','4','6','8'));
		alternativeDigits.put('6', Set.of('6','3','5','9'));
		alternativeDigits.put('7', Set.of('7','4','8'));
		alternativeDigits.put('8', Set.of('8','0','5','7','9'));
		alternativeDigits.put('9', Set.of('9','6','8'));
	}
	
    public static List<String> getPINs(String observed) {
    	List<String> pins = new ArrayList<>();
    	generatePins(pins, observed, 0);
    	return pins.stream().distinct().collect(Collectors.toList());
     } // getPINs
    
 
    private static void generatePins(List<String> generatedPins, String generatedPin, int currentPinIndex) {
    	
    	generatedPins.add(generatedPin);
    	
    	if(currentPinIndex < generatedPin.length()) {
	
	    	char[] pin = generatedPin.toCharArray();
	    	char pinDigit = pin[currentPinIndex];
	    	
			for(char alternativePinDigit : alternativeDigits.get(pinDigit)) {
				pin[currentPinIndex] = alternativePinDigit;
				generatePins(generatedPins, new String(pin), currentPinIndex+1);
			}
    	}
    }

}
