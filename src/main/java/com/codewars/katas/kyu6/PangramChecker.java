package com.codewars.katas.kyu6;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author Flashk
 * @see https://www.codewars.com/kata/545cedaa9943f7fe7b000048
 */
public class PangramChecker {
	
	// There are 26 letters in the English alphabet which range from 'a' to 'z' 
	// (with b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, and y in between).
	
	private final static int ALPHABET_LETTERS_COUNT = 26;
	private final static String ALPHABET_LETTER_PATTERN = "[a-zA-Z]";
	
	public boolean check(String sentence){
		
		// Not enough letters in the sentence means it is not a pangram
		if((sentence == null) || (sentence.length() < ALPHABET_LETTERS_COUNT)) {
			return false;
		}
		
		return checkRecursive(sentence, 0, new HashSet<String>());
	}
	
	private boolean checkRecursive(String sentence, int currentIndex, Set<String> letterOccurrences) {
		
		// Base case Ok: all letters have at least one occurrence 
		if(letterOccurrences.size() == ALPHABET_LETTERS_COUNT) {
			return true;
		}
		
		// Base case Ko: no panagram found
		if(currentIndex >= sentence.length()) {
			return false;
		}
		
		String currentLetter = String.valueOf(sentence.charAt(currentIndex));
		
		if(currentLetter.matches(ALPHABET_LETTER_PATTERN)) {
			letterOccurrences.add(currentLetter.toLowerCase());
		}
		
		return checkRecursive(sentence, ++currentIndex, letterOccurrences);
		
	}
	
	// Otras soluciones propuestas por otros usuarios
	
	// Usando lambdas:
	// public boolean check(String sentence){
    // 	return sentence.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count() == 26;
  	// }
	 
}
