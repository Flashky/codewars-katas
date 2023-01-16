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
}
