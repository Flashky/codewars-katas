package com.codewars.katas.kyu6;


import java.util.Arrays;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindUnique {
    public static double findUniq(double arr[]) {
    	return Arrays.stream(arr)
    		.boxed()
    		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
    		.entrySet()
    		.stream()
    		.filter(entry -> entry.getValue() == 1)
    		.map(Entry::getKey)
    		.findFirst()
    		.get();
    }
    
    // More solutions: https://www.codewars.com/kata/585d7d5adb20cf33cb000235/solutions/java

    // Downsides
    // https://www.codewars.com/kata/585d7d5adb20cf33cb000235/solutions#5ecd0cc31dbe7e001fda5ba9:
    // - groupingBy has a time complexity of O(nlog(n))(similar to sorting), so ultimately this isn't an effecient solution as you can solve it with a linear time complexity. 
    
}
