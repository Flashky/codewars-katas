package com.codewars.katas.kyu5;

import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

public class DragonsCurve {
	//Make the function; map the chars to Strings
	//a -> aRbFR, b -> LFaLb, otherwise -> itself
	public IntFunction<String> mapFunction = n -> {
		
		if(n == 'a') {
			return "aRbFR";
		} else if(n == 'b') {
			return "LFaLb";
		}
		
		return String.valueOf((char) n);
	};

	/**
	* Make the curve; stream the chars repeatedly (starting with Fa) through the mapFunction n times
	* Then remove the a and b (createFilter function is useful for that)
	*/
	public String createCurve(int n) {
		
		String curve = "Fa";
		for(int i = 0; i < n; i++) {
			curve = curve.chars().mapToObj(mapFunction).collect(Collectors.joining());
		}
		
		return curve.chars()
				.filter(createFilter('a', false).and(createFilter('b', false)))
				.mapToObj(letter -> String.valueOf((char) letter))
				.collect(Collectors.joining());
	}
	
	  /**
	   * How many of the specified char are in the given curve?
	   * Hint: createFilter could be useful for this
	   */
	public long howMany(char c, String curve) {
		return curve.chars().filter(createFilter(c, true)).count();
	}
	  
	  
	/**
	 * Create a predicate to filter the specified char; keep or remove based on keep variable
	 */
	public IntPredicate createFilter(char filterWhat, boolean keep) {
		return keep ? value -> value == filterWhat : value -> value != filterWhat; 
	}
	
}
