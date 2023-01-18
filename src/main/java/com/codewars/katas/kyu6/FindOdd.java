package com.codewars.katas.kyu6;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * <strong>Kata:</strong> <a href="https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java">Find the odd int</a>
 * @author flash
 *
 */
public class FindOdd {
	public static int findIt(int[] a) {
		return Arrays.stream(a)
						.boxed()
						.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
						.entrySet()
						.stream()
							.filter(entry -> entry.getValue() % 2 != 0)
							.findAny()
							.get()
							.getKey();
	}
	
	// Soluciones interesantes:
	// - Comparación usando operador XOR (^):
	// https://www.codewars.com/kata/reviews/54da5d0598b8a2ad76000246/groups/54da5d0598b8a2ad76000248
}
