package com.codewars.katas.kyu6.arraydiff;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <strong>Kata:</strong> <a href="https://www.codewars.com/kata/523f5d21c841566fde000009/train/java">Array.diff</a>
 */
public class Kata {

	public static int[] arrayDiff(int[] a, int[] b) {
		
		List<Integer> aList = Arrays.stream(a).boxed().collect(Collectors.toList());
		List<Integer> bList = Arrays.stream(b).boxed().collect(Collectors.toList());
		aList.removeAll(bList);
		
		return aList.stream().mapToInt(v -> v).toArray();
		
	}
	
	// Soluciones interesantes:
	// - Uso de IntStream.of (en lugar de Arrays.stream(a).boxed) y noneMatch para hacer el filtrado en una línea:
	// https://www.codewars.com/kata/reviews/607acdf72529c5000111fea4/groups/607acdf82529c5000111fea8
	// La pega de esta solución es que invoca al stream N veces, aumentando la complejidad.
}
